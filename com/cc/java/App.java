package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        // output(queen.DoYourJob());
        // output(worker.DoYourJob());
        // output(drone.DoYourJob());

        pollobj(queen);
        pollobj(worker);
        pollobj(drone);
    }

    private static void pollobj(Queen obj) {
         output(obj.DoYourJob());
    }
   
    private static void pollobj(Worker obj) {
         output(obj.DoYourJob());
    }
    
    private static void pollobj(Drone obj) {
         output(obj.DoYourJob());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}