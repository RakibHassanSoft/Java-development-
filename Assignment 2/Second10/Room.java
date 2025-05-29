package Second10;

public class Room {
    int number, capacity;

    Room(int n, int c) {
        number = n;
        capacity = c;
    }

    public static void main(String[] args) {
        Room[] rooms = {
            new Room(101, 4),
            new Room(102, 6),
            new Room(103, 8)
        };

        System.out.println("Rooms with capacity > 5:");
        for (Room r : rooms) {
            if (r.capacity > 5) {
                System.out.println("Room " + r.number + ": Capacity " + r.capacity);
            }
        }
    }
}

