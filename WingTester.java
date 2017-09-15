/*
   WingTester.java class to execute Wing.java class
   
   Implements AirDensity class
*/
public class WingTester implements AirDensity
{
   public static void main( String[] args )
   {
      // new oject created with user input parameters
      Wing wing1 = new Wing( 28, 4.2, 120, 45, 1.2, 0.3, 0, 8);
      
      // print statement for methods using user input parameter      
      System.out.printf( "Dynamic Pressure(Take off):   %.2f\n", wing1.q( TAKEOFF ));
      System.out.printf( "Total Lift (Take off):      %.2f\n", wing1.totalLift( TAKEOFF ));
      System.out.printf( "Wing Loading (Take off):      %.2f\n\n", wing1.wingLoading( TAKEOFF ));
      
      // print statement for methods using user input parameter  
      System.out.printf( "Dynamic Pressure(Cruise):     %.2f\n", wing1.q( CRUISE ));
      System.out.printf( "Total Lift (Cruise):        %.2f\n", wing1.totalLift( CRUISE ));
      System.out.printf( "Wing Loading (Cruise):        %.2f\n\n", wing1.wingLoading( CRUISE ));
   }   
}