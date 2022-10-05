import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(1,4);
        System.out.println("Press 1 for Rock, 2 for Paper, 3 for Scissor: ");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        if ((x==1) && (y==2)) {
            System.out.println("You are the winner because you opponent choose" + x);
        }
        else if ((x==2) && (y==1)){
            System.out.println("sorry,You lose the game because you opponent choose"+ x);
        }
        else if ((x==2) && (y==3)) {
            System.out.println("Congratulations, you are the winner because you opponent choose" + x);
        }
        else if ((x==3) && (y==2)) {
            System.out.println("sorry,You lose the game because you opponent choose" + x);
        }
        else if ((x==3) && (y==1)) {
            System.out.println("Congratulations, you are the winner because you opponent choose" + x);
        }
        else if ((x==1) && (y==3)) {
            System.out.println("sorry,You lose the game because you opponent choose " + x);
        }

        else {
            System.out.println("Match drawn because your opponent choose" + x);
        }

    }
}