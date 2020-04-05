module course.java9.jokeserver.kid {
    requires course.java9.jokeserver;
    //exports course.java9.jokeserver.kid;

    provides course.java9.jokeserver.JokeServer with course.java9.jokeserver.kid.KidJokeServer;
}