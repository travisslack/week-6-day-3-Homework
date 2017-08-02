package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  private int averageSpeed;
  private int numOfSeats;

  public DodgemCar(int averageSpeed, int numOfSeats) { 
  this.averageSpeed = averageSpeed;
  this.numOfSeats = numOfSeats;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

  public int totalSeats() {
    return this.numOfSeats;
  }


}