package ArrayUtil;
import java.util.Random;
public class ArrayUtil {
    private static Random generator = new Random();
    /*
    Creates an array filled with random values
    @Param lewngth the length of an array
    @param n the number of possibile random values
    @return an array filled with lenght numbers between 0 and n-1
    */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        for( int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }
    public static void swap(int [] a, int i, int j) {
        int temp = a[i];
        
        a[i] = a[j];
        a[j] = temp;
    }
}

