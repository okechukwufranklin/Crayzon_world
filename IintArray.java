public class IintArray {
		public static void main(String... args){

int[] array = {23,43,54,53,43,23,45,23,23,90};

System.out.printf("%s%8s%n","Index", "Value");

for(int counter = 0; counter < array.length;counter++){
	System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}