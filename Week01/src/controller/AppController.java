package controller;

import model.Car;
import java.util.Scanner;

public class AppController {
    private final Scanner sc;
    private final CarChoiceController carChooser;
    private final SimulatorController simulator;

    public AppController(Scanner sc) {
        this.sc = sc;
        this.carChooser = new CarChoiceController(sc);
        this.simulator = new SimulatorController(sc);
    }

    public void run() {
        while (true) {
            Car car = carChooser.chooseCar();   // ① 차량 선택
            simulator.run(car);              // ② 시뮬레이터 실행

            System.out.print("\nDo you want to select a Car again? (y/n): ");
            String ans = sc.next().trim().toLowerCase();
            if (!ans.equals("y")) {
                System.out.println("[Exit Program]");
                break;
            }
        }
    }
}
