import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("MapTest");
        Method method = c.getDeclaredMethod("main",String[].class);
        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.name()+":"+myAnnotation.password());
        }
        if(c.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.name()+":"+myAnnotation.password());
        }
    }
}
