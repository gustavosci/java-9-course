module course.java9.jokeui {
    requires course.java9.jokeserver;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    uses course.java9.jokeserver.JokeServer;

    opens course.java9.jokeui to javafx.fxml, javafx.graphics; // only open the package and define to who this is open
}