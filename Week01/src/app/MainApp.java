package app;

import controller.AppController;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AppController appController = new AppController(sc);

        appController.run();
    }
}
