public class Smallest_O {
    public static int SmallestElem(int[]arr){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[]arr={72,6,3,8,10,34,7};
        int smallest=SmallestElem(arr);
        System.out.println("The smallest element is:"+smallest);
    }
}
