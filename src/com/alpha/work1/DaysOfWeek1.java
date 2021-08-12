package com.alpha.work1;

public enum DaysOfWeek1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    public DaysOfWeek1 nextDay(){
        int i = this.ordinal() + 1;
        if (i == DaysOfWeek1.values().length){
            i = 0;
        }
        return DaysOfWeek1.values()[i];



    }

}
