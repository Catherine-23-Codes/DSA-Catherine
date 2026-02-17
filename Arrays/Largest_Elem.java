/* To find the largest elem in arr
        1)sort the arr
        2) return the elem at last index pos
 */
import java.util.*;
public class Largest_Elem{
    public static int largestElement(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String args[]){
        int[]arr={1,7,2,5,3,9,16,2,4};
        largestElement(arr);
        System.out.println("The sorted array is:"+Arrays.toString(arr));
        int Largest=largestElement(arr);
        System.out.println("The largest elem is:"+Largest);
    }
}