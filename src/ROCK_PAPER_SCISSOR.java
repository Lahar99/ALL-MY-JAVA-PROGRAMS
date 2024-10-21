import java.util.Random;
import java.util.Scanner;

public class ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int run = 0;
        int win = 0;
        int loose = 0;
        int tie = 0;
        String i = null ;
        String[] options =    {"ROCK","PAPER","SCISSORS"};
        Random rand = new Random();

        System.out.println("WELCOME TO ROCK PAPER AND SCISSORS \n <<RULES>>\n you can play 5 times\n Type 0 for choosing ROCK \n Type 1 for PAPER \n TYPE 2 for choosing SCISSOR");
        System.out.println("WHO DO YOU WANT TO PLAY WITH:");
        String opponent = null;
        opponent = in.next();
        while(run<=5){


        System.out.println("Enter your choice:");
        int choice = in.nextInt();
        if(choice>2){
            System.out.println(opponent+":THIS CHOICE DOESNT EXIST. ARE YOU DUMB(haha i'm joking)\n TRY AGAIN");
            break;
        }
        else if (choice == 0)
        {System.out.println("YOU CHOOSE: ROCK");
        i = "ROCK";
        }
        else if(choice == 1) {
            System.out.println("YOU CHOOSE : PAPER");
            i = "PAPER";
        }
        else if (choice ==2){
            System.out.println("YOU CHOOSE: SCISSORS");
            i = "SCISSORS";
        }
            int randnum = rand.nextInt(3);
            System.out.println(opponent+" CHOOSES: \n"+ options[randnum]);
            String comp = options[randnum];

        System.out.println("   *BATTLING*");
        System.out.println("  "+options[randnum]);
        System.out.println(" \t VS " );
        System.out.println("  "+i);


            if (choice == randnum) {
                System.out.println("IT'S A TIE   (￣o￣) . z Z ");
                tie = tie +1;

            } else if ((choice == 0 && randnum == 2) ||
                    (choice == 2 && randnum == 1)
                    || (choice == 1 && randnum == 0)) {
                System.out.println("YOU WIN ( ´･･)ﾉ(._.`)");
                win = win + 1 ;

            } else {
                System.out.println("YOU LOOSE");
                loose = loose + 1;

            }
            run = run + 1;
        }
        if ((tie == tie && win==0 && loose == 0)){
            System.out.println("NO BODY WON -_- ITS A TIE !!");

        }
        else if(win>loose){
            System.out.println("YOU WIN ╰(*°▽°*)╯\n YOU DEFEATED "+opponent);
        }
        else {
            System.out.println("YOU LOST ༼ つ ◕_◕ ༽つ");
            System.out.println(opponent+" WINS!!");
        }



    }
    }