import java.util.Scanner;
class ExceptionsTest {
Scanner scr = new Scanner (System.in);
int div;
public void AllinOne() {
int a[]= new int[5];
System.out.println(" Enter the elements of array : ");
try{
for(int i=0; i<5; i++)
{
try{
a[i]=Integer.parseInt (scr.next());
}catch (NumberFormatException e) {
System.out.println (e);
}
}
}
finally{
try{
int num1;
System.out.println("Enter the number to divide");
num1=scr.nextInt ();
for(int i=0; i<5; i++)
{
div=a[i]/num1;
System.out.println(" Division of " + a[i] + " / " +
 num1 + "is"  + div);
}
}catch (ArithmeticException e)
{
System.out.println (e);
}
try{
for(int i=0; i<=5; i++)
{
System.out.println("a[ " +i +" ] : " + a[i]);
}
}catch (ArrayIndexOutOfBoundsException n) {
System.out.println(n);
} catch (ArithmeticException e)
{
System.out.println (e);
}
{
System.out.println("Handelled All the Exceptions ");
}
}
}
}
public class Exception{
public static void main(String args[]) {
ExceptionsTest e= new ExceptionsTest ();
e.AllinOne();
}
}