import java.util.Scanner;
public class Main { 
    public static double squareRoot(int n) {
        double tmp;
        double d = n / 2;
        do {
           tmp = d;
           d = (tmp + (n / tmp)) / 2;
        } while ((tmp - d) != 0);
        return d;
    }
    public static void main(String[] args)  
    {
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt(); 
        sc.close();
        System.out.println("Square root of "+ nbr + " is : "+ squareRoot(nbr));
    } 
}
