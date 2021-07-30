import java.util.ArrayList;
        import java.util.HashMap;

public class Main {
    public static void main(String []args) {

        HashMap<String, String> listOfGuys = new HashMap<>();

        listOfGuys.put("Zhora","Man");
        listOfGuys.put("Dima","Man");
        listOfGuys.put("Anya","Woman");
        listOfGuys.put("Yura","Man");

        ArrayList<Room> listOfRooms = new ArrayList<>();

        listOfRooms.add(new Room(2,"Man"));
        listOfRooms.add(new Room(2,"Woman"));
        listOfRooms.add(new Room(2,"Unisex"));

        Obsh hotel = new Obsh(listOfRooms);

        System.out.println(hotel.settling(listOfGuys));     //Success settling?
        System.out.println(hotel);
    }
}