import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {
  QuadBike quad;
  
  @Before
  public void before () {
    quad = new QuadBike(20, 100);

  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, quad.driveTime(20) );
  }

  @Test public void totalEngineCapacity() {
    assertEquals(100, quad.totalCapacity() );
  }
}