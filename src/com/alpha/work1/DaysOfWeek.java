package com.alpha.work1;

public enum DaysOfWeek {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int day;

     DaysOfWeek(int i) {
      this.day = i;
    }
    int nextDay(){
         if (this.day==6) {
             return this.day-= 6;
         }else {
            return this.day++;
         }
    }

    public int getDay() {
        return day;
    }
}
