import java.util.*;
import java.lang.*;
public class Exceptions {
    Scanner scan = new Scanner(System.in);
    public void allinone(){
        int a[] = new int[5];

        try{
            System.out.println("Enter the elements");
                try{
                    double div[] = new double[5];
                    for(int i  = 0; i<5;i++)
                    {
                        a[i] = scan.nextInt();
                    }
                    int num1;
                    System.out.println("Enter the Number to divide ");
                    num1 = scan.nextInt();
                    for(int i = 0; i< 5; i++){
                        div[i] = a[i]/num1;
                    }
                    System.out.println("Div is ");
                    for(int i = 0; i<5; i++){
                        System.out.println("a["+i+"]" + div[i]);
                    } }
                    catch (ArrayIndexOutOfBoundsException n) {
                        System.out.println(n);
                    }catch(Exception e){
                        
                        System.out.println("Handlled All exceptions");
                    }
                }
                    catch(Exception e){
                        System.out.println("Code verified by handle exception");
                    }
                finally{};
        }
    public static void main(String[] args){
        Exceptions e = new Exceptions();
        e.allinone();
    }

    
}