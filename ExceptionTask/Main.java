package Homework.ExceptionTask;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

/*Метод static void throwException(Status status) throws JarException, FileNotFoundException,
AccessDeniedException принимает на вход enum и выбрасывает следующие исключения в зависимости от
значения status:
если status FILE_NOT_FOUND, выбрасывает FileNotFoundException
если status ACCESS_DENIED, выбрасывает AccessDeniedException
если status JAR_ERROR, выбрасывает JarException.
При вызове метода throwException обработать исключения следующим образом: FileNotFoundException -
выводить в консоль сообщение исключения(метод getMessage()) + любое дополнительное сообщение,
 AccessDeniedException - выводить в консоль сообщение исключения (метод getMessage()) и снова
 выбрасывать exception, JarException - выводить в консоль стек трейс.

enum Status с необходимыми константами нужно создать.*/
public class Main {
    public static void main(String[] args) {

        try {
            Exception.throwException(Status.ACCESS_DENIED);
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE_NOT_FOUND " + e.getMessage());
        }
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            try {
                throw new AccessDeniedException("Reason").initCause(e);
            } catch (Throwable throwable) {
                System.out.println("Catch in catch " + throwable.getCause());
            }
        }
        catch (JarException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


enum Status{
    FILE_NOT_FOUND,ACCESS_DENIED,JAR_ERROR


}