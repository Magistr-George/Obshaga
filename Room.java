import java.util.ArrayList;

public class Room {
    private int capacityOfRoom;                 // 2-3
    private boolean isFull = false;             // 1 - full 0 - isnt full
    private String sex;                         // Man Woman Unisex
    private ArrayList<String> listOfGuys;

    public boolean isFull() {
        return isFull;
    }
    public void setFull(boolean full) {
        isFull = full;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Room(int capacityOfRoom, String sex) {
        listOfGuys = new ArrayList<>();
        this.capacityOfRoom = capacityOfRoom;
        this.sex = sex;
    }

    public void settling(String guy){
        this.listOfGuys.add(guy);
        if(this.capacityOfRoom == this.listOfGuys.size())
            isFull = true;
    }

    public boolean check(){
        return this.isFull;
    }

    @Override
    public String toString() {
        return "Room{" +
                "\ncapacityOfRoom=" + capacityOfRoom +
                ", \nisFull=" + isFull +
                "\nsex='" + sex + '\'' +
                "\nlistOfGuys=" + listOfGuys +
                '}';
    }
}