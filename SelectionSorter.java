import ArrayUtil.ArrayUtil;

public class SelectionSorter {
    //sorts an array using selection to sort.
    //@param a the array to sort

    public static void sort(int[] a) {
        for( int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }
    /* finds the smallest element in a tail range of array.
    @param a the array to sort
    @param from the first position in a to compare
    @return the position of the smallest element in the range [a]from . . . a[a.length - 1]
    */
    private static int minimumPosition(int[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) {minPos = i;}
        }
        if (a[i] < a[minPos]) { minPos = i;}
    }
    return minPos;
}
