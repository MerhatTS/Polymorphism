public class ABC {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        b.m1();
        c.m2();
        a.m3();
        System.out.println("");
        a2.m1();
        a2.m2();
        a2.m3();
    }
}

class A {
    int var = 7;

    public void m1(){
        System.out.printf("A - m1, ");
    }
    public void m2(){
        System.out.printf("A - m2, ");
    }
    public void m3(){
        System.out.printf("A - m3, ");
    }
}

class B extends A{
    public void m1(){
        System.out.printf("B - m1, ");
    }
}

class C extends B{
    public void m3(){
        System.out.printf("C - m3, "+(var + 6));
    }
}
