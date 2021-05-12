import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner nice = new Scanner (System.in);
    System.out.println("Enter a sentence");
  String str = nice.nextLine();
  for (int i = str.length()-1;i >= 0;i--){
System.out.print(str.charAt(i));
  }
  }
}