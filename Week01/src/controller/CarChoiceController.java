package controller;

import model.Car;
import model.F1;
import model.F2;
import java.util.Scanner;

public class CarChoiceController {

    private final Scanner sc;

    public CarChoiceController(Scanner sc) {
        this.sc = sc;
    }

    public Car chooseCar() {
        System.out.println("=== Choose Car ===");
        System.out.println("1. F1");
        System.out.println("2. F2");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: return new F1();
            case 2: return new F2();
            default:
                System.out.println("Wrong Choice → Default F1");
                return new F1();
        }
    }
}
