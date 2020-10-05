public class PC {
    private CPU cpu;
    private HardDisk HD;
PC(CPU cpu){
    setCpu(cpu);
}
PC(HardDisk HD){
    setHD(HD);
}
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }

    public void show() {
        System.out.println(cpu.getSpeed() + "\n" + cpu.getPrice() + "\n" + HD.getAmount() + "\n" + HD.getSpeed());
    }
}
