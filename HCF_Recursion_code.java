import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner unicorn = new Scanner (System.in);
  System.out.println("ENTER 2 NUMBERS TO CALCULATE IT'S HCF (GCD)");
  int a = unicorn.nextInt();
  int b = unicorn.nextInt();
  int result = HCF (a,b);                               //Line no. 1 to 8 will move one by one and line number 11 will start till 16 and then 9 will run.Basically 9 waits for the work to be finished     
  System.out.println(result);
}
public static int HCF (int n1, int n2){
if (n2 != 0){
 return HCF(n2, n1 % n2);
}
else{
  return n1;
}
} 
 }