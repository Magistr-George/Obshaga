import java.util.ArrayList;
import java.util.HashMap;

public class Obsh {
    private ArrayList<Room> listOfRooms;
    private HashMap<String, String> listOfGuys = new HashMap<>();

    public Obsh(ArrayList<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public boolean settling(HashMap<String,String> listOfGuys)
    {
        boolean success = true;


        for(HashMap.Entry<String,String> item : listOfGuys.entrySet()){
            boolean succ = false;
            for(int j = 0; j < listOfRooms.size(); j++){
                if(item.getValue() == listOfRooms.get(j).getSex())
                    if(listOfRooms.get(j).isFull() == false)
                    {
                        listOfRooms.get(j).settling(item.getKey());
                        succ = true;
                    }
            }
            if(succ == false)
            {
                for(int j = 0; j < listOfRooms.size(); j++){
                    if(listOfRooms.get(j).getSex() == "Unisex")
                        if(listOfRooms.get(j).isFull() == false)
                        {
                            listOfRooms.get(j).settling(item.getKey());
                            succ = true;
                        }
                }
            }
        }

        return success;
    }

    @Override
    public String toString() {
        return "Obsh{" +
                "\nlistOfRooms=" + listOfRooms +
                "\nlistOfGuys=" + listOfGuys +
                '}';
    }
}