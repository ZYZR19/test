 public class  TestDemo {
 	public static void main (String[] args) {
 		int a = 1;
 		int b = 78;
 		int c = 69;
 		int max;
 		int min;
 		if (a > b) {
 			max = a;
 			min = b;
 			if (c > a) {
 				max = c;
 			}
 			else if (b > c){
 				min = c;
 			}
 		}
 		else {
 			max = b;
 			min = a;
 			if (c > b) {
 				max = c;
 	        }
 			else if (a > c) {
 				min = c;
 			}
 		}
 		System.out.println("max ="+max);
 		System.out.println("min ="+min);

 	}

 	

    public static void main1 (String[] args) {
 		int a = 10;
 		int b = 20;
 		System.out.println("b ="+ a );
 		System.out.println("a ="+ b );
 	}

 }