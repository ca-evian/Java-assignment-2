import java.util.Scanner;
public class test
{
  	public static void main(String[] args){
	
	System.out.println("输入汽车型号，油箱容量和油耗：");
	Scanner scan = new Scanner(System.in);
	String a="";
	int b=0, c=0;
	if (scan.hasNextLine()) {
              a = scan.nextLine();
	}
	if (scan.hasNextInt()) {
              b = scan.nextInt();
	}
	if (scan.hasNextInt()) {
              c = scan.nextInt();
	}
        car one = new car(a,b,c);
        one.info();
 }
}

class car{
	private String modle;
	private int tank;
	private int oilConsumption;
	private int tankNow;

	public car(String m, int t, int o){
     	modle = m;
	tank = t;
	oilConsumption = o;
   	tankNow = t;
        }

	public void gas(){
        tankNow = tank;
	}

	public boolean run(){
	if (tankNow > oilConsumption)
		return true;
	return false;
	}

	public void info()
	{

	 System.out.println("油箱容量："+tank);
	 System.out.println("当前油量："+tankNow);
	 System.out.println("耗油量："+oilConsumption);
	}
}

 

