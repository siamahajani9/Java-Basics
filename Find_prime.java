import java.util.*;
class Main{
 public static void main(String[]args){
 Scanner scanner = new Scanner (System.in);
 System.out.println("please enter 2 numbers for the interval");
 int a = scanner.nextInt();
 int b = scanner.nextInt();
 System.out.println("the prime numbers between " + a  + " and " + b + " are = ");
 for (int c = a; c < b; c++){
 check_prime (c);  
 }
  }
 public static void check_prime(int a){
   boolean flag=false;  
 for (int i = 2; i < a; i++){
 if (a%i==0){
 flag = true;  
 } 
 }
 if (flag == true){
 //System.out.println();  
 }
 else{
System.out.print(a  + " ");
 }
 } 
}