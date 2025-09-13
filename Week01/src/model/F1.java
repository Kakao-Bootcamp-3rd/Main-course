package model;

import constants.CarSpecs;

import java.util.Scanner;


public class F1 extends RacingCar{
    Scanner sc = new Scanner(System.in);

    public F1(){
        super(
                "F1",
                CarSpecs.F1_AXEL_SPEED,
                CarSpecs.F1_Break_SPEED ,
                CarSpecs.F1_MAX_SPEED);
    }

    @Override
    public void menu(){
        System.out.print(
                "---------------------\n"+
                "1 : One Accelerate (Speed : +"+this.axelSpeed+")\n" +
                "2 : One Boster     (Speed : +"+this.axelSpeed*2+")\n" +
                "3 : One Break      (Speed : "+this.breakSpeed+")\n" +
                "4 : Pit Stop       (Speed : 0)\n" +
                "5 : End\n"+
                "---------------------\n"+
                        "-> "
        );
    }

    public void pitStop(){
        this.speed=0;
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
                    this.pitStop();
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
