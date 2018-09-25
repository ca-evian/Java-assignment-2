import java.util.*;
import java.lang.*;

public class Guess
{



 public static void main(String[] args){
         System.out.println("请三位玩家输入三个整数：");
	 num res = new num();
	 System.out.println(res.num1+" "+res.num2+" "+res.num3);
	 Scanner sc = new Scanner(System.in);
	  int num1 = sc.nextInt();
	  int num2 = sc.nextInt();
	  int num3 = sc.nextInt();
         
	 if(num1 == res.num1)
	     System.out.println("玩家一");
	 if(num2 == res.num2)
	     System.out.println("玩家二");
         if(num3 == res.num3)
	     System.out.println("玩家三");
 }
}

 class num{
 	public int num1;
 	public int num2;
	public int num3;
        private Random rand;
	public num(){
	rand = new Random();
	num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
        num3 = rand.nextInt(10);
 }

 }

