package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mockTSP;
  private TorpedoStore mockTSS;

  @BeforeEach
  public void init(){
    mockTSP = mock(TorpedoStore.class);
    mockTSS = mock(TorpedoStore.class);
    this.ship = new GT4500(mockTSP,mockTSS);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when(mockTSP.fire(1)).thenReturn(true);
    when(mockTSS.fire(1)).thenReturn(true);
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange
    when(mockTSP.fire(1)).thenReturn(true);
    when(mockTSS.fire(1)).thenReturn(true);
    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
