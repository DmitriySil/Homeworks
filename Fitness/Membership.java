package Homework.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class Membership {
    protected LocalDate regDate ;
    protected LocalDate endDate ;
    protected LocalTime visitTime;
    protected LocalTime endTime;
    protected Boolean pool;
    protected Boolean gym;
    protected Boolean groupLess;
    protected String name;
    protected String surName;
    protected int yearOfBirth;
// попробовать без конструкторов задать значения,вконструкторе только имя и тд


    public Membership(LocalDate regDate, LocalDate endDate, String name, String surName, int yearOfBirth) {
        this.regDate = regDate;
        this.endDate = endDate;
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Boolean getPool() {
        return pool;
    }

    public Boolean getGym() {
        return gym;
    }

    public Boolean getGroupLess() {
        return groupLess;
    }

    @Override
    public String toString() {
        return "Membership{" +
                ", Фамилия='" + surName + '\'' +
                ", Имя='" + name + '\'' +
                '}';
    }
}
