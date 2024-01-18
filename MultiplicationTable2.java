public class MultiplicationTable2{
	public static void main(String... args){

for(int counter = 0; counter < 13;counter ++){
	for(int number = 0; number <= 12; number++){
int result = number * counter ;
System.out.print(number+("x")+counter+("=")+result+"    \t");

}
System.out.println();
}

	}
}
