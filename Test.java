public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2200);
        cpu.setPrice(3600.0);
        HardDisk HD = new HardDisk(2048);
        HD.setSpeed(1000.0);
        PC pc = new PC(cpu);
        pc.setHD(HD);
        pc.setCpu(cpu);
        pc.setHD(HD);
        pc.show();
    }
}
