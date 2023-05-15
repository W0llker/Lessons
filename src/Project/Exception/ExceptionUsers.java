package Project.Exception;

import Project.StartMenu.Start;

public class ExceptionUsers extends RuntimeException {
    public ExceptionUsers(String message) {
        System.err.println(message);
        Start.menu();
    }
}
