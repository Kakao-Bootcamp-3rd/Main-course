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

        appController.run();
    }
}
