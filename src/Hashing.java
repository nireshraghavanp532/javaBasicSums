
import java.util.Hashtable;


public class Hashing {
    public static void main(String[] args) {
        Hashtable <String,String>tab=new Hashtable<>();
        //HashMap<String,String>map= new HashMap<>();
        tab.put("Name","Niresh");
        tab.put("Age","21");
        tab.put("Cities","Chennai");
        tab.put("Cities","Bangalore");

        System.out.println(tab);
        System.out.println(tab.values());
        System.out.println(tab.keySet());
        System.out.println(tab.size());
    }
}
