package com.alpha.work3;

import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;

    public TrainSchedule(int quantityTains){
        this.trains = new Train[quantityTains];
    }

    public TrainSchedule() {

    }

    public Train[] addTrain(){
        Train train = new Train();
        Train[] trains = null;

        System.out.println("Введите количесво поездов: ");
        int quantityTains = new Scanner(System.in).nextInt();
        new TrainSchedule(quantityTains);

        for (int i = 0;i<quantityTains;i++) {
            System.out.println("Введите данные поезда: \n" + "Введие номер поезда:");
            train.setNumber(new Scanner(System.in).nextInt());
            System.out.println("Введите станцию назначения:");
            train.setStationArrival(new Scanner(System.in).nextLine());
            System.out.println("Введите станцию оправки: ");
            train.setStationDispatch(new Scanner(System.in).nextLine());
            System.out.println("Введите время прибытия:");
            train.setTimeArrival(new Scanner(System.in).nextLine());
            System.out.println("Введите время оправления:");
            train.setTimeDispatch(new Scanner(System.in).nextLine());

            this.trains = new Train[]{train};
        }
        return this.trains;
    }
    public void printTrains(Train[] trains){
        for (Train t:
                this.trains) {
            System.out.println(t);
        }

    }
}
