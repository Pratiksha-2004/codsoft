import java.util.Scanner;
public class Gradecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the total number of subjects: ");
        int nS = sc.nextInt();
        int total = 0;
        for(int i= 1; i<= nS; i++){
            System.out.println("Enter the marks obtained in "+ i + " subject: ");
            int marks= sc.nextInt();
            total+= marks;
        }

        double  averP = (double)total/nS;

        char Grade;
        if(averP>=90){
            Grade='O';

        }
        else if(averP>=80 && averP<90){
            Grade='E';
        }
        else if(averP>=70 && averP<80){
            Grade='A';
        }
        else if(averP>=60 && averP<70){
            Grade='B';
        }
        else if(averP>=50 && averP<60){
            Grade='C';

        }
        else if(averP>=40 && averP<50){
            Grade='D';
        }
        else if(averP>=30 && averP<40){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Total Marks Scored is:  "+total);
        System.out.println("Average Percentage Gained  is:  "+averP+"%");
        System.out.println("Grade Obtained is :  "+Grade);
        sc.close();
        



        
    }
}