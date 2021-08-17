package com.alpha.work3;

import java.util.Scanner;

public class Runner {
    public void run() {
     createTrains();



    }
    public void createTrains() {
        System.out.println("Введите количесво поездов (целое число - не отрицаельное значение): ");
        String quantityTains = new Scanner(System.in).next();
        if(validationNumber(quantityTains)){
            System.out.println("ok");
        }else{
            createTrains();
        }
        TrainSchedule trainSchedule = new TrainSchedule(Integer.parseInt(quantityTains));
        trainSchedule.printTrains(trainSchedule.searchTrains(trainSchedule.addTrain()));


    }

   public static boolean validationNumber(String str){
       return str.matches("[+]?\\d*(\\d+)?");
   }



}
