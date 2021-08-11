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

        System.out.println("Введие один из дней SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        if (day.equals("SUNDAY")||day.equals("MONDAY")||
        day.equals("TUESDAY")||day.equals("WEDNESDAY")||
        day.equals("THURSDAY")||day.equals("FRIDAY")||day.equals("SATURDAY"))
        {
            DaysOfWeek daysOfWeek;
            daysOfWeek = DaysOfWeek.valueOf(day);
            daysOfWeek.nextDay();
            System.out.println(DaysOfWeek.values()[daysOfWeek.getDay()]);
        } else {
            System.out.println("Неверный ввод! ");
            WriteNextDay();
        }



        }

    }




