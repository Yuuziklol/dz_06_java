import java.util.HashMap;
import java.util.Iterator;

/**
 * dz_06
 */
public class dz_06 {

    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(2);
        mySet.add(12);
        mySet.add(23);
        mySet.add(153);
        mySet.add(94);
        System.out.println(mySet);
        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }
    }
}
class MySet{
    private HashMap<Integer,Object> map = new HashMap<>();
    private final Object OBJ = new Object();
    @Override
    public String toString() {
        return map.keySet().toString();
    }
    public boolean add(Integer i) {
        return map.put(i,OBJ) != null?true : false;
    }
    public Integer size() {
        return map.keySet().size();
    }
    public Integer get(Integer a){
        return (Integer) map.keySet().toArray()[a];
    }
}