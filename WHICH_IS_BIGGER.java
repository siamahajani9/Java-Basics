import java.util.*;
class Main {
  public static void main(String[]args){
   Scanner cooper = new Scanner (System.in);
   int a = cooper.nextInt();
   int b = cooper.nextInt();
   int c = cooper.nextInt();
   if(a>b && a>c){
System.out.println(a + " is bigger");
   }
   else if(a<b && b>c){
System.out.println(b + " is bigger");
   }
   else{
    System.out.println(c + " is bigger");
    }
  }
}