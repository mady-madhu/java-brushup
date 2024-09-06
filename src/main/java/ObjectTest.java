import org.example.inheritance.A;
import org.example.inheritance.B;

public class ObjectTest {
static
    {
        System.out.println("static");
    }
    {
        System.out.println("instance block");
    }

    public ObjectTest(int i){
        System.out.println("int constructor");
    }

    public void m1(String str){
        System.out.println("str");
    }

    public void m1(Object o){
        System.out.println("obect");
    }

    public static void main(String[] args) {
        ObjectTest e = new ObjectTest(10);
        e.m1(null);

        A a = new A(1);
        a.m1();
        A a1 = new B(10);
        a1.m1();

        B b = new  B(10);
        b.m1();
        b.m2();



    }
}
