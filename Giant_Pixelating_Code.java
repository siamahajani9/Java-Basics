import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner pixel = new Scanner (System.in);
    System.out.println("Please enter a character to pixelate");
    String s = pixel.nextLine();
    for (int i = 0; i < s.length(); i++){
    char c = s.charAt(i);
    if(c=='a'|| c=='A'){pixel_a();} 
    if(c=='b'|| c=='B'){pixel_b();}
    if(c=='c'|| c=='C'){pixel_c();}
    if(c=='d'|| c=='D'){pixel_d();}
    if(c=='e'|| c=='E'){pixel_e();}
    if(c=='f'|| c=='F'){pixel_f();}
    if(c=='g'|| c=='G'){pixel_g();}
    if(c=='h'|| c=='H'){pixel_h();}
    if(c=='i'|| c=='I'){pixel_i();}
    if(c=='j'|| c=='J'){pixel_j();}
    if(c=='k'|| c=='K'){pixel_k();}
    if(c=='l'|| c=='L'){pixel_l();}
    if(c=='m'|| c=='M'){pixel_m();}
    if(c=='n'|| c=='N'){pixel_n();}
    if(c=='o'|| c=='O'){pixel_o();}
    if(c=='p'|| c=='P'){pixel_p();}
    if(c=='q'|| c=='Q'){pixel_q();}
    if(c=='r'|| c=='R'){pixel_r();}
    if(c=='s'|| c=='S'){pixel_s();}
    if(c=='t'|| c=='T'){pixel_t();}
    if(c=='u'|| c=='U'){pixel_u();}
    if(c=='v'|| c=='V'){pixel_v();}
    if(c=='w'|| c=='W'){pixel_w();}
    if(c=='x'|| c=='X'){pixel_x();}
    if(c=='y'|| c=='Y'){pixel_y();}
    if(c=='z'|| c=='Z'){pixel_z();}
    }
  }
  public static void pixel_a(){
  System.out.println("        * * *");  
  System.out.println("      *       *");
  System.out.println("     *         *");
  System.out.println("    * * * * * * *");
  System.out.println("   *             *");
  System.out.println("  *               *");
  System.out.println(" *                 *");
  }
  public static void pixel_b(){
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" * * * * *");  
  }
  public static void pixel_c(){
  System.out.println("     * * * * *");
  System.out.println("   *");
  System.out.println("  *");
  System.out.println(" *");
  System.out.println("  *");
  System.out.println("   *");
  System.out.println("     * * * * *");   
  }
  public static void pixel_d(){
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *          *");
  System.out.println(" *           *");
  System.out.println(" *          *");
  System.out.println(" *         *");
  System.out.println(" * * * * *");  
  }
  public static void pixel_e(){
  System.out.println(" * * * * *");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" * * * * *");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" * * * * *");  
  }
  public static void pixel_f(){
  System.out.println(" * * * * *");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" * * * * *");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" *         ");    
  }
  public static void pixel_g(){
  System.out.println("   * * * * *");
  System.out.println("  *        ");
  System.out.println(" *         ");
  System.out.println(" *        * * *");
  System.out.println(" *          *");
  System.out.println("  *         *");
  System.out.println("   * * * * *");    
  }
  public static void pixel_h(){
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" * * * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");    
  }
  public static void pixel_i(){
  System.out.println("* * * *");
  System.out.println("   *");
  System.out.println("   *");
  System.out.println("   * ");
  System.out.println("   *         ");
  System.out.println("   *        ");
  System.out.println("* * * *");    
  }
  public static void pixel_j(){
  System.out.println("      * * * * *");
  System.out.println("          *");
  System.out.println("          *");
  System.out.println("          *");
  System.out.println("          *");
  System.out.println("    *     *");
  System.out.println("     * * *");  
  }
  public static void pixel_k(){
  System.out.println(" *       *");
  System.out.println(" *     *");
  System.out.println(" *   *");
  System.out.println(" * *");
  System.out.println(" *   *");
  System.out.println(" *     *");
  System.out.println(" *       *");    
  }
  public static void pixel_l(){
  System.out.println(" * ");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" * * * * *");  
  }
  public static void pixel_m(){
  System.out.println(" *           *");
  System.out.println(" **         **");
  System.out.println(" * *       * *");
  System.out.println(" *  *     *  *");
  System.out.println(" *   *   *   *");
  System.out.println(" *     *     *");   
  }
  public static void pixel_n(){
  System.out.println(" *       *");
  System.out.println(" * *     *");
  System.out.println(" *  *    *");
  System.out.println(" *   *   *");
  System.out.println(" *    *  *");
  System.out.println(" *     * *");
  System.out.println(" *       *");     
  }
  public static void pixel_o (){
  System.out.println("   * * * * ");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println("   * * * * "); 
  }
  public static void pixel_p (){
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" * * * * *");
  System.out.println(" *         ");
  System.out.println(" *         ");
  System.out.println(" * ");
  }
  public static void pixel_q (){
  System.out.println("   * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *     *   *");
  System.out.println(" *       * *");
  System.out.println("   * * * * *");
  System.out.println("             *");
  }
  public static void pixel_r(){
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" * * * * *");
  System.out.println(" *         *");
  System.out.println(" *           *");
  System.out.println(" *            *");
  }
public static void pixel_s(){
  System.out.println(" * * * * *");
  System.out.println("*         ");
  System.out.println("*         ");
  System.out.println(" * * * * *");
  System.out.println("          *");
  System.out.println("          *");
  System.out.println(" * * * * *"); 
}
public static void pixel_t(){
  System.out.println(" * * * * *");
  System.out.println("     *         ");
  System.out.println("     *        ");
  System.out.println("     * ");
  System.out.println("     * ");
  System.out.println("     *         ");
  System.out.println("     * ");
}
public static void pixel_u(){
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println(" *         *");
  System.out.println("  * * * * * ");  
}
public static void pixel_v(){
  System.out.println(" *           *");
  System.out.println("  *         *");
  System.out.println("   *       * ");
  System.out.println("    *     *    ");
  System.out.println("     *   *    ");
  System.out.println("      * *       ");
  System.out.println("       * ");  
}
public static void pixel_w(){ 
  System.out.println(" *           *           *");
  System.out.println("  *         * *         *");
  System.out.println("   *       *   *       *");
  System.out.println("    *     *     *     *");
  System.out.println("     *   *       *   *");
  System.out.println("      * *         * *");
  System.out.println("       *           *");    
}
public static void pixel_x(){
System.out.println("*       *");
System.out.println(" *     * ");
System.out.println("  *   *  ");
System.out.println("    *    ");
System.out.println("  *   *  ");
System.out.println(" *     * ");
System.out.println("*       *");    
}
public static void pixel_y(){
  System.out.println(" *     *");
  System.out.println("  *   *");
  System.out.println("   * * ");
  System.out.println("    *     ");
  System.out.println("    *     ");
  System.out.println("    *        ");
  System.out.println("    * ");    
}
public static void pixel_z(){
  System.out.println(" * * * * * * *");
  System.out.println("           *"); 
  System.out.println("         * ");  
  System.out.println("       *    "); 
  System.out.println("     *    ");   
  System.out.println("   *       ");  
  System.out.println(" * * * * * * *");    
}
  }