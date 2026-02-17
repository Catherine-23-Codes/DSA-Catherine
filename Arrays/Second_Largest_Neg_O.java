/* To find second Largest elem when there's -ve array */
import java.util.*;
public class Second_Largest_Neg_O {
    public static int SecondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println("the largest elem is:"+largest);
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr={-1,7,2,11,3,-66-5,4};
        int secondLargestElem=SecondLargest(arr);
        System.out.println("The second largest elem is:"+secondLargestElem);
    }
}
