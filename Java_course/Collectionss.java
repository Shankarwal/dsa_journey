import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class Collectionss {
    public static void main(String[] args) {
        // Collection can not use Indexing
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(4);
        nums.add(6);
        nums.add(10);

        for (int i = 0;i < nums.size(); i++) {
            // int num = nums.get(i); // Shows error cause Collection does not have Indexing
            // If we want to get values by index we can use List

             int num = nums.get(i);
            System.out.println(num);
        }
    }
}
