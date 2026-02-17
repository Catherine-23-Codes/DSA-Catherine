import java.util.Arrays;
public class Smallest_B {
    public static int smallestElem(int[]arr){
        Arrays.sort(arr);
        return arr[0]; //use arr[0]----> smallest element
        //arr[arr[0]] using value as index ❌
    }
    public static void main(String[] args) {
        int[]arr={7,2,5,1,33,53,62};
        smallestElem(arr);
        System.out.println("the sorted array is:"+Arrays.toString(arr));
        int smallest=smallestElem(arr);
        System.out.println("the smallest element is:"+smallest);
    }
}
