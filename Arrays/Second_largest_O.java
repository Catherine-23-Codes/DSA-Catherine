/* To find second largest elem when there's only positive array elems
 */
public class Second_largest_O {
    public static int SecondLargest(int[]arr){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr={2,6,11,8,4,9,5};
        int secondLargest=SecondLargest(arr);
        System.out.println("The second largest element is:"+secondLargest);
    }
}
