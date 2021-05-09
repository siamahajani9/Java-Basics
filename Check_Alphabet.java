import java.util.*;
class Main{
  public static void main(String[]args) {
  Scanner happy = new Scanner (System.in);
  char f = happy.next().charAt(0);
 if((f >= 'a' && f <= 'z') || (f >= 'A' && f <= 'Z')) {
  System.out.println("IT IS AN ALPHABET");
 }
 else {
 System.out.println("IT IS NOT AN ALPHABET") ; 
 }  
  }
}