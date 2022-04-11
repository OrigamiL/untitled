import java.util.ArrayList;

public class OutputTest {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Object());
        A t1 = new A(arrayList);
        B t2 = new B(arrayList);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
class A extends Thread {
    private ArrayList arrayList;

    public A(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (arrayList) {
                if (arrayList.size()%2 == 0) {
                    try {
                        arrayList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->"+arrayList.size());
                arrayList.add(new Object());
                arrayList.notifyAll();
            }
        }
    }
}
class B extends Thread {
    private ArrayList arrayList;

    public B(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (arrayList) {
                if (arrayList.size()%2 == 1) {

                    try {
                        arrayList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->"+arrayList.size());
                arrayList.add(new Object());
                arrayList.notifyAll();
            }
        }
    }
}