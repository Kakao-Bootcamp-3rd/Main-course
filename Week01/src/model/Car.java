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

public abstract class Car implements Drivable, Moniter {
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


    @Override
    public void showScreen(){
        System.out.println();
        showCarName();
        System.out.println();
        showSpeed();
        System.out.println();

        menu();
    }

    @Override
    public void axel(){
        this.speed=Math.min(this.speed+this.axelSpeed,this.maxSpeed);
    }


    @Override
    public void brake(){
        this.speed=Math.max(0,this.speed-30);
    }


    @Override
    public void showCarName(){
        System.out.print("Car Name : "+this.name+" (Max Speed :"+this.maxSpeed+")");
    }

    @Override
    public void showSpeed(){
        System.out.print("Now Speed : \"" + this.speed+"\"");
    }



}


