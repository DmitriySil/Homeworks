package Homework.Collection;

// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплете
// имени, зарплете, возрасту и компании

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Employee implements Comparable<Employee>{
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Company: "+company + ", Sallery: "+salary+", Age: "+age+"\n";
    }

    // TODO: конструктор, геттеры и сеттеры

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int ageRandom = random.nextInt(40)+21;
            int salRandom = random.nextInt(10000)+5000;
            employees.add(new Employee(salRandom,ageRandom)); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        int i = 0;
        for (Employee emp:employees) {
        emp.setName(names[i]);
        emp.setCompany(companies[i]);
        i++;
        }
        employees.sort(new employeeNameComparator().thenComparing(new employeeSalleryComparator()).
                thenComparing(new employeeEgeComparator()).thenComparing(new employeeCompanyComparator()));
        employees.forEach(System.out::println);
        return employees;
    }

    @Override
    public int compareTo(Employee o) {
        return getName().compareTo(o.getName());
    }
}

class employeeNameComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class employeeSalleryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(),o2.getSalary());
    }
}

class employeeEgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}

class employeeCompanyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}