import java.util.*;

class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double marks[]=new double[5];
        double sum=0.0,avgper;
        int i;
        System.out.println("Enter the marks in sequence: English, Hindi, Maths, Science and Computer out of 100");

            for(i=0;i<5;i++)
            {
                while (true) {
                    
                try{
                marks[i]=sc.nextDouble();
                if(marks[i]<0 || marks[i]>100){
                    System.out.println("Please enter marks greater or equal to 0 and less than or equal to 100");
                    
                }
                else 
                break;
            }
            

        catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter number format!");
            sc.next();
            
        }
    }
    }


        for(i=0;i<5;i++)
        {
            sum+=marks[i];
        }
        
        avgper=(sum/500)*100;
            
        System.out.println("Total Marks out of 500 = "+sum);
        System.out.println("Average Percentage = "+avgper+" % ");
        if (avgper>=90)
            System.out.println("Grade: O ");
        else if(avgper>=80)
            System.out.println("Grade E");  
        else if(avgper>=70)
            System.out.println("Grade A");
        else if(avgper>=60)
            System.out.println("Grade B");
        else if(avgper>=50)
            System.out.println("Grade C");
        else if(avgper>=40)
            System.out.println("Grade D");
        else 
            System.out.println("Grade F");

    
    System.out.println("Note: Grading Table");
    System.out.println("Qualification \t Grade \t Percentage of marks");
    System.out.println("Outstanding \t O \t 90 and above");
    System.out.println("Excellent  \t E \t 80 to 89");
    System.out.println("Very Good  \t A \t 70 to 79");
    System.out.println("Good  \t \t B \t 60 to 69");
    System.out.println("Fair  \t \t C \t 50 to 59");
    System.out.println("Below Average  \t D \t 40 to 49");
    System.out.println("Fail/Absent  \t F \t Below 40");
    
    

    }
    
}
