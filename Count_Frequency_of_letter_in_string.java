import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner ding = new Scanner (System.in);
System.out.println("ENTER A SENTENCE");
String str = ding.nextLine();
System.out.println("ENTER A CHARACTER TO CHECK THE FREQUENCY OF IT");
char acter = ding.next().charAt(0);
int frequency_counter = 0;
for (int i = 0; i < str.length(); i++){
if (str.charAt(i) == acter){
 frequency_counter += 1; 
} 
}   
System.out.println("NUMBER OF CHARACTERS IN THE SENTENCE IS = " + frequency_counter);
 }
}