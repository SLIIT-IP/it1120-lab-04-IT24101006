import java.util.Scanner;
public class IT24101006Lab4Q2{
	public static void main(String[]args){
	 int examMarks,labMarks,percentageExam,percentageLab,sumOfPercentage;
	 double finalMark;
	 Scanner input=new Scanner(System.in);
	 System.out.println("please enter exam marks(out 100):");
	 examMarks=input.nextInt();
	if (examMarks>=0 || examMarks<=100)
	 {
	  System.out.println("please enter lab submission marks(out 100):");
	  labMarks=input.nextInt();
	if (labMarks>=0 && labMarks<=100)
	 {
	  System.out.println("please enter percentage given for the exam :");
	  percentageExam=input.nextInt();
	
	  System.out.println("please enter the percentage given for the lab submission :");
	  percentageLab=input.nextInt();

 		sumOfPercentage=percentageExam+percentageLab;
		if(sumOfPercentage==100){

		finalMark=(examMarks*percentageExam/100)+(labMarks*percentageLab/100);
		System.out.println("Final exam mark is:+finalMark");
		}
	else{
	
	System.out.println("The percentage must add up to 100.Terminating program.");
	}
 }
	else{
	System.out.println("Invalid input for exam marks.Terminating program.");
	}
  }
 }
}	

	  


	
	  
	  



	
