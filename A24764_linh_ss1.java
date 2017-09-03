public class linh {

    public static void main(String[] args) {
        System.out.println("Lam Khanh Linh\tA24764\tTI27\tlamlinh1707@gmail.com");
        for(int i=9; i>=1; i--)
        {
        	System.out.println(i +" bottles of beer on the wall, "+ i + "bottles of beer.");
        	System.out.println("Take one down, pass it around,");
        }
        System.out.println("/nUoc chung lon:");
        System.out.println(UCLN(51,85));
        System.out.println("So Fibonaci la:");
        System.out.println(fibonacci(12));
    }

    public static int UCLN(int a, int b) {
        while (a != b) {
               if (a > b)
                     a = a - b;
               else
                     b = b - a;
        }
        return (a);
 }
    public static int fibonacci(int n) {
        if ((n == 1) || (n == 2)) {
               return 1;
        } else {
               int arr[] = new int[n];
               arr[0] = 1;
               arr[1] = 1;
               for (int i = 2; i < arr.length; i++) {
                     arr[i] = arr[i - 1] + arr[i - 2];
               }
               return arr[n-1];
        }

 }
    	
    	
}
