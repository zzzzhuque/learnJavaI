package com.zt.generics;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class DateInterval extends Pair<LocalDate>{

    public DateInterval() {

    }

    public DateInterval(LocalDate first, LocalDate second) {
        super(first, second);
    }

    @Override
    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }

    @Override
    public LocalDate getSecond() {
        return (LocalDate)super.getSecond();
    }

    public static void main(String[] args) {

        DateInterval dateInterval = new DateInterval(LocalDate.now(), LocalDate.now().plusDays(1L));

        DateInterval dateInterval1 = new DateInterval();


        System.out.println(dateInterval.getSecond());
    }
}
