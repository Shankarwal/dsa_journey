import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // for Unsynchronized use HashMap
        Map<String, Integer> data = new HashMap<String, Integer>();

        data.put("ram", 10);
        data.put("sham", 20);
        data.put("maan", 15);
        data.put("ram", 12);

        System.out.println(data);

        for(String name: data.keySet()) {
            System.out.println(name + " : " + data.get(name));
        }

        // for Synchronized use HashTable other than they are almost same
        Map<String, Integer> data1= new Hashtable<String, Integer>();

        data1.put("ram", 10);
        data1.put("sham", 20);
        data1.put("maan", 15);
        data1.put("ram", 12);

        System.out.println(data1);

        for (String name : data1.keySet()) {
            System.out.println(name + " : " + data1.get(name));
        }
    }   
}
