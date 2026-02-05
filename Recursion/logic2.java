package Recursion;

public class logic2 {
    public static void recursiveMethod(int n){
        if(n<1){ //base case
            System.out.println("n is less than 1");
            return;
        }else{
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        recursiveMethod(6);
    }
}

/* calls go down, print comes up.
o/p- n is less than 1
1
2
3
4
5
6


recursiveMethod(6)
   |
recursiveMethod(5)
   |
recursiveMethod(4)
   |
recursiveMethod(3)
   |
recursiveMethod(2)
   |
recursiveMethod(1)
   |
recursiveMethod(0)   ← base case

 */