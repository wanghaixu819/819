package ii;

import java.util.Scanner;
public class RR {

	  public static void main(String[] args) {
	    //������ʼ  9*9 �˷���
	    int row = 9;
	    int col = 9;
	    for(int i = 1; i <= row; i ++) {
	      System.out.println(i);
	      
	      for(int j = 1; j <= i; j ++) {
	        System.out.print(i + " * " + j + " = " + i*j);
	      }
	      
	      
	    }
	    System.out.println();
	    System.out.println("=====ֱ��������======");
	    System.out.println("�������ӡ������:");
	  
	    int row2 = new Scanner(System.in).nextInt();
	    //���ܼ�������
	    for(int i = 1; i <= row2; i ++) {
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    System.out.println("=====����������======");
	    
	    
	    for(int i = 1; i <= row2; i ++) {
	      for (int t = 1; t <= row2 - i; t ++) {
	        System.out.print(" ");
	      }
	      for(int j = 1; j <=2 * i - 1; j ++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    System.out.println("=====���ĵ���������======");
	    
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
	    System.out.println("=====��������======");
	    
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
