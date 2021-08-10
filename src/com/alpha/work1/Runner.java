package com.alpha.work1;

import java.util.Scanner;

public class Runner {
    public void run(){
        WriteEnum();
        WeeksLeanJava();
        System.out.println("--------------------------------------------------------------");
        WriteNextDay();


    }
    public void WriteEnum(){

        for (int i = 0; i<DaysOfWeek.values().length;i++){
            System.out.println(DaysOfWeek.values()[i]);
        }

    }
    public void WeeksLeanJava(){
        System.out.println("\nДни обучения Java: \n"+DaysOfWeek.MONDAY+
                           "\n"+DaysOfWeek.WEDNESDAY+"\n"+ DaysOfWeek.FRIDAY);
    }

    public void WriteNextDay(){
        DaysOfWeek daysOfWeek;
        System.out.println("Введие один из SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day){
            case "SATURDAY":
                 daysOfWeek = DaysOfWeek.SATURDAY;
                daysOfWeek.nextDay();
                System.out.println("Следующий день недели: "+ DaysOfWeek.values()[daysOfWeek.getDay()]);
              break;

        case "SUNDAY":
         daysOfWeek = DaysOfWeek.SUNDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;

        case "MONDAY":
         daysOfWeek = DaysOfWeek.MONDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;

        case "TUESDAY":
         daysOfWeek = DaysOfWeek.TUESDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;

        case "WEDNESDAY":
         daysOfWeek = DaysOfWeek.WEDNESDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;

        case "THURSDAY":
         daysOfWeek = DaysOfWeek.THURSDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;

        case "FRIDAY":
         daysOfWeek = DaysOfWeek.FRIDAY;
        daysOfWeek.nextDay();
        System.out.println("Следующий день недели: "+DaysOfWeek.values()[daysOfWeek.getDay()]);
        break;
            default:
                System.out.println("Некоретно введен день! Введие один из  " +
                        "SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY");
                WriteNextDay();
        }

    }

    }


