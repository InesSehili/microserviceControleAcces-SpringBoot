import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Empreinte.JArduino;
import Empreinte.JArduinoControle;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		JArduinoControle arduino = new JArduino("COM4");
		
		
		
		arduino.swipServoMoteurtoclose();
		
		
		
		/*
		 * //hada hua le time te3na String stringTimeAngular="09:00"; String
		 * stringDebut="08:30"; String stirngFin="10:00"; //hedi la varibale lirayhine
		 * hutu fiha le time te3na en format date Date dateTimeAngular; Date dateDebut;
		 * Date dateFin; // Format te3na SimpleDateFormat formatter=new
		 * SimpleDateFormat("HH:mm"); // try {
		 * dateTimeAngular=formatter.parse(stringTimeAngular);
		 * dateDebut=formatter.parse(stringDebut); dateFin=formatter.parse(stirngFin);
		 * if(dateTimeAngular.after(dateDebut)&& dateTimeAngular.before(dateFin))
		 * {System.out.println(true);} else { System.out.println(false); }
		 * 
		 * 
		 * 
		 * } catch (ParseException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 */
		  
		/*20
		 * Date aujourdhui = new Date(); System.out.println(aujourdhui); DateFormat
		 * shortDateFormat = DateFormat.getDateTimeInstance( DateFormat.SHORT,
		 * DateFormat.SHORT); String s2=shortDateFormat.format(aujourdhui);
		 * 
		 * String seance=s2.substring(9,14);
		 * 
		 * 
		 * Date dHhMm1;
		 * 
		 * try { dHhMm1=formatter.parse(seance);
		 * 
		 * System.out.println(seance+"\t"+dHhMm1); if(dHhMm.before(dHhMm1)) {
		 * System.out.println("sont egaux");} } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		/*
		 * JArduinoControle arduino = new JArduino("COM4"); arduino.swipServoMoteur();
		 */
		/*
		 * Date aujourdhui = new Date(); System.out.println(aujourdhui); DateFormat
		 * shortDateFormat = DateFormat.getDateTimeInstance( DateFormat.SHORT,
		 * DateFormat.SHORT); String s2=shortDateFormat.format(aujourdhui);
		 * 
		 * String seance=s2.substring(9,14); String sHhMm="08:00"; Date dHhMm; Date
		 * dHhMm1; SimpleDateFormat formatter=new SimpleDateFormat("HH:mm"); try {
		 * dHhMm1=formatter.parse(seance); dHhMm=formatter.parse(sHhMm);
		 * System.out.println(sHhMm+"\t"+dHhMm); System.out.println(seance+"\t"+dHhMm1);
		 * if(dHhMm.before(dHhMm1)) { System.out.println("sont egaux");} } catch
		 * (ParseException e) { // TODO Auto-generated catch block e.printStackTrace();
		 * }
		 * 
		 * 
		 * 
		 * 
		 * DateFormat fullDateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		 * 
		 * DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
		 * DateFormat.SHORT, DateFormat.SHORT); String
		 * s1=fullDateFormat.format(aujourdhui); String
		 * s2=shortDateFormat.format(aujourdhui); String
		 * jourDeSemaine=s1.substring(0,3); String seance=s2.substring(9,14);
		 * System.out.println(jourDeSemaine); System.out.println(seance);
		 */

	}

}
