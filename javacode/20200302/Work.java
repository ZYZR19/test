import java.util.Scanner;
public class  Work {

        public static void main (String[] args) {//九九乘法表
                int i =1;
                int j =1;
                int sum =0;
                for(i=1;i<=9;i++) {
                       for(j=1;j<=i;j++){
                        sum=i*j;
                System.out.print(i+"*"+j+"="+sum+" ") ; 
                       }
                System.out.print("\n") ; 
                }
        }

        public static void main17 (String[] args) {
                int year =1000;
                for(year=1000;year<=2000;year++) {
                        if((year%4==0&&year%100!=0)||year%400==0) {
                System.out.println("1000到2000的闰年"+year) ; 

                        }
                }
        } 
        
        public static void main16 (String[] args) {//计算5的阶乘的和
                int sum=0;
                for(int i = 1;i<=5;i++){//外部的加
                        int ret=1;
                        for(int j=1;j<=i;j++){//内循环阶乘
                                ret*=j;
                        }
                sum += ret;
                }
                System.out.println("sum ="+sum) ;


        }

        public static void main15 (String[] args) {//计算5的阶乘
                int ret=1;
                for(int i =1; i<=5;i++ ){
                        ret*=i;
                }
                System.out.println("ret ="+ret) ;    

        }
        public static void main14 (String[] args) {//1-100相加
                int sum = 0 ;
                for (int i = 1; i<=100 ;i++ ) {
                   sum+=i;     
                }
                System.out.println("sum ="+sum) ;    
        }

        public static void main13 (String[] args) {//打印1-10数字
                for(int i = 1;i <=10;i++) {//表达式1：初始化循环变量；表达式2：循环条件；表达式3:更新循环变量
                   System.out.println(i) ;    
                }
        }
        public static void main12 (String[] args) {//找到100-200所有3的倍数
                int n= 100;
                while(n<=200) {
                        if (n%3!=0) {
                        n ++;
                        continue;//跳过进入下一个循环
                        }
                        System.out.println("三的倍数"+n);
                        n++;
                }
        } 

        public static void main11 (String[] args) {//找到 100 - 200 中第一个 3 的倍数
                int n = 100;
                while(n<=200) {
                        if (n%3==0) {
                        System.out.println(n);
                        break;//找到就退出

                        }
                
                n++;
                }

        }

        public static void main10 (String[] args) {
                int n = 1;
                int ret = 0;
                while(n<=5) {//外层循环求n的阶乘的和

                int num = 1;
                int result = 1;
                  while(num<=n) {//内层循环求n的阶乘
                        result *= num;
                        num++;
                   }
                ret +=result;
                n++;
                }
                System.out.println(ret);
        }
        public static void main9 (String[] args) {//计算5得阶乘
                int n = 1;
                int result = 1;
                while(n<=5) {
                        result *= n;//r=r*n
                        n++;
                }
                System.out.println(result);
        } 
        public static void main8 (String[] args) {//1 -100的和//while（）括号里为true进行循环否则循环结束
                int n = 1;
                int result=0;
                while (n<=100) {//while（）括号里为true进行循环否则循环结束
                        result += n;
                        n++;
                }
                        System.out.println(result);


        }

        public static void main7(String[] args) {//打印1-10的数字
                int num = 1;
                while(num<=10) {
                        System.out.println(num);
                        num++;

                }
                

        }
        public static void main6 (String[] args) {//switch（） {} if只能放表达式 switch可以放一长串
                Scanner scan = new Scanner (System.in);
                int n= scan.nextInt() ;
                switch(n) {
                        case 1:
                           System.out.println("星期一"); 
                           break;//没有break直到遇到下一个break才会停止
                        case 2:
                           System.out.println("星期二");
                           break;
                        case 3:
                           System.out.println("星期三");
                           break;
                        default :

                           System.out.println("输入有误"); 
                           break; 
               }
       }

        public static void main5 (String[] args) {
                int x = 10;
                int y = 10;
                if (x == 10)    
                if (y == 10)     
                      System.out.println("aaa"); 
                else     System.out.println("bbb");//不打印 if和最近得else结合  悬垂else


        }

        public static void main4 (String[] args) {
                Scanner scan = new Scanner (System.in);
               int year= scan.nextInt();
               if(year%4==0&&year%100!=0 || year%400==0) {
                  
                 System.out.println("当前"+year+"是闰年！");
               
               }
               

        }
                
        public static void main3 (String[] args) {
             Scanner scan = new Scanner (System.in);
             while(scan.hasNext()) {//循环读取 怎么停下 ctr+c 中断； ctr+z 正常停止
               int n = scan.nextInt();
               if (n  > 0) {
                 System.out.println("当前数字是正数！");
               }else if(n < 0) {
                 System.out.println("当前数字是负数！");
               }else  {
                 System.out.println("当前数字是0！");
               }
            }                

        } 



        public static void main2 (String[] args) {
                Scanner scan = new Scanner (System.in);
               int n = scan.nextInt();
               if (n % 2 == 0) {
                 System.out.println("当前数字是偶数！");
               }else{
                 System.out.println("当前数字是奇数！");
               }
                

        } 
        public static void main1 (String[] args) {
                int a = 10 ;
                if (a==20) {//逻辑判断
                        System.out.println("a == 20");
                }else if(a==8) {
                        System.out.println("a == 8");
                }else {
                        System.out.println("a !== 8 && a ！= 20");   
                }

        } 
                
}