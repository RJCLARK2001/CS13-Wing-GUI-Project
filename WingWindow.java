import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WingWindow extends JFrame implements ActionListener, AirDensity 
{
   private JLabel lblMode;
   private JTextField tfMode;   
   private JLabel lblSpan;
   private JTextField tfSpan;
   private JLabel lblChord;
   private JTextField tfChord;
   private JLabel lblvCruise;
   private JTextField tfvCruise;
   private JLabel lblvStall;
   private JTextField tfvStall;
   private JLabel lblcLiftMax;
   private JTextField tfcLiftMax;
   private JLabel lblcLiftCruise;
   private JTextField tfcLiftCruise;
   private JLabel lblaltitudeTO;
   private JTextField tfaltitudeTO;
   private JLabel lblaltitudeCruise;
   private JTextField tfaltitudeCruise;
   private JButton btnCalcDynamicPressure;
   private JLabel lblCalcDynamicPressure;
   private JButton btnCalcTotalLift;
   private JLabel lblCalcTotalLift;
   private JButton btnCalcWingLoad;
   private JLabel lblCalcWingLoad;

   
   public WingWindow()
   {
      super("Wing Calculation");
      setLayout( new GridLayout(12, 2) );
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 500, 300 );
      
      lblMode = new JLabel ( "      Mode (0 for TAKEOFF or 1 for CRUISE)" );
      tfMode = new JTextField(8);      
      lblSpan = new JLabel ( "      Span" );
      tfSpan = new JTextField(8);
      lblChord = new JLabel ( "     Chord" );
      tfChord = new JTextField(8);
      lblvCruise = new JLabel ( "     vCruise" );
      tfvCruise = new JTextField(8);
      lblvStall = new JLabel ( "     vStall" );
      tfvStall = new JTextField(8);
      lblcLiftMax = new JLabel ( "     cLiftMax" );
      tfcLiftMax = new JTextField(8);
      lblcLiftCruise = new JLabel ( "     cLiftCruise" );
      tfcLiftCruise = new JTextField(8);
      lblaltitudeTO = new JLabel ( "     altitudeTO" );
      tfaltitudeTO = new JTextField(8);
      lblaltitudeCruise = new JLabel ( "     altitudeCruise" );
      tfaltitudeCruise = new JTextField(8);      
      btnCalcDynamicPressure = new JButton( "Dyanamic Pressure" );
      lblCalcDynamicPressure = new JLabel( "      0" );
      btnCalcTotalLift = new JButton( "Total Lift" );
      lblCalcTotalLift = new JLabel( "       0" );
      btnCalcWingLoad = new JButton( "Wing Load" );
      lblCalcWingLoad = new JLabel( "       0" );
       
      add( lblMode );
      add( tfMode );           
      add( lblSpan );
      add( tfSpan );
      add( lblChord );
      add( tfChord );
      add( lblvCruise );
      add( tfvCruise );
      add( lblvStall );
      add( tfvStall );
      add( lblcLiftMax );
      add( tfcLiftMax );            
      add( lblcLiftCruise );
      add( tfcLiftCruise );      
      add( lblaltitudeTO );
      add( tfaltitudeTO );      
      add( lblaltitudeCruise );
      add( tfaltitudeCruise );      
      add( btnCalcDynamicPressure );
      add( lblCalcDynamicPressure );
      add( btnCalcTotalLift );
      add( lblCalcTotalLift );
      add( btnCalcWingLoad );
      add( lblCalcWingLoad );
      
      btnCalcDynamicPressure.addActionListener( this );
      btnCalcTotalLift.addActionListener( this );
      btnCalcWingLoad.addActionListener( this );
                  
      setVisible( true );
   }
   
   public void actionPerformed(ActionEvent e)
   {
      int mode = Integer.parseInt(tfMode.getText() );      
      double span = Float.parseFloat( tfSpan.getText() );
      double chord = Float.parseFloat( tfChord.getText() );
      double vCruise = Float.parseFloat( tfvCruise.getText() );
      double vStall = Float.parseFloat( tfvStall.getText() );
      double cLiftMax = Float.parseFloat( tfcLiftMax.getText() );
      double cLiftCruise = Float.parseFloat(tfcLiftCruise.getText() );
      int altitudeTO = Integer.parseInt(tfaltitudeTO.getText() );
      int altitudeCruise = Integer.parseInt(tfaltitudeCruise.getText() );
                      
      Wing w = new Wing( span, chord, vCruise, vStall, cLiftMax, 
                         cLiftCruise, altitudeTO, altitudeCruise  );
       
      lblCalcDynamicPressure.setText( Double.toString( w.q(mode) ) );
      lblCalcTotalLift.setText( Double.toString( w.totalLift(mode) ) );
      lblCalcWingLoad.setText( Double.toString( w.wingLoading(mode) ) );
   }

   public static void main(String args[])
   {
      WingWindow frame = new WingWindow();
   }  
}