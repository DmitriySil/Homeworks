package Homework.ExceptionTask;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Exception {
 private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
                this.status = status;
    }

    static void throwException(Status status) throws JarException, FileNotFoundException,
            AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)){
            throw new FileNotFoundException();
        }
        if (status.equals(Status.ACCESS_DENIED)){
            throw new AccessDeniedException("");
        }
        if (status.equals(Status.JAR_ERROR)){
            throw new JarException();
        }
    }
}
