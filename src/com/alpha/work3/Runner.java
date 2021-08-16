package com.alpha.work3;

import java.util.Scanner;

public class Runner {
    public void run() {
    createTrains();


    }
    public void createTrains() {
        System.out.println("Введите количесво поездов: ");
        int quantityTains = new Scanner(System.in).nextInt();
        TrainSchedule trainSchedule = new TrainSchedule(quantityTains);
        trainSchedule.printTrains(trainSchedule.addTrain());


    }
}
