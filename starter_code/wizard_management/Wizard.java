package wizard_management;
import behaviours.*;

public class Wizard {
  String name;
  private Flyable ride;

  public Wizard(String name, Flyable ride){
    this.name = name;
    this.ride = ride;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

}