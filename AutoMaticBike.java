import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoMaticBike {

    private boolean isOn;
    private int Speed;
    private int Gear;

    public  boolean TurnOnBike(){
        isOn = true;
        Gear = 1;
        return isOn;

    }
public boolean TurnOffBike(){
        isOn = false;
        return isOn;
    }

    public void Accelorate(){
        if(isOn && Gear == 1) {
            Speed += 1;
        }
        if (isOn && Gear == 2){
            Speed += 2;
        }
        if (isOn && Gear == 3){
            Speed += 3;
        }
        if (isOn && Gear == 4){
            Speed += 4;
        }
        changeGear();
    }
    public int getSpeed(){
        return Speed;
    }
    public void changeGear(){
        if(Speed >= 0 && Speed<= 20){
            Gear = 1;
        }
        if (Speed >= 21 && Speed <= 30) {
            Gear = 2;
        }
        if (Speed >= 31 &&Speed <= 40) {
            Gear = 3;
        }
        if(Speed>= 41 ){
            Gear = 4;
        }


    }

public int getGear(){
        return Gear;
}
}
