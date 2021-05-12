import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner dong = new Scanner (System.in);
  System.out.println("ENTER A SENTENCE AND TWO CHARACTERS. IN THE 1ST ONE YOU HAVE TO TYPE THE LETTER OR WORD OR SENTENCE YOU WISH TO CHANGE. FOR EXAMPLE IF YOU WRITE 'MY NAME IS SOMETHING'. THEN IN THE FIRST CHARACTER, YOU CAN WRITE 'SOMETHING', PRESS ENTER AND THEN WRITE YOUR NAME AND THEN YOU WILL GET YOUR NAME PRINTED INSTEAD OF 'SOMETHING' (you dont have to write capital only). BE SURE TO WRITE THE EXACT SAME THING OR IT MIGHT NOT WORK. 'SOMETHING' SHOULD NOT BE 'something' ");
  String str = dong.nextLine();
  String c = dong.nextLine(); 
  String d = dong.nextLine(); 
  System.out.println("THIS IS YOUR NORMAL SENTENCE = " + str);
  str=str.replaceAll(c,d);
  System.out.println("THIS IS YOUR SENTENCE NOW = " + str );
  }
}