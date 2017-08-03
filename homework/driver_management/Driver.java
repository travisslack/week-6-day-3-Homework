package driver_management;
import behaviours.*;

public class Driver {
  String name;
  private Driveable drive;

  public Driver( String name, Driveable drive) {
    this.name = name;
    this.drive = drive;
  }

  public String getName() {
    return this.name;
  }

  public Driveable getVehicle() {
    return this.drive;
  }

  public int driveTime(int distance) {
    return this.drive.driveTime(distance);
  }




}