import java.util.Scanner;

class Kadai2_2_2 {
   public static void main(String[] args) {
		System.out.println("ピラミッドの段数を整数で入力してください。");
		int a = new Scanner(System.in).nextInt();
     for(int i=0; i<a; i++){
       for(int j=0; j<i; j++){
         System.out.print("  ");
       }
       for(int k=0; k<(a-i)*2-1; k++){
         System.out.print("☆");
       }
       System.out.println();
     }
   }
 }

