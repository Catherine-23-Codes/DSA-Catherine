public class LargestElem_Opt2 {
    public static int LargestElem(int[]arr){
        int Largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int[]arr={1,6,2,8,13,0,4,6};
        System.out.println("the largest element is:"+LargestElem(arr));
    }
}
