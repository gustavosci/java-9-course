open module course.java9.jokeui {
    requires course.java9.jokeserver;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    uses course.java9.jokeserver.JokeServer;
}