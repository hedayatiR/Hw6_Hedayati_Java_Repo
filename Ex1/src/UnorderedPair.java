import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnorderedPair {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your list of numbers with comma seperation(without space):");
        String list_str = input.next();
        String[] parts = list_str.split(",");
        for (int i = 0; i < parts.length; i++) {
            list.add(Integer.parseInt(parts[i]));
        }

        System.out.println("Input: " + list.toString());
        removeUnorderedPairs(list);
        System.out.println("Output: " + list.toString());
    }

    public static void removeUnorderedPairs(ArrayList<Integer> list){
        if (list.isEmpty())
            return;
        else if (list.size() % 2 != 0)
            list.remove(list.size() - 1);

        if (list.isEmpty()) // if list cintains just one number, remove it and return
            return;

        // we start from the end of arraylist
        // because it can be a little more efficient due to copy of smaller internal arrays
        for (int i=(list.size()-1); i>0; i-=2)
        {
            if (list.get(i-1)>list.get(i)) {
                list.remove(i);
                list.remove(i - 1);
            }
        }

    }
}
