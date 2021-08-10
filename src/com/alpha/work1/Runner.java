package com.alpha.work1;

public class Runner {
    public void run(){
        WriteEnum();
    }
    public void WriteEnum(){

        for (int i = 0; i<DaysOfWeek.values().length;i++){
            System.out.println(DaysOfWeek.values()[i]);
        }


    }
}
