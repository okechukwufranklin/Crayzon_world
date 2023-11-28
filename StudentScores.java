import java.util.Scanner;
 
 public class StudentScores {
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

int counter = 1;

int highestscore = 0;
String studentname = "franklin";

System.out.print("Enter the number of Student:");
 int studentnumber = input.nextInt();

while(counter <= studentnumber){

System.out.print("Enter name of student:");
String name = input.next();

System.out.print("enter score of student:");
 int score = input.nextInt();

if (score > highestscore){
highestscore = score;
studentname = name;
}

counter = counter + 1;
}

System.out.printf("Student with the highest score is:%s%n%d",studentname, highestscore);
 }
}