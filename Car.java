public class Car{

private String model;

private String year;

private double price;

public Car(String model,String name, double price){
this.model = model;

this.year = year;

if (price > 0.0)
this.price = price;
}


public void setmodel(String model){
this.model = model;
}

public String getmodel(){
return model;
}

public void setyear(String year){
this.year = year;
}

public String getyear(){
return year;
}
public void setprice(double priceamount){
if(priceamount > 0.0){
price = price + priceamount;
}
}
public double getprice(){
return price;
}
}


