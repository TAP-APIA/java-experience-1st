public class HardDisk {
    private int Amount;
    private double speed;

    HardDisk(int Amount) {
        setAmount(Amount);
    }

    HardDisk(double speed) {

        setSpeed(speed);
    }

    int getAmount() {
        return Amount;
    }

    double getSpeed() {
        return speed;
    }

    void setSpeed(double speed) {
        if (speed>0)
        this.speed = speed;
        else System.out.println("硬盘速度有误");
    }

    void setAmount(int Amount) {
        if (Amount>0)
        this.Amount = Amount;
        else System.out.println("硬盘容量有误");
    }
}
