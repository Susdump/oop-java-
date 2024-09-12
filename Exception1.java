import java.util.Scanner;
import java.lang.*;
public class Exception1{
	Scanner scr =new Scanner(System.in);
	public void allInOne() {
	int a[]=new int[5];
    try {
    	System.out.println("Enter the elements of array");
	try{
	int div;
	for(int i=0;i<5;i++) {
		a[i]=scr.nextInt();
	}
	int num1;
	 System.out.println("Enter the no.to divide");
	 num1=scr.nextInt();
	 for(int i=0;i<5;i++) {
		 div=a[i]/num1;
	 }
	 System.out.println("Divsion is");
	for(int i=0;i<5;i++) {
		System.out.println("a["+i+"]:"+a[i]);
	}
	
    }
	catch(ArrayIndexOutOfBoundsException n) {
		System.out.println(n);
	}
catch(Exception e) {
	System.out.println("Handelled all the Exception");
}
    }catch(Exception e)
{
	System.out.println("Code executed by handle exception");
}
    }
	public static void main(String args[]){
			
	Exception1 e = new Exception1();
	 e.allInOne();
}
}

