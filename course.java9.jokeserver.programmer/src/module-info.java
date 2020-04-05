module course.java9.jokeserver.programmer {
    requires course.java9.jokeserver;
    // exports course.java9.jokeserver.programmer;

    provides course.java9.jokeserver.JokeServer with course.java9.jokeserver.programmer.ProgrammerJokeServer;
}