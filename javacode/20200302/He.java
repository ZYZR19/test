import java.util.Scanner;
public class He {

	    public static void main(String[] args) {//找出数组中只出现一次得数字
        
        int []arr = {1,1,2,2,3,3,4,4,5,6,6};
        
        int i=0;
        int j=0;
        int count;
        for(i=0;i<9;i++) {
            count =0;
            for(j=0;j<9;j++) {
                if(arr[i]==arr[j])
                    count ++;
            } if(count==1) {
                System.out.println(arr[i]+"==出现一次得数字");
            }
        }
    }

	public  static int add(int a ,int b) {//计算小数之和 整数之和
		return a+b;
	}
	public  static double add(double a ,double b,double c) {
		return a+b+c;
	}
    public static void main6 (String[] args) {
    	Scanner scan = new Scanner (System.in);
		int a1= scan.nextInt() ;
		int b1= scan.nextInt() ;
		int ret = add(a1,b1);
		System.out.println("整数之和="+ret);
	    double a2= scan.nextDouble() ;
		double b2= scan.nextDouble() ;
		double c = scan.nextDouble() ;
		double ret1 = add(a2,b2,c);
		System.out.println("小数之和="+ret); 
    }

	public	static double Cmp (double a, double b,int c ) {//不会写失败了
		double n = a>b?a:b;//a和b中得较大值
		double max = n>c?n:c;//max
		double m = a<b?a:b;//a和b中较小值
		double min = m<c?m:c;//min
		double mid = (a + b + 0.1*c)-min-max;
		System.out.println(max+">"+mid+">"+min) ;
		return 0;
	}
	public	static int maxNum2 (int a, int b ) {
		int max = a >= b ? a : b;
    	return max;
    } 
    public	static double maxNum2 (double a, double b ) {
		double max = a >= b ? a : b;
    	return max;
    }   
   public static void main5(String[] args) {
	    Scanner scan = new Scanner (System.in);
		int a1= scan.nextInt() ;
		int b1= scan.nextInt() ;
		int ret = maxNum2( a1,b1);
		System.out.println("整数最大值=="+ret);
		double a2=scan.nextDouble() ;
		double b2=scan.nextDouble() ;
		double ret2=maxNum2(a2,b2);
		System.out.println("小数最大值=="+ret2);
	    double a= scan.nextDouble() ;
		double b= scan.nextDouble() ;
		int c=scan.nextInt() ;
		Cmp ( a,  b, c );
		Cmp(a,b,c);

    }
	public static void main3 (String[] args) {//求n得阶乘和
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int sum = 0 ;
		for (int i = 1;i <= n; i ++) {
			sum += factor(i);
		}
		System.out.println("阶乘和=="+sum);
    }
    public static  int factor (int n ) {
    	int ret = 1;
    	for (int i = 1;i<=n ;i ++){
    	   ret *=i;
    	}
    	return ret;
    }
	public static  int fac (int n ) {//求n得阶乘
			if (n ==1) {
			return 1;
			}
			return n *fac (n-1);
	}
	 public static void main2 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret = fac (n);
		System.out.println("阶乘=="+ret);
    }
	public	static int max2 (int a, int b ) {//求三个数中最大得数
		int max = a >= b ? a : b;
    	return max;
    }  
	public	static int max3 (int a, int b,int c ) {
		int x=max2(a,b);
		int y=max2(x,c);
		return y ;
	}
    public static void main1 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int a1= scan.nextInt() ;
		int b1= scan.nextInt() ;
		int c1= scan.nextInt() ;	
		int ret = max3( a1,b1,c1);
		System.out.println("最大值=="+ret);
    }
}