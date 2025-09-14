package model;


import constants.CarSpecs;

import java.util.Scanner;


public class F2 extends RacingCar{
    boolean onSafetyMode;

    Scanner sc = new Scanner(System.in);

    public F2(){
        super(
                "F2",
                CarSpecs.F2_AXEL_SPEED,
                CarSpecs.F2_Break_SPEED ,
                CarSpecs.F2_MAX_SPEED);
    }

    @Override
    public void menu(){
        System.out.print(
                "---------------------\n"+
                "1 : One Accelerate (Speed : +"+this.axelSpeed+")\n" +
                "2 : One Boster     (Speed : +"+this.axelSpeed*2+")\n" +
                "3 : One Break      (Speed : "+this.breakSpeed+")\n" +
                "4 : Safety Mode    (Speed : Limit 200)\n" +
                "5 : End\n"+
                "---------------------\n"+
                        "-> "
        );
    }







    public void safetyMode(){
        if(this.onSafetyMode){
            onSafetyMode=false;
            this.maxSpeed=CarSpecs.F2_MAX_SPEED;
        }
        else{
            onSafetyMode=true;
            this.speed=Math.min(CarSpecs.F2_SAFETY_MODE_SPEED,this.speed);
            this.maxSpeed=CarSpecs.F2_SAFETY_MODE_SPEED;
        }
    }


    @Override
    public void start(){        // 해당 부분을 컨트롤러에 넣을 수 있지만 시간이 개발시 시간이 너무 소요될 것으로 판단해 하드 코딩 -> 시간 나면 Map 자료형 반환하는 형식으로 구현하고 해당 부분 컨트롤러에 구현 예정
        while(true){
            this.showScreen();
            int n = sc.nextInt();
            switch (n){
                case 1:
                    this.axel();
                    break;
                case 2:
                    this.boster();
                    break;
                case 3:
                    this.brake();
                    break;
                case 4:
                    this.safetyMode();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Wrong number\n");
                    break;
            }
        }
    }
}
