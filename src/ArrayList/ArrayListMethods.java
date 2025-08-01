package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        //Defining or Initialization of ArrayList;
        ArrayList<Integer> List = new ArrayList<Integer>();
        ArrayList<String> List2 = new ArrayList<String>();
        ArrayList<Boolean> List3 = new ArrayList<Boolean>();

        //add Elements
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);

        System.out.println(List);

        //get Elements
        int element = List.get(0);
        System.out.println(element);

        //add element in between
        List.add(1, 1);
        System.out.println(List);

        //set element
        List.set(0, 5);
        System.out.println(List);

        //delete element
        List.remove(3);
        System.out.println(List);

        //size of ArrayList;
        int size = List.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < List.size(); i++){
            System.out.println(List.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(List);
        System.out.println(List);
    }
}
