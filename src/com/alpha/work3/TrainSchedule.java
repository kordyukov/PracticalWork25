package com.alpha.work3;

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

        for (int i = 0;i<trains.length;i++) {
            System.out.println("Введите данные поезда: \n" + "Введие номер поезда:");
            Train train = new Train(new Scanner(System.in).nextInt());
            System.out.println("Введите станцию назначения:");
            train.setStationArrival(new Scanner(System.in).next());
            System.out.println("Введите станцию оправки: ");
            train.setStationDispatch(new Scanner(System.in).next());
            System.out.println("Введите время прибытия:");
            train.setTimeArrival(new Scanner(System.in).next());
            System.out.println("Введите время оправления:");
            train.setTimeDispatch(new Scanner(System.in).next());
            trains[i] = train;
        }

        return trains;

    }
    public void printTrains(Train[] trains){
        for (Train t: this.trains) {
            System.out.println(t);
        }

    }

    public Train[] getTrains() {
        return trains;
    }


}
