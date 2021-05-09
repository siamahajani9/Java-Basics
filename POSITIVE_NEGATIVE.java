import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
 System.out.println("ENTER A NUMBER TO CHECK IF IT'S A POSITIVE NUMBER OR A NEGATIVE NUMBER");
 double a = scn.nextInt();
 if(a>0){
 System.out.println("IT'S A POSITIVE NUMBER");  
 }
 else if(a==0) {
 System.out.println("IT'S A 0 INPUT"); 
 }
 else{
System.out.println("IT'S A NEGATIVE NUMBER");
 }
  } 
}