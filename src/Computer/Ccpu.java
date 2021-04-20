package Computer;

public class Ccpu implements Cpu{
    String cpupaizi;
    double cpuzp;
    public void setCpupaizi(String cpupaizi) {
        this.cpupaizi = cpupaizi;
    }

    public void setCpuzp(double cpuzp) {
        this.cpuzp = cpuzp;
    }


    @Override
    public String getPinPai() {
        return cpupaizi ;
    }

    @Override
    public double getZhuPin() {
        return cpuzp;
    }
}
