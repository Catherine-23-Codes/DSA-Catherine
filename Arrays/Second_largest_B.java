import java.util.*;
public class Second_largest_B {
    public static void secondLargest(int[]arr){
        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        int second_largest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                second_largest=arr[i];
                break;
            }else{
                second_largest=-1;
            }
        }
        System.out.println("the largest element is:"+largest);
        System.out.println("the second largest element is:"+second_largest);
    }
    public static void main(String args[]){
        int[]arr={1,5,2,16,3,9,4,68,2,3};
        secondLargest(arr);
    }
}
