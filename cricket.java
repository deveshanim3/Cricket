import java.util.Random;
import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***********************\nWelcome to Cricket 2025\n***********************");
        Random rn=new Random();
        int score=0;
        int wic=2;
        System.out.println("Game has begin!");
        for (int i = 0; i < 12; i++) {
            if(i==0)System.out.println("First Innings started!!");
            int compRun=rn.nextInt(9)+1;
            System.out.println("Ball "+(i+1));
            System.out.println("enter your run: ");
            int playerRun=sc.nextInt();
            if(playerRun<1 || playerRun>10){
                System.out.println("enter valid runs");
                System.out.println("enter your run: ");
                playerRun=sc.nextInt();
            }
            if(compRun!=playerRun){
                score+=playerRun;
                System.out.println("Score is "+score+" runs for "+(2-wic)+" wickets");
            }
            else{
                wic--;
                System.out.println("Out!!!");
                System.out.println("Score is "+score+" runs for "+(2-wic)+" wickets");

            }
            if(wic==0){
                System.out.println("Innings over");
                System.out.println("Score is "+score+" runs for "+(2-wic)+" wickets");
                break;
            }
        }
        System.out.println("After 1st innings, we have a target of "+(score+1)+" to be scored in 12 balls");
        int target=score+1;
        int score2=0;
        wic=2;
        System.out.println("Let the run chase begin!!");
        for (int i = 0; i < 12; i++) {
            if(i==0)System.out.println("Second Innings started!!");
            int compRun=rn.nextInt(9)+1;
            System.out.println("Ball "+(i+1));
            System.out.println("enter your run: ");
            int playerRun=sc.nextInt();
            if(playerRun<1 || playerRun>10){
                System.out.println("enter valid runs");
                System.out.println("enter your run: ");
                playerRun=sc.nextInt();
            }
            if(compRun!=playerRun){
                target-=playerRun;
                score2+=playerRun;
                System.out.println("Score is "+score2+" runs for "+(2-wic)+" wickets");
                System.out.println("Runs needed "+target+" in "+(12-(i+1))+" balls");
            }
            else{
                wic--;
                System.out.println("Out!!!");
                System.out.println("Score is "+score2+" runs for "+(2-wic)+" wickets");
                System.out.println("Runs needed "+target+" in "+(12-(i+1))+" balls");
            }
            if(target<1)break;
            if(wic==0){
                System.out.println("Innings over");
                System.out.println("Score is "+score2+" runs for "+(2-wic)+" wickets");
                break;
            }
        }
        if(score==score2)System.out.println("Match tied!!");
        System.out.println(target<1?"Chasing team wins!!":"Defending team wins!!");
        sc.close();
    }
}
