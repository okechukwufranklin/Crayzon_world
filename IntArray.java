package fireDrillTwo;

public class IntArray {
    public static void main(String... args){

        int[] array = new int[100];

        System.out.printf("%s%8s%n","Index", "Value");

        for(int counter = 0; counter < array.length;counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
