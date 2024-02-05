
public class CarAplication {
public static void main(String[] args) {

Car myCar1 = new Car("Toyota Camry","2024",24.50000);
Car myCar2 = new Car("Mecades Benz","2024",101.60000);

System.out.println(" Getting Information Of Car Please Wait...");

myCar1.setmodel("Toyota Camry");
System.out.printf("Model: %s%n",myCar1.getmodel());

myCar1.setyear("2024");
System.out.printf("Year :%s%n",myCar1.getyear());

myCar1.setprice(24.5000000);
System.out.printf("price :%.3f%n",myCar1.getprice());

myCar2.setmodel("Mesades Benz");
System.out.printf("Model :%s%n",myCar2.getmodel());

myCar2.setyear("2024");
System.out.printf("Year :%s%n",myCar2.getyear());

myCar2.setprice(101.60000);
System.out.printf("Price :%.3f%n%n",myCar2.getprice());
 }
} 








