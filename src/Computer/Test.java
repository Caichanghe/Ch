package Computer;

public class Test {
    public static void main(String[] args) {
        Ccpu ccpu=new Ccpu();
        Eems eems=new Eems();
        HhardDisk hhardDisk=new HhardDisk();
        ccpu.setCpupaizi("Inter");
        ccpu.setCpuzp(2.9);
        eems.setEmsType("DDR4");
        eems.setEmssize(128);
        hhardDisk.setCapacity(8);
        System.out.println("计算机的信息如下：");
        System.out.println("cpu的品牌是："+ccpu.getPinPai()+"主频："+ccpu.getZhuPin());
        System.out.println("内存类型为："+eems.getEMSType()+"内存容量："+eems.getSize()+"GB");
        System.out.println("硬盘的容量为："+hhardDisk.getCapacity()+"T");
    }
}
