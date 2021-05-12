import java.util.*;
class Main {
  public static void main(String[] args) {
 Scanner oof = new Scanner (System.in);
 System.out.println("Enter a number to calculate it's factorial");
 int n = oof.nextInt();
int result = factorial (n); 
System.out.println(result);
}
 public static int factorial (int n){
if (n == 0){
 return 1;
}
else {
  return n*factorial(n-1);
}
 } 
}