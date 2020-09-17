package whx;
import java.util.HashSet;
	import java.util.Scanner;

public class zhishu {

	    
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("请输入一个末尾2~9类型的数字");
	        int A = scanner.nextInt();
	        System.out.println("输入的数字: " + A);
	        int B = getSum(A);
	        System.out.println("各位的和: " + B);

	        System.out.println("是否质数: " + (checkPrimeNum(B) ? "yse":"no"));
	        if (checkPrimeNum(B)) {
	            System.out.println("是否质数: " + (checkPalindromeNum(A) ? "yse":"no"));
	        } else {
	            HashSet<String> set = new HashSet<>();
	            String s = String.valueOf(A);
	            for (int i = 0; i < s.length(); i++) {
	                set.add(s.charAt(i) + "");
	            }
	            System.out.println("不同数字的个数: " + set.size());
	            
	  
	            int row = set.size();
	            for (int i = 1; i <= row; i++) {
	               
	                for (int t = 1; t <= row - i; t++) {
	                    System.out.print(" ");
	                }

	                for (int j = 1; j <= 2 * i - 1; j++) {
	                
	                    if (j == 1 || j == 2 * i - 1) {
	                        System.out.print(set.size() + "");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }

	            for (int i = row - 1; i >= 1; i--) {
	               
	                for (int t = 1; t <= row - i; t++) {
	                    System.out.print(" ");
	                }

	                for (int j = 1; j <= 2 * i - 1; j++) {
	                  
	                    if (j == 1 || j == 2 * i - 1) {
	                        System.out.print(set.size() + "");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        }
	    }
private static boolean checkPrimeNum(int a) {
	        for (int i = 2; i < a; i++) {
	            if (a % i == 0) return false;
	        }
	        return true;
	    }
private static int getSum(int a) {
	        String target = String.valueOf(a);
	        int count = 0;
	        for (int i = 0; i < target.length(); i++) {
	            count += Integer.parseInt(target.charAt(i) + "");
	        }
	        return count;
	    }	
private static boolean checkPalindromeNum(int target) {
	        String s = String.valueOf(target);
	        for (int i = 0; i < s.length() / 2; i++) {
	            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
	        }
	        return true;
	    }

	    

	    
}