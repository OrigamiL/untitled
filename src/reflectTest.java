public class reflectTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.String");
            String s = "abc";
            Class x = s.getClass();
            System.out.println(c == x);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
