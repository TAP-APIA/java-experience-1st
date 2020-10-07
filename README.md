# Java_experiment_2nd
######  计191_董梓潇_2019310187_实验二
# 一、实验目的：
### 明晰java中类与对象的组成
# 二、实验要求：
### 1.基本要求：完成教材p110 第四题关于PC模拟的程序；
### 2.附加要求：
### a)类中定义不少于两个构造方法；
### b)每个类定义不少于2个属性；
### c)完成课堂中关于访问权限的内容，且定义的方法内应该有符合常理的逻辑判断；
### d)尝试把本次实验的多个类放置在不同的包中；
# 三、操作过程：
### （1）根据课本上的要求、课本上的提示和所学的基础知识，首先创建出三个类分别为：PC、CPU、HardDisk和测试类Test。
### （2）根据题目要求在CPU类中设置成员变量speed、name、hertz和factory，在HardDisk中设置成员变量amount、shape、size和ID。
### （3）在CPU类和HardDisk类中各设置8个方法，针对于四个变量的get和set方法，用来对所接受的参数进行逻辑判断并将符合逻辑判断的参数，利用this关键字将该参数赋值给该类中的成员变量，如果逻辑判断不符合就用else给出相应的提示信息。
### （4）在set方法中利用if和else语句进行逻辑判断，在get方法中利用retrun返回该类中的成员变量。
###  (5) 利用privat关键字对成员变量。
### （6）在类中定义出多个构造方法。在构造方法中调用set方法。
### （7）在PC类中用CPU类创建cPU成员变量和用HardDisk类创建hardDisk成员变量。
### （8）在PC类中定义两个构造方法，用来将所接收的CPU类和HardDisk类的参数，并在构造方法中调用set方法和利用this关键字对cPU和hardDisk成员变量赋值。
### （9）在PC类中定义名为show的方法并利用对象.get方法来打印对象cPU和对象hardDisk的属性信息。
### （10）在Test类中利用构造方法CPU创建cPU对象并进行初始化，利用HardDisk构造方法创建hardDisk对象并进行初始化，利用PC构造方法创建pc对象并进行初始化。
### （11）在Test类中利用对象.set的方法对对象的成员变量赋值。
### （12）在Test类中利用对象.方法的来调用show方法，来打印数据。
# 四、核心代码：
### 1.CPU类的构造方法的定义：
```
    CPU(int speed) {
        setSpeed(speed);

    }

    CPU(double price) {
        setPrice(price);
    }
```
### 2.HardDisk类中的set和get方法的定义：
```
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

```
### 3.PC类中定义设置CPU对象和HardDisk对象的值的构造方法：
```
PC(CPU cpu){
    setCpu(cpu);
}
PC(HardDisk HD){
    setHD(HD);
}
```
### 4.Test类中用构造方法创建对象时的初始化：
```
 CPU cpu = new CPU(2200);
        cpu.setPrice(3600.0);
        HardDisk HD = new HardDisk(2048);
        HD.setSpeed(1000.0);
```
# 五、实验结果：
![实验结果截图](https://github.com/TAP-APIA/java-experience-1st/blob/main/e1e3f31f6955d5397def11202624a4d.png)
# 六、实验感想：
### 明晰了类与对象的概念，以及其组成。对java面向对象的编程方式有了更好的了解。
