import java.util.*;
class Main{
 public static void main(String[]args){
 Scanner scanner = new Scanner (System.in);
 System.out.println("please enter a number to check whether if it's prime or not");
 int a = scanner.nextInt();
 boolean flag=false;  
 for (int i = 2; i < a; i++){
 if (a%i==0){
 flag = true;  
 } 
 }
 if (flag == true){
 System.out.println("It is not a prime number");  
 }
 else{
System.out.println("It is a prime number");
 }
 } 
}