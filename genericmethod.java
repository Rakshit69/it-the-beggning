/**
 * genericmethod
 */

public class genericmethod {
    public static <T>  void gen(T[] a) {
    System.out.println(a);
}

public static void main(String[] args) {
    int[] a = new int[2];
        //gen(a);
    }
}