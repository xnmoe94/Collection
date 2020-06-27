package collection;

import java.util.*;

public class Threater {
    private final String threaterName;
    public static List<Seat> seats = new ArrayList<Seat>();

    static final Comparator<Seat> Price_Order;

    static {
        Price_Order = new Comparator<Seat>() {

            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat1.getPrice()) {
                    return -1;

                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;

                } else {
                    return 0;
                }


            }
        };
    }

    public Threater(String threaterName, int numRows, int seatsPerRow) {
        this.threaterName = threaterName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;

                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }



                Seat seat = new Seat( row + String.format("%02d", seatNum), price);

                seats.add(seat);

            }
        }

    }

    public String getTheaterName() {
        return threaterName;


    }

    public static boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;

        }
    }

    public Collection<Seat> getSeats(){
       return seats;
    }

   static class Seat implements  Comparable<Seat> {
        private final String seatNumber;
        public boolean reserved = false;
        private double price;




        Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;

        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());

        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

       public double getPrice() {
           return price;
       }

       public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " Reserved" );
                return true;
            }else {
                System.out.println("Seat is reserved, Look for another one. Thanks");
                return false;

            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " Cancelled");
                return true;

            }else{
                return false;

            }
        }


    }
}


