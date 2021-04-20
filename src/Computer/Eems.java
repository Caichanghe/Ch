package Computer;

public class Eems implements Ems {
    String emsType;
    int emssize;
    public void setEmsType(String emsType) {
        this.emsType = emsType;
    }

    public void setEmssize(int emssize) {
        this.emssize = emssize;
    }


    @Override
    public String getEMSType() {
        return emsType;
    }

    @Override
    public int getSize() {
        return emssize;
    }
}
