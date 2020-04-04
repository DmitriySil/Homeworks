package Homework.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class SingleTime extends Membership {

    protected LocalTime visitTime = LocalTime.of(8,0);
    protected LocalTime endTime = LocalTime.of(22,0);
    protected Boolean pool = true;
    protected Boolean gym = true;
    protected Boolean groupLess = false;


    public SingleTime(LocalDate regDate, LocalDate endDate, String name, String surName, int yearOfBirth) {
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
