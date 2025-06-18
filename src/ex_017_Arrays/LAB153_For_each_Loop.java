package ex_017_Arrays;

public class LAB153_For_each_Loop {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 98;
        a[1] = 67;
        a[2] = 89;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        for (int i : a){
//            System.out.println(i);
//        }

        String [] names = {"Ankit", "Shri", "Sourabh", "Atharva"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
