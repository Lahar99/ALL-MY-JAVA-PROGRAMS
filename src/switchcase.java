import java.util.Scanner;
public class switchcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* System.out.println("Enter your age:");
         int a = in.nextInt();

        if(a>56){
            System.out.println("you are experienced");
        }
        else if (a>46){
            System.out.println("you are semi experience");
        }
        else {
            System.out.println("you are not experienced");
        }
        if(a>2){
            System.out.println("you are not a baby");}

        */
    String name = "LAHAR";
    switch(name) {
        case "LAHAR":
            System.out.println("mathced LAHAR");
            break;
        case "lahar":
            System.out.println("matched lahar");
            break;

        default:
            System.out.println("didnt match any");
           ;
    }}}
