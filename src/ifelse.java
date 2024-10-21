import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your AGE nigga <-_-> :");
       int age = input.nextInt();
        if (age>18) {
            System.out.println("you are eligible to drive");
        }
        else
        {
            System.out.println("you are still a kid watch POGO");}
    }
}
