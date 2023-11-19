import java.util.Scanner;
 public class Day {
 public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter Year:");
int kk = input.nextInt();

System.out.print(" Enter Month 1-12:");
int m = input.nextInt();

System.out.print(" Enter Day Of Month 1-31:");
int q = input.nextInt();

int k = kk%100;

int j = kk/100;

int h = (q +((26 * (m+1) /10) + kk + (kk / 4) + (j / 4)+ 5 * j + 5 + 2))%7;

if (h == 0)
System.out.print(" Day Of The Week Is Saturday ");

if (h == 1)
System.out.print(" Day Of The Week Is Sunday ");

if (h == 2)
System.out.print(" Day Of The Week Is Monday ");

if (h == 3)
System.out.print(" Day Of The Week Is Tuesday ");

if (h == 4)
System.out.print(" Day Of The Week Is Wednesday ");

if (h == 5)
System.out.print(" Day Of The Week Is Thursday ");

if (h == 6)
System.out.print(" Day Of The Week Is Friday ");
 
 }
}








