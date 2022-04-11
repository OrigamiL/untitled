import java.util.*;
@MyAnnotation(name = "lisi",password = "456")
public class MapTest {
    @MyAnnotation(name = "zhangSan",password = "123")
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"zhang");
        map.put(7,"li");
        map.put(12,"wang");
       // Collection<Integer> keys = map.keySet();
      //  List<Integer> arrayList = new ArrayList<>(keys);
/*        for (Integer key:
             keys) {
            System.out.println(key + "=" + map.get(key));
        }*/
        /*for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + "=" + map.get(arrayList.get(i)));
        }*/
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
