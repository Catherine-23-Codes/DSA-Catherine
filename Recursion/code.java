package Recursion;

public class code{
public static void openRussianDoll(int doll){
    System.out.println("Opened russian doll"+ "("+doll+")");
    if(doll==1){ //Base Case - exit door for recursion.
        System.out.println("All dolls are opened!"); 
    }else{
        openRussianDoll(doll-1); //Recursive Call - Each call reduces the problem size by 1.
    }
}
public static void main(String[] args) {
    openRussianDoll(23);
  }
}


/* if doll size=5
openRussianDoll(5);
→ openRussianDoll(4)
→ openRussianDoll(3)
→ openRussianDoll(2)
→ openRussianDoll(1)
when it reaches 1 it prints-> All dolls are opened!


Each function call solves a smaller version of the 
same problem until the base case stops it
 */