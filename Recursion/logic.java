package Recursion;

public class logic {
    public static void firstMethod(){
        secondMethod();
        System.out.println("First Method");
    }
    public static void secondMethod(){
        thirdMethod();
        System.out.println("Second Method");
    }
    public static void thirdMethod(){
        fourthMethod();
        System.out.println("Third Method");
    }
    public static void fourthMethod(){
        System.out.println("This is fourth Method");
    }
    public static void main(String[] args) {
      firstMethod(); //This is fourth Method, Third Method,Second Method,First Method
      secondMethod(); //This is fourth Method, Third Method,Second Method
      thirdMethod();// This is fourth Method, Third Method
      fourthMethod(); //This is fourth Method
    }
}



/*  TIP: Call goes down, print comes up!
main
    └── firstMethod
      └── secondMethod
           └── thirdMethod
                └── fourthMethod
 */