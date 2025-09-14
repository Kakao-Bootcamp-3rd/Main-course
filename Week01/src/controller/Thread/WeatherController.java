package controller.Thread;

import constants.Weather;

import java.util.Random;

public class WeatherController {
    private Thread thread;
    private final Random rnd = new Random();

    public void run(){
            thread = new Thread(()->{
                while(true) {
                    try {
                        Weather w = Weather.values()[rnd.nextInt(Weather.values().length)];
                        System.out.print("\n[Now Weather] " + w.getLabel() + "\t(Speed -" + -w.getMinusSpeed() + ")\n");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            });
        thread.start();
    }
    public void stop(){
        thread.interrupt();
    }

}
