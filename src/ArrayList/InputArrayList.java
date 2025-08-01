package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter -1 to stop taking the input :- ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1)
                break;
            list.add(num);
        }
        System.out.println("You entered : " + list);
    }
}