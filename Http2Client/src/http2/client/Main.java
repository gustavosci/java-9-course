package http2.client;

import jdk.incubator.http.*;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "http://www.example.com";
        getURLSync(url);
        postURLSync(url);
        getURLASync(url);

    }

    public static void getURLSync(String url) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder(new URI(url))
                .GET()
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandler.asString());

        processResponse(response);
    }

    public static void postURLSync(String url) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse response = client.send(
                HttpRequest.newBuilder(new URI(url))
                        .headers("Foo", "foovalue", "Bar", "barValue")
                        .POST(HttpRequest.BodyProcessor.fromString("Some string"))
                        .build(),
                HttpResponse.BodyHandler.asFile(Paths.get("fileXXXX.txt")));

        processResponse(response);
    }

    public static void getURLASync(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        CompletableFuture<HttpResponse<String>> compFuture = client.sendAsync(
                HttpRequest
                        .newBuilder(new URI(url))
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString());

        System.out.println("Async request has been made...");

        while(!compFuture.isDone()) {
            System.out.println("Do something else while we wait...");

            /*
                if (someCondition ) {
                    compFuture.cancel(true);
                    System.out.println("Async request has been cancelled");
                }
            */
        }

        System.out.println("Async request is done...");
        processResponse(compFuture.get());
    }

    public static void processResponse(HttpResponse response) {

        System.out.println("Status Code: " + response.statusCode());

        System.out.println("Headers:");

        HttpHeaders headers = response.headers();
        Map<String, List<String>> headerList = headers.map();
        headerList.forEach((k, v) -> System.out.println("\t" + k + ":" + v));

        System.out.println("Body:\n" + response.body());
    }
}
