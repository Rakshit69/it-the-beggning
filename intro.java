public class intro {
    public static boolean issort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        int i = 0;
        boolean c = false;
        for (i = 0; i < arr.length-1 ; i++) {//1 2 3 4//0 3
            //2,1
            if (arr[i] < arr[i + 1]) {
                c = true;
            } else {
                return false;
            }
            

            //3  4 5




        }
return true;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 70 };
        System.out.println(issort(arr));
    }
}
