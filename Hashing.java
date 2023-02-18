import java.util.HashSet;
import java.util.Iterator;


public class Hashing {

    public static void main(String arg[]){
        HashSet<Integer> set = new HashSet<>();


        //Insert Value in Hashset
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(8);
        set.add(8);  //list.add(el)

        // Hash Does not contain duplicate Value like 8 ,8 is duplicate value
        System.out.println(set);


        //Search use to container in Hashset
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set don't contain 6");
        }

        //Delete Hash Value in HashSet
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set Don't contain 1 _ we remove 1");
        }


        //Size of set is in the HashSet
        System.out.println("Size of set is "+set.size());


        //Print all elements
        System.out.println(set);


        //Iterator in Hashset
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.hasNext());
        }

    }
}