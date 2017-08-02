import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {
  Driver driver;
  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar(100, 1);
    driver = new Driver("Travis", dodgemCar);
  }

  @Test
  public void testName() {
    assertEquals("Travis", driver.getName() );
  }

  @Test
  public void testdriverHasCar() {
    assertEquals(dodgemCar, driver.getVehicle() );
  }

  @Test 
  public void canDriveTheDistance() {
    assertEquals(2, driver.driveTime(200) );
  }
}