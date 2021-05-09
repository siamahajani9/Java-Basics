class Main{
public static void main (String[]args){    
add (78,75);  
sub (98,54);
fact (9);
HCF(7,49);
LCM (64,49);
}  
public static void add(int a, int b){ 
System.out.println(a+b);   
}
public static void sub (int c, int d){  
System.out.println(c-d);
}
public static void fact (int a){
int c = 1;
for (int b = 1; b <= a; b++){
c=c*b;  
}  
System.out.println(c);
} 
public static int HCF (int e, int f){
int GCD = 1;
for (int i = 1; i <= e && i <= f; i++){
if (e%i==0 && f%i==0){
GCD = i;  
}
}
System.out.println(GCD);
return GCD;
}
public static void LCM (int g, int h){  
  int sia=HCF(g,h);
int lcm = (g*h)/sia;
System.out.println(lcm);
}
}