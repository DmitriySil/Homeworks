package Homework.EnumTasks;
/* Дано
    1.  enum должностей Position,
    2.  класс User со следующими полями:
        String fulName;
        int salary;
        Position position;
    3. несколько массивов, в каждом массиве будут храниться объекты класса User
    с одинаковыми должностями

    Пользователь вводит свои имя, фамилию и первую букву должности.
    Ваша задача создать объект типа User и поместить его в соответствующий массив.*/
public class User {
    private String fulName;
    private int salary;
    private Position position;

    public User(String fulName) {
        this.fulName = fulName;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
