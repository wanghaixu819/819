package ii;

import java.util.Scanner;
public class RR {

	  public static void main(String[] args) {
	    //案例开始  9*9 乘法表
	    int row = 9;
	    int col = 9;
	    for(int i = 1; i <= row; i ++) {
	      System.out.println(i);
	      
	      for(int j = 1; j <= i; j ++) {
	        System.out.print(i + " * " + j + " = " + i*j);
	      }
	      
	      
	    }
	    System.out.println();
	    System.out.println("=====直角三角形======");
	    System.out.println("输入像打印的行数:");
	  
	    int row2 = new Scanner(System.in).nextInt();
	    //接受键盘收入
	    for(int i = 1; i <= row2; i ++) {
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    System.out.println("=====等腰三角形======");
	    
	    
	    for(int i = 1; i <= row2; i ++) {
	      for (int t = 1; t <= row2 - i; t ++) {
	        System.out.print(" ");
	      }
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    System.out.println("=====空心等腰三角形======");
	    
	    for(int i = 1; i <= row2; i ++) {
	      for (int t = 1; t <= row2 - i; t ++) {
	        System.out.print(" ");
	      }
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        if (j == 1 || j == 2 * i - 1) {
	          System.out.print("*");
	        }else
	        {
	          System.out.print(" ");
	        }
	        
	      }
	      System.out.println();
	    }
	    System.out.println("=====空心菱形======");
	    
	    for(int i = 1; i <= row2; i ++) {
	      for (int t = 1; t <= row2 - i; t ++) {
	        System.out.print(" ");
	      }
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        if (j == 1 || j == 2 * i - 1) {
	          System.out.print("*");
	        }else
	        {
	          System.out.print(" ");
	        }
	        
	      }
	      System.out.println();
	    }
	    for(int i = row2 -1; i >= 1; i --) {
	      for (int t = 1; t <= row2 - i; t ++) {
	        System.out.print(" ");
	      }
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        if (j == 1 || j == 2 * i - 1) {
	          System.out.print("*");
	        }else
	        {
	          System.out.print(" ");
	        }
	        
	      }
	      System.out.println();
	    }
	  }
	}
