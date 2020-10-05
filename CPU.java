import sun.reflect.generics.tree.VoidDescriptor;

public class CPU {
    private int speed;
    private double price;

    CPU(int speed) {
        setSpeed(speed);

    }

    CPU(double price) {
        setPrice(price);
    }

    void setSpeed(int speed) {
        if (speed>0)
        this.speed = speed;
        else System.out.println("CPU速度有误");
    }

    void setPrice(double price) {
        if (price>0)
        this.price = price;
        else System.out.println("CPU报价有误");
    }

    int getSpeed() {
        return speed;
    }

    double getPrice() {
        return price;
    }
}
