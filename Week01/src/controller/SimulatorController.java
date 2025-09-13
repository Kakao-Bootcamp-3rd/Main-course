package controller;

import model.Car;
import java.util.Scanner;

public class SimulatorController {
    private final Scanner sc;

    SimulatorController(Scanner sc){
        this.sc=sc;
    }

    public void run(Car car) {
            car.start();
    }
}
