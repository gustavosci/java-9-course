package course.java9.jokeserver;

//import java.sql.*;
import java.util.List;

public interface JokeServer {
    int availableJokes();
    String getJoke();
    String name();
    int getKey();
}