package com.zt.generics;

import java.time.LocalDate;
import java.util.List;

public class DateInterval extends Pair<LocalDate>{

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
}
