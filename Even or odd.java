import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    System.out.println("Enter two sides");
    int a = scn.nextInt();
    int b = scn.nextInt(); 
    System.out.println("area of a square is:");
    System.out.println(a*b);
    double dodo = 22/7;
    System.out.println(dodo);
    System.out.println("Enter a number to check if its even or odd");
   int c = scn.nextInt();
   if(c%2==0){
   System.out.println("Number is even");
   }
   else{
System.out.println("Number is odd");
   }
  } 
}