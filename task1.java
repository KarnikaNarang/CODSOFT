import java.util.*;
class task1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int i;
        int num=0;
        boolean playagain=true;
        int r=ran.nextInt(100);
        System.out.println(r);
        while (playagain==true) {
            
        System.out.println("Guess the number generated from 1 to 100");
        boolean valid;
        for(i=1;i<=5;i++)
        {
            valid=false;
            while (!valid) {
                
            
        try{
        num=sc.nextInt();
        valid=true;
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input: Please Enter a number.");
            sc.next();

        }
    }

        
        if (num>r)
        System.out.println("Too High");
        else if(num<r)
        System.out.println("Too Low");
        else{
        System.out.println("Congratulations You Guessed It Right!!");
        System.out.println("Number of attempts: "+i);
        break;
        }
        }
        if(i>5)
        System.out.println("Attempts Finished!!");
        System.out.println("Do you want to play again: y/n?");
        char yesorno=sc.next().charAt(0);
        yesorno=Character.toLowerCase(yesorno);
        if (yesorno=='n')
        playagain=false;
        else if(yesorno=='y')
        playagain=true;
        else{
            playagain=false;
            System.out.println("Invalid Input. Please enter y/n only.");
            sc.next();
        }

    }
    }
}