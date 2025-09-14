package model;



interface Drivable{
    void axel();
    void brake();
    void start();
}

interface Moniter{
    void showCarName();
    void menu();
    void showSpeed();

    void showScreen();
}

interface BasicSpeedControl{
    void speedUp(int km);
    void speedDown(int km);
}

public abstract class Car implements Drivable, Moniter, BasicSpeedControl {
    protected String name;
    protected int speed;
    protected int axelSpeed;
    protected int breakSpeed;
    protected int maxSpeed;


    public Car(String name, int axelSpeed, int breakSpeed, int maxSpeed) {
        this.name = name;
        this.speed = 0;
        this.axelSpeed = axelSpeed;
        this.breakSpeed = breakSpeed;
        this.maxSpeed = maxSpeed;
    }

    public synchronized int getSpeed() {
        return speed;
    }

    @Override
    public synchronized void showScreen(){
        System.out.println();
        showCarName();
        System.out.println();
        showSpeed();
        System.out.println();

        menu();
    }

    @Override
    public synchronized void axel(){
        this.speed=Math.min(this.speed+this.axelSpeed,this.maxSpeed);
    }


    @Override
    public synchronized void brake(){
        this.speed=Math.max(0,this.speed-this.breakSpeed);
    }


    @Override
    public void showCarName(){
        System.out.print(
                "🚗\nCar Name : "+this.name+
                " (Max Speed :"+this.maxSpeed+")");
    }

    @Override
    public synchronized void showSpeed(){
        System.out.print("Now Speed : \"" + this.speed+"\"");
    }

    @Override
    public synchronized  void speedUp(int km){
        this.speed=Math.min(this.speed+this.axelSpeed,this.maxSpeed);
    }

    @Override
    public synchronized  void speedDown(int km){
        this.speed=Math.max(0,this.speed-km);
    }
}


