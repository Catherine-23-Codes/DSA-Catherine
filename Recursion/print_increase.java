//Print numbers from 1 to n in increasing order
package Recursion;

public class print_increase {
    public static void printIncreaseOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }else{
            printIncreaseOrder(n-1); //main difference
            System.out.println(n+" ");
            
        }
    }
    public static void main(String[] args) {
        int n=5;
        printIncreaseOrder(5);
    }
}

/*
o/p--
     1
     2 
     3
     4
     5
 */