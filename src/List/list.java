package List;

import java.util.*;

public class list {
    public static void main(String[] args) {

        List<String> lists = Arrays.asList("yellow","red","green", "blue");
//        Collections.sort(lists, Collections.reverseOrder());
        System.out.println(lists);
//        System.out.println(Collections.binarySearch(lists,"blue"));

        System.out.println(Collections.binarySearch(lists,"blue"));

        List<Integer> IntergerList = Arrays.asList(2,4,5,8,0,13,5353,636,7);

        System.out.println(Collections.binarySearch(IntergerList,2));


    }
}
