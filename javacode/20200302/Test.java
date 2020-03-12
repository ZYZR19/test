import java.util.Scanner;
public class  Test {
	public static void main (String[] args) {//找到 100 - 200 中第一个 3 的倍数
                int n = 100;
                while(n<=200) {
                        if (n%3==0) {
                        System.out.println(n);
                        break;

                        }
                
                n++;
}
        }
	public static void main4 (String[] args)  {
        Scanner scan = new Scanner (System.in);//打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
        int age = scan.nextInt();
        if(age<=18) {
        	System.out.println("少年");
        }else if(age>=19 && age<=28) {
        	System.out.println("青年");
        }else if(age>=29 && age<=55) {
        	System.out.println("中年");
        }else if(age>=56) {
        	System.out.println("老年");
        }
 }
 	





 	public static void main3(String[] args) {
    	Scanner scan = new Scanner (System.in);//工具类 手动输入 
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	int max = a > b ? a : b; //a是否大于b 是则返回a 不是则返回b
    	int max1 = c > max ? c : max;
    	System.out.println("max = " +max1);

    } 
    

    public static void main2(String[] args) {
    	int a = 12;
    	int b = 200;
    	int c = 500;
    	int max = a > b ? a : b; //a是否大于b 是则返回a 不是则返回b
    	int max1 = c > max ? c : max;
    	System.out.println("max = " +max1);
       }
    

    public static void main1(String[] args) {
	    
		int a = 10;
		int b = 15;
		int tmp = a;
		System.out.println(a);
        System.out.println(b);
        a = b;
		b = tmp ;
		System.out.println(a);
        System.out.println(b);

	}	//交换变量
}