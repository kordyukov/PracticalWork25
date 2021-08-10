package com.alpha.work1;

public enum DaysOfWeek {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int day;

     DaysOfWeek(int i) {
      this.day = i;
    }
    void nextDay(){
         if (this.day==6) {
             this.day-= 6;
         }else {
             this.day++;
         }
    }

    public int getDay() {
        return day;
    }
}
