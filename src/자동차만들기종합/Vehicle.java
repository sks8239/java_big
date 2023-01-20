package 자동차만들기종합;

import java.util.Scanner;

public abstract class Vehicle {
    protected int speed;
    protected int mileage;
    protected int oilTank;
    protected int seat;
    protected String carName;
    protected int passCnt;

    public void setName(String carName) {
        this.carName = carName;
    }

    public String getName() {
        return carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getOilTank() {
        return oilTank;
    }

    public void setOilTank(int oilTank) {
        this.oilTank = oilTank;
    }
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    abstract void addFunc();

    int getMoveCnt(int passCnt){
        if(passCnt % seat !=0) return (passCnt/seat) + 1;
        return passCnt / seat;
    }
}
