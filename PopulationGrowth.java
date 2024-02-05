import java.util.Scanner;
public class PopulationGrowth{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the current year population:");
double cp = input.nextDouble();

System.out.print("Enter The Growth Rate:");
float gr = input.nextFloat();
float grc = (gr / 100);

double afteroneyear = cp * (1 + grc);
double aftertwoyear = afteroneyear * (1 + grc);
double afterthreeyear = aftertwoyear * (1 + grc);
double afterfouryear = afterthreeyear * (1 + grc);
double afterfiveyear = afterfouryear * (1 + grc);

System.out.printf(" Estimate World Population After One Year is:%s%n", afteroneyear);
System.out.printf(" Estimate World Population After Two Year is:%s%n", aftertwoyear);
System.out.printf(" Estimate World Population After Three Year is:%s%n", afterthreeyear);
System.out.printf(" Estimate World Population After Four Year is:%s%n", afterfouryear);
System.out.printf(" Estimate World Population After five Year is:%s%n", afterfiveyear);
 }
}