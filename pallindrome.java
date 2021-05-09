import java.util.*;
class Main{
public static void main(String[]args){
Scanner ok = new Scanner (System.in);  
int answer = square (ok.nextInt());
System.out.println(answer);
pallindrome (ok.nextInt());
}  
public static int square (int a){
return a*a;
}
public static void pallindrome (int num){
int num_copy= num;  
int reversed_num = 0;
while(num != 0){
int digit = num%10;
reversed_num = reversed_num * 10 + digit;
num = num/10; 
}
if (num_copy==reversed_num){
System.out.println("yes,it's a pallindrome!");  
}
else{
System.out.println("no,it's not a pallindrome");
}
}
}
