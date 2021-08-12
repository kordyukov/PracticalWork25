package com.alpha.work1;

import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public void run(){
//        writeEnum();
//        DaysOfWeek1 daysOfWeek1 = DaysOfWeek1.FRIDAY;
//        System.out.println(daysOfWeek1);
        weeksLeanJava();
//        System.out.println("--------------------------------------------------------------");
       writeNextDay();


    }
    public void writeEnum(){
        for (DaysOfWeek1 d: DaysOfWeek1.values()) {
            System.out.println(d);
        }

//        for (int i = 0; i<DaysOfWeek.values().length;i++){
//            System.out.println(DaysOfWeek.values()[i]);
//        }

    }
    public void weeksLeanJava(){
        System.out.println("Дни обучения Java: ");
        for (DaysOfWeek1 d: DaysOfWeek1.values()) {
            switch (d){
                case FRIDAY: case MONDAY: case WEDNESDAY:
                    System.out.println(d);
            }
        }
//        System.out.println("\nДни обучения Java: \n"+DaysOfWeek.MONDAY+
//                           "\n"+DaysOfWeek.WEDNESDAY+"\n"+ DaysOfWeek.FRIDAY);
    }

    public void writeNextDay(){

        System.out.println("Введие один из дней SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        DaysOfWeek1 daysOfWeek1 = DaysOfWeek1.valueOf(day.toUpperCase());
        System.out.println(daysOfWeek1.nextDay());
//        if (day.equals("SUNDAY")||day.equals("MONDAY")||
//        day.equals("TUESDAY")||day.equals("WEDNESDAY")||
//        day.equals("THURSDAY")||day.equals("FRIDAY")||day.equals("SATURDAY"))
//        {
//            DaysOfWeek daysOfWeek;
//            daysOfWeek = DaysOfWeek.valueOf(day);
//            daysOfWeek.nextDay();
//            System.out.println(DaysOfWeek.values()[daysOfWeek.getDay()]);
//        } else {
//            System.out.println("Неверный ввод! ");
//            writeNextDay();
//        }



        }

    }




