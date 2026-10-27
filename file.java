import java.util.Scanner;

public class Main {
    
    static void MIN(int n1,int n2){
        System.out.println("Min value is " + Math.min(n1,n2));
    }
    static void MAX(int n1,int n2){
        System.out.println("Max value is " + Math.max(n1,n2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, c;
        
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        
        System.out.print("Enter 1(MIN) or 2(MAX): ");
        c = input.nextInt();
        
        if(c==1){
            MIN(n1,n2);
        }
        
        if(c==2){
            MAX(n1,n2);
        }
    }
}
