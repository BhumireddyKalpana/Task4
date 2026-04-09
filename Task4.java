import java.util.*;
class Room {
    int roomNo;
    String type;
    boolean isBooked;
    Room(int roomNo, String type) {
        this.roomNo = roomNo;
        this.type = type;
        this.isBooked = false;
    }
}
public class Task4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));
        while (true) {
            System.out.println("\n1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Room r : rooms) {
                        System.out.println(r.roomNo + " - " + r.type +" - " + (r.isBooked ? "Booked" : "Available"));
                    }
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int bookNo = sc.nextInt();
                    for (Room r : rooms) {
                        if (r.roomNo == bookNo && !r.isBooked) {
                            r.isBooked = true;
                            System.out.println("Room booked successfully!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter room number: ");
                    int cancelNo = sc.nextInt();
                    for (Room r : rooms) {
                        if (r.roomNo == cancelNo && r.isBooked) {
                            r.isBooked = false;
                            System.out.println("Booking cancelled!");
                        }
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
