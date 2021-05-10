import java.util.*;
class Main {
  public static void main (String[]args){
  Scanner Alpha = new Scanner (System.in);
  System.out.println("ENTER A STRING (A SENTENCE). THE COMPUTER WILL AUTOMATICALLY CHANGE IT TO LOWERCASE (a not A)");
  String str = Alpha.nextLine();
  int count_vowels = 0;
  int count_consonents = 0;
  str=str.toLowerCase();
  for (int i = 0; i < str.length(); i++){
  char c = str.charAt(i);  
  if (c == 'a'|| c == 'e'|| c == 'i'|| c == 'o' || c == 'u'){
   count_vowels += 1; 
  }
  else if (c <= 'z' && c >= 'a' ) {
  count_consonents += 1;  
  }
  }
  System.out.println("NUMBER OF VOWELS ARE = " + count_vowels);
  System.out.println("NUMBER OF CONSONENTS ARE = " + count_consonents);
  System.out.println("(This is the lowercase sentence) = " + str);
  }
}