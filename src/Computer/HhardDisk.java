package Computer;

public class HhardDisk implements HardDisk{
    int Capacity;
    public void setCapacity(int capacity) {
        Capacity = capacity;
    }


    @Override
    public int getCapacity() {
        return Capacity;
    }
}
