import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;
import behaviours.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    // casting below
    Broomstick ride = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  // @Test
  // public void travelSpeed() {
  //   assertEquals( 10 , wizard.getBroomstick().getSpeed());
  // }

  @Test
  public void canFly(){
    assertEquals("mounting broom, running, skipping, flying!", wizard.fly());
  }

  @Test
  public void canFlyDragon() {
    Dragon dragon = new Dragon("Tilly");
    wizard = new Wizard("Toby", dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly() );
  }

  @Test
  public void canFlyMagicCarpet() {
    MagicCarpet carpet = new MagicCarpet("purple");
    wizard = new Wizard ("Toby", carpet);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly() );
  }

  @Test
  public void canSetRide() {
    Dragon dragon = new Dragon("Eric");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly() );
  }
}