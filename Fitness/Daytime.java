package Homework.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class Daytime extends Membership {

    protected LocalTime visitTime = LocalTime.of(8,0);
    protected LocalTime endTime = LocalTime.of(15,0);
    protected Boolean pool = false;
    protected Boolean gym = true;
    protected Boolean groupLess = true;


    public Daytime(LocalDate regDate, LocalDate endDate, String name, String surName, int yearOfBirth) {
        super(regDate, endDate, name, surName, yearOfBirth);
    }

    @Override
    public LocalTime getVisitTime() {
        return visitTime;
    }

    @Override
    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public Boolean getPool() {
        return pool;
    }

    @Override
    public Boolean getGym() {
        return gym;
    }

    @Override
    public Boolean getGroupLess() {
        return groupLess;
    }
}
