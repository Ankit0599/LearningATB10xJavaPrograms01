package ex_019_OOPS_Constructor;

public class LAB161_Cons_B2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1);
        System.out.println(a2);
    }
}

class A{
    A(){
        System.out.println("DC");
    }
}
