import java.util.Scanner;//所有的都是方法的使用的练习题，重载递归
public class HelloWorld {
	public static void main(String[] args) {     
        int []arr={1,3,3,4,5,5,7,8,9,10,10};
        int i;
        int j;
        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
            if(arr[j]%2!=0){
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
            }
        } 
        System.out.print(arr[i]+" ");
      }
 }

	//求两个小数两个整数最大值 以及三个数字比大小（重载的练习）
	public	static double Cmp (double a, double b,int c ) {//求两个小数两个整数最大值 以及三个数字比大小
		double n = a>b?a:b;//a和b中得较大值
		double max = n>c?n:c;//max
		double m = a<b?a:b;//a和b中较小值
		double min = m<c?m:c;//min
		double mid = (a + b + (double)c)-min-max;
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
   }
   //斐波那契的第n行
	public static int fib(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        if (n==1||n==2) {
        	sum = n;
        }
        for (int i = 3; i<=n; i++) {
        	sum = a + b ;
        	a = b ;
        	b = sum ;
        }
        return sum ;
	}
	public static void main4 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret1 = fib(n);
        System.out.println(ret1);
		
    }


	//打印数字每一位的和
	public static  int num1 (int n ) {
		if (n/10==0) {//算出各位
		return n ;	 
		 }   
		int ret = n % 10+num1(n/10);//从后往前加起来
        return ret;
      	}
	public static void main3 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret1 = num1 (n);
        System.out.println(ret1);
		
    }
	//按顺序打印数字的每一位
	public static  int num (int n ) {
		if (n/10==0) {
		System.out.println(n);
		return n ;
		  
		 }   
		int ret = n % 10;
        num(n/10);
        System.out.println(ret);
        return ret;
      	}
	public static void main2 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret1 = num (n);
		
    }

	
	public static  int fac (int n ) {//求n得阶乘
			if (n ==1) {
			return 1;
			}
			return n *fac (n-1);
	}
	 public static void main1 (String[] args) {
	    Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret = fac (n);
		System.out.println("阶乘=="+ret);
    }

	       
    public static int add (int n ) {//求n到1的和
    	if (n==1) {
    		return 1;
    	}
    	return n +add(n-1);
    }
     public static void main0 (String[] args) {
     	Scanner scan = new Scanner (System.in);
		int n= scan.nextInt() ;
		int ret = add(n);
		System.out.println("和=="+ret);
     }
 }