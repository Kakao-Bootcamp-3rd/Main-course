package model;

public abstract class RacingCar extends Car {

    public RacingCar(String name, int axelSpeed, int breakSpeed, int maxSpeed){
        super(name, axelSpeed, breakSpeed, maxSpeed);
    }
    public void boster(){
        this.speed=Math.min(this.speed+(this.axelSpeed*2),this.maxSpeed);
    };
}
