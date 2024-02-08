import java.util.Arrays;

public class practise {
    public static int rank(int target, int[] array){
        int low = 0;
        int hi = array.length - 1;
        while (low <= hi) {
            //如果目标数字比数组中间大小的数字还要大,则向上查找
            int mid = low + (hi - low)/2;
            if (target > array[mid]) {
                low = mid + 1;
            }else if (target < array[mid]) {
                hi = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] readedInts = new In("./datafile/tinyInt.txt").readAllInts();
        Arrays.sort(readedInts);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, readedInts) < 0) {
                StdOut.println(key);
            }
        }
    }
}
