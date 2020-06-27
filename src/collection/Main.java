package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
    Collection
    - List
        - ArrayList
        - LinkedList
        - Vector
          - Stack
    - Sets
      - Hashset
      - LinkedHashset
      - SortedSet
        - Tree Set
   - Queue
      - PriorityQueues
      - Deque
       - ArrayDeque

     */

    public static void main(String[] args) {
        // write your code here

        Threater threater = new Threater("OMOLM", 19, 19);
        Threater.reserveSeat("A12");
        Threater.reserveSeat("L12");
        Threater.reserveSeat("L12");
        Threater.reserveSeat("E12");
        Threater.reserveSeat("F12");
        Threater.reserveSeat("J12");

//        List<Threater.Seat> SortList = new ArrayList<>(threater.getSeats());
//        Collections.sort(SortList);
//        printList(SortList);


        List<Threater.Seat> priceSeats = new ArrayList<>(threater.getSeats());
        priceSeats.add(new Threater.Seat("BOO", 13.00));
        priceSeats.add(new Threater.Seat("A00", 13.00));
        Collections.sort(priceSeats, threater.Price_Order);
        printList(priceSeats);








//        Collections.shuffle(seatCopy);
//        System.out.print("Printing seatCopy");
//        printList(seatCopy);
//        System.out.print("Printing Threater.seat");
//        printList(threater.seats);
//
//        Threater.Seat minset = Collections.min(seatCopy);
//        Threater.Seat maxset = Collections.max(seatCopy);
//
//        System.out.println(maxset.getSeatNumber());
//        System.out.println(minset.getSeatNumber());
//
//        System.out.println("Sorted SeatCopy");
//
//        printList(seatCopy);





    }

    public static void printList(List<Threater.Seat> list){
        for(Threater.Seat seat: list){

            System.out.println("Seat Number : " + seat.getSeatNumber() + "  Price:     $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===================================================");
     }


//     public static void sortedList(List<? extends Threater.Seat> list){
//        for(int i = 0; i<list.size() - 1; i++){
//            for (int j = i+1; j<list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i, j);
//                }
//            }
//        }

}
