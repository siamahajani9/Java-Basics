import java.util.*;
import java.lang.Math;
class Main{
public static void main (String[]args){
Scanner tired = new Scanner (System.in);
System.out.println("enter 1 number");
int a = tired.nextInt();
//double b = tired.nextInt();
//double result = Math.pow(a, b);
//System.out.println(result);
reverse (a);  
} 
public static void reverse (int a){
double reversed = 0;
while (a != 0){
int digit = a % 10;
reversed = reversed * 10 + digit;
a = a / 10;
}   
System.out.println(reversed);
} 
}