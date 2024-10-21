import java.util.Scanner;
public class practice_set_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      /*  int m1,m2,m3;
        System.out.println("Enter your marks in Maths:");
        m1= in.nextInt();
        System.out.println("Enter your marks in Science:");
        m2 = in.nextInt();
        System.out.println("Eenter your marks in Social:");
        m3 = in.nextInt();
        float avg = m1+m2+m3/3f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("CONGRATS!! you PASSED");
        }
        else{
            System.out.println("you failed");
        } */

        System.out.println("Enter your income slab:");
        float income = in.nextFloat();
        float tax;
        float slab;


        System.out.println("Enter a number from 1 to 7:");
        int num = in.nextInt();
        if(num>0 && num<8){
            switch(num){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("Enter thr right number");

            }
        }
    }
}
