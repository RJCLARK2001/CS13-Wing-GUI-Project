/*
   Interface for Wing.java program creating array
   of air density readings at various altitudes.
*/

public interface AirDensity
{
   public final double[] AIR_DENSITY = { 0.00238,
                                         0.00231,
                                         0.00224,
                                         0.00218,
                                         0.00211,
                                         0.00205,
                                         0.00199,
                                         0.00193,
                                         0.00187,
                                         0.00181,
                                         0.00176  };
                                         
   public final int TAKEOFF = 0;
   public final int CRUISE = 1; 
   public final double KNOTS_TO_FPS = 1.689; 
}