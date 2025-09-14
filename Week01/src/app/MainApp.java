package app;

import controller.AppController;
import controller.CarChoiceController;
import model.Car;
import model.F1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AppController appController = new AppController(sc);




        Thread t = new Thread(() -> {
        try {
            while (true) {
                System.out.print("\n[Weather] Cloud\n");
                Thread.sleep(5000); // 1초마다 반복
            }
        } catch (InterruptedException e) {
            return;
        }
});

        t.start();
        appController.run(t);
    }
}
