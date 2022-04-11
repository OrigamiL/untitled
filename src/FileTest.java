import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FileTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\doc\\untitled\\src\\out.txt",true);
            byte[] bytes = new byte[]{97,98,99,100};
            fos.write(bytes,0,2);
            //写完刷新
            String  s = "张三李四";
            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("zhang");
            arrayList.add("wang");
            for (String value : arrayList) {
                fos.write(value.getBytes());
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
