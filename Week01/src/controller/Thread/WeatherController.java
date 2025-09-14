package controller.Thread;

import constants.Weather;
import model.Car;

import java.util.Random;

public class WeatherController {
    private Thread thread;
    private final Random rnd = new Random();
    private final Car car;


    public WeatherController(Car car){
        this.car = car;
    }

    public void run(){
            thread = new Thread(()->{
                while(true) {
                    try {
                        Weather w = Weather.values()[rnd.nextInt(Weather.values().length)];
                        car.speedDown(-w.getMinusSpeed());
                        System.out.print(
                                "\n\n🧚🏻‍♀️\n[Now Weather] " +
                                w.getLabel() +
                                "\t(Speed -" +
                                -w.getMinusSpeed() +
                                ")\n[Now Speed] "+
                                car.getSpeed()+"km\n");
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
