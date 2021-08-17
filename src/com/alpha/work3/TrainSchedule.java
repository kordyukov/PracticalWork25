package com.alpha.work3;

import java.util.Locale;
import java.util.Scanner;


public class TrainSchedule {
    private Train[] trains;
    private int countTrain = 0;



    public  TrainSchedule(int quantityTains){

        this.trains = new Train[quantityTains];
        this.countTrain = quantityTains;

    }

    TrainSchedule(){

    }

    public Train[] addTrain(){
        String numberTrain;

        for (int i = 0;i<trains.length;i++) {
            System.out.println("Введите данные поезда: \n" + "Введие номер поезда - целое, не отрицательное  число:");
            numberTrain = new Scanner(System.in).next();
            Train train = new Train(Integer.parseInt(validateNumberTrain(numberTrain)));
            System.out.println("Введите станцию назначения:");
            train.setStationArrival(new Scanner(System.in).next());
            System.out.println("Введите станцию оправки: ");
            train.setStationDispatch(new Scanner(System.in).next());
            System.out.println("Введите время прибытия:");
            train.setTimeArrival(new Scanner(System.in).next());
            System.out.println("Введите время отправления:");
            train.setTimeDispatch(new Scanner(System.in).next());
            train.setDaysOfWeeks(enterDaysOfWeeks(validateDaysOfWeeks()));

            trains[i] = train;
        }

        return trains;

    }
    public static void printTrains(Train[] trains){
        for (Train t:  trains) {
            System.out.println(t);
        }

    }

    public DaysOfWeek[] enterDaysOfWeeks(String str){
        String[]strings = str.split(", " );
        DaysOfWeek[] daysOfWeeks = new DaysOfWeek[strings.length];
         for (int i = 0;i<daysOfWeeks.length;i++){
             daysOfWeeks[i] = DaysOfWeek.valueOf(strings[i]);
         }
         return daysOfWeeks;
    }

    public Train[] getTrains() {
        return trains;
    }

    public String validateNumberTrain(String numberTrain){
        while (!Runner.validationNumber(numberTrain)){
            System.out.println("Введите данные поезда: \n" + "Введие номер поезда - целое, не отрицательное  число:");
            numberTrain = new Scanner(System.in).nextLine();
        }
        return numberTrain;
    }
    public String validateDaysOfWeeks(){
        String daysOfWeeks;
        System.out.println("Введите дни отправления через запятую , " +
                "например SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY" +
                ":");
        daysOfWeeks = new Scanner(System.in).nextLine();

        return daysOfWeeks;
    }

     public Train[] searchTrains(Train[] trains){
       Train[] train = new Train[trains.length];
       int count = 0;
       System.out.println("Введите станцию назначения: ");
        String stationArrival = new Scanner(System.in).next();
         for (Train t: trains) {
          if (t.getStationArrival().equals(stationArrival)) {
              train[count] = t;
              count++;
          }
         }
         return train;
       // System.out.println("введите день недели: ");

    }




}
