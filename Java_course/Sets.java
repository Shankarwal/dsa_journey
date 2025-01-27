// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Collection unique values, unsorted, no indexing
        // Set<Integer> nums = new HashSet<Integer>();

        // Collection unique values, sorted, no indexing
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(6);
        nums.add(8);
        nums.add(4);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }   
}
