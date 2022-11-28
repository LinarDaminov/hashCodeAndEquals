package AnotherTasks;
import java.util.*;
public class homeWorkTwo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(20);
        Random random = new Random();
        while (set.size() < 20) {
            set.add(random.nextInt(1000));
        }
        System.out.println(set);
        Iterator<Integer> numberIterator = set.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number%2!=0) {
                numberIterator.remove();
            }
        }
        System.out.println(set);


        ArrayList<Integer> arrayList;
        LinkedList<Integer> linkedList;
        HashMap<Integer,Integer> hashMap;
     //hashMap затратит меньше времени т.к. Асимптотическая сложность - O(1) - линейная сложность, для остальных
        //классов интерфейса List сложность составляет 0(n)
        // has
    }



    }

