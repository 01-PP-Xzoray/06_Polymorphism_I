package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        output(queen.DoYourJob());
        output(worker.DoYourJob());
        output(drone.DoYourJob());

    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}