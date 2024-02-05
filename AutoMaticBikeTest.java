import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AutoMaticBikeTest {
 @Test
 public void TestThatBikeTurnsOn(){
    AutoMaticBike autoMaticBike = new AutoMaticBike();
     assertTrue(autoMaticBike.TurnOnBike());
 }
 @Test
 public void TestThatBikeIsOff(){
  AutoMaticBike  autoMaticBike = new AutoMaticBike();
  assertFalse(autoMaticBike.TurnOffBike());
 }

 @Test
 public void TestThatBikeCanAccelorate(){
  AutoMaticBike autoMaticBike = new AutoMaticBike();
  autoMaticBike.TurnOnBike();
assertEquals(0,autoMaticBike.getSpeed());

  autoMaticBike.Accelorate();
  assertEquals(1,autoMaticBike.getSpeed());

 }
 @Test
 public void TestGearOne(){
  AutoMaticBike autoMaticBike = new AutoMaticBike();
  autoMaticBike.TurnOnBike();
  assertTrue(autoMaticBike.TurnOnBike());
  assertEquals(1,autoMaticBike.getGear());

  for(int counter = 0;counter < 21;counter++){
   autoMaticBike.Accelorate();
  }
  assertEquals(21,autoMaticBike.getSpeed());
  assertEquals(2,autoMaticBike.getGear());

 }
 @Test
 public void TestGearTwo(){
  AutoMaticBike autoMaticBike = new AutoMaticBike();
  autoMaticBike.TurnOnBike();
  assertTrue(autoMaticBike.TurnOnBike());
  assertEquals(1,autoMaticBike.getGear());

  for(int counter = 0;counter < 21;counter++){
   autoMaticBike.Accelorate();
  }
  assertEquals(21,autoMaticBike.getSpeed());
  assertEquals(2,autoMaticBike.getGear());

 }
}

