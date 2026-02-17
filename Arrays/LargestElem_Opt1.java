public class LargestElem_Opt1 {
    public static void LargestElem(int[]arr){
        int Largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i]; //update the largest elem
            }
        }
        System.out.println("The largest elem is:"+Largest);
    }
    public static void main(String[] args) {
        int[]arr={1,6,2,4,8,3,5};
        LargestElem(arr);
    }
}
