import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner hello = new Scanner(System.in);
    double a = hello.nextDouble();
    double b = hello.nextDouble();
    // add (a,b);
    // subtract (a,b);
    // multiply (a,b);
    // divide (a,b);
    // power (a,b);
    // ceiling (a);
    // floor (b);
    // max (a,b);
    // min (a,b);
    // square_root (a);
    // boolean c = check_prime (a);
    // System.out.println(c);
    for (double i = a; i <= b; i++) {
      if (check_prime(i)) {
        System.out.println(i);
      }
    }
    for (double i = a; i <= b; i++) {
      if (check_pallindrome(i)) {
        System.out.println(i);
      }
    }
  }

  public static void add(double a, double b) {
    System.out.println(a + b);
  }

  public static void subtract(double a, double b) {
    System.out.println(a - b);
  }

  public static void multiply(double a, double b) {
    System.out.println(a * b);
  }

  public static void divide(double a, double b) {
    double c = a / b;
    System.out.println(c);
  }

  public static void power(double a, double b) {
    double result = Math.pow(a, b);
    System.out.println(result);
  }

  public static void ceiling(double a) {
    double result = Math.ceil(a);
    System.out.println(result);
  }

  public static void floor(double a) {
    double result = Math.floor(a);
    System.out.println(result);
  }

  public static void max(double a, double b) {
    double result = Math.max(a, b);
    System.out.println(result);
  }

  public static void min(double a, double b) {
    double result = Math.min(a, b);
    System.out.println(result);
  }

  public static void square_root(double a) {
    double result = Math.sqrt(a);
    System.out.println(result);
  }

  public static boolean check_prime(double a) {
    boolean result = true;
    for (int i = 2; i <= a - 1; i++) {
      if (a % i == 0) {
        result = false;
        break;
      } else {
        result = true;
      }
    }
    return result;
  }

  public static boolean check_pallindrome(double a) {
    boolean result = true;

    return result;
  }
}