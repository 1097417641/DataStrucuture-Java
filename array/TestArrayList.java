package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // for (int i = 0; i < list.size(); i++) {
        //     list.remove(i);
        // }
        // for (Integer value : list) {
        //     list.remove(value);
        // }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
