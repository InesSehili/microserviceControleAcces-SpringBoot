package org.sid.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.dao.EnseignantDao;
import org.sid.dao.TableAcceeDao;
import org.sid.entite.Enseignant;
import org.sid.entite.TableAccee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Empreinte.JArduino;
import Empreinte.JArduinoControle;

@RestController
public class AccesServiceWeb {
	@Autowired
	private TableAcceeDao tableAcceeDao;
	
	JArduinoControle arduino = new JArduino("COM4");
	@Autowired
	EnseignantDao enseignantDao ;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/enseignatparIdEmpreinte")
	public Long verifierIdEnseignant()
	{Long id =(long) arduino.recupererIdEmpreinte();
	System.out.println(id);
	return id;
	}
	
	
	
public void verifierAcces()
{}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/allTableAccee")
	  public List<TableAccee>  ListeTableAccee()
		  {return tableAcceeDao.findByColonne();}
	
	

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping(value = "/getTime")
public String getTime()
{Date aujourdhui = new Date();
DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
		 DateFormat.SHORT, DateFormat.SHORT);
String s2=shortDateFormat.format(aujourdhui);

String time=s2.substring(9,14);
return time;}
	

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping(value = "/verifierSeance/{stringTimeAngular}/{stringDebut}/{stirngFin}")
	public boolean verifierSeance(@PathVariable(value = "stringTimeAngular")String stringTimeAngular,@PathVariable(value = "stringDebut")String stringDebut,@PathVariable(value = "stirngFin")String stirngFin)
	{  //hedi la varibale lirayhine hutu fiha le time te3na en format date 
		  Date dateTimeAngular;
		  Date dateDebut;
		  Date dateFin;
		  // Format te3na 
		  SimpleDateFormat formatter=new SimpleDateFormat("HH:mm"); 
		  //
		  try {
			  dateTimeAngular=formatter.parse(stringTimeAngular);
			  dateDebut=formatter.parse(stringDebut);
			  dateFin=formatter.parse(stirngFin);
			  if(dateTimeAngular.after(dateDebut)&& dateTimeAngular.before(dateFin))
			  {return true;}
			  else {
				  System.out.println(false);
			  }
			  

			 
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		return false;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	//Recuperer jour courrant
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/getJour")
	public String jourCourrant()
	{
		Date aujourdhui = new Date();
	DateFormat fullDateFormat =
			 DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
	String s1=fullDateFormat.format(aujourdhui);
		
		
		return s1.substring(0,3);
		
	}
	//n7alou lbab
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/ouvrirPorte", method=RequestMethod.GET)
	public List<TableAccee>   ouvvrirPorte()
	{arduino.swipServoMoteur();
		/*
		 * try { Thread.sleep(400); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } arduino.digitalWrite(1,
		 * JArduino.HIGH);
		 */
	return tableAcceeDao.findByColonne();
	
	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/fermerPorte", method=RequestMethod.GET)
	public List<TableAccee> fermerPorte()
	{arduino.swipServoMoteurtoclose();
	return tableAcceeDao.findByColonne();
	
	}
	
	
	
}
