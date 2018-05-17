package com.bridgelabz.ObjectOriented.clinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Appointment;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Doctor;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Patient;
import com.bridgelabz.utility.Utility;

public class ClinicImplementation implements ClinicManager{
	public static List<Patient> listPatient = new ArrayList<Patient>();
	public static List<Doctor> listDoctor = new ArrayList<Doctor>();
	public static List<Appointment> listAppointment = new ArrayList<Appointment>();
	ObjectMapper mapper = new ObjectMapper();
	static ClinicImplementation clinic=new ClinicImplementation();
	
	
	/* 
	 * Purpose : add person in person list
	 */
	public List<Patient> addPatient() {
		listPatient.add(addPatientDetails());
		for (Patient P : listPatient) {
			System.out.println(P.toString());
		}
		return listPatient;
	}
	
	/**
	 * Purpose : Adding information of person and add it in an object
	 * 
	 * @return object of person with added information in it
	 */
	private Patient addPatientDetails() {
		Patient patient = new Patient();
		System.out.println("Enter Patient name");
		patient.setName(Utility.inputString());
		System.out.println("Enter Patient Id");
		patient.setId(Utility.inputString());
		System.out.println("Enter Patient phone number");
		patient.setNumber(Utility.inputString());
		System.out.println("Enter Patient age");
		patient.setAge(Utility.inputString());
		return patient;
	}
	
	/* 
	 * Purpose : add person in person list
	 */
	public List<Doctor> addDoctor() {
		listDoctor.add(addDoctorDetails());
		for (Doctor doctor : listDoctor) {
			System.out.println(doctor.toString());
		}
		return listDoctor;
	}
	
	/**
	 * Purpose : Adding information of person and add it in an object
	 * 
	 * @return object of person with added information in it
	 */
	private Doctor addDoctorDetails() {
		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor name");
		doctor.setName(Utility.inputString());
		System.out.println("Enter Doctor Id");
		doctor.setId(Utility.inputString());
		System.out.println("Enter Doctor Specialization");
		doctor.setSpecialization(Utility.inputString());
		System.out.println("Enter Doctor availability by 'am' or 'pm' or 'both'");
		doctor.setAvailability(Utility.inputString());
		return doctor;
	}
	
	/* 
	 * Purpose : add person in person list
	 */
	public List<Appointment> addAppointment(Doctor doctor,Patient patient) {
		listAppointment.add(addAppointmentDetails(doctor,patient));
		for (Appointment appointment : listAppointment) {
			System.out.println(appointment.toString());
		}
		return listAppointment;
	}
	
	/**
	 * Purpose : Adding information of person and add it in an object
	 * 
	 * @return object of person with added information in it
	 */
	private Appointment addAppointmentDetails(Doctor doctor,Patient patient) {
		Appointment appointment = new Appointment();
		appointment.setDoctor(doctor);
		appointment.setPatient(patient);
		Date date = new Date();
		appointment.setTime(date.toString());
		return appointment;
	}
	
	/**takeAppointment is a function operation of taking appointment
	 * @throws Exception
	 */
	public void takeAppointment() throws Exception
	{
		int count=0;
		System.out.println("\nenter any doctor details to search\n ID\nname\ncontact\nnumber");
		String details=Utility.inputString();
		String detailsPatient="";
		Doctor doctorAvailabile=clinic.searchDoctor(details);
		System.out.println(doctorAvailabile.getName());
		String doctorName=doctorAvailabile.getName();
		for(Appointment appointment:listAppointment)
		{
			if((doctorAvailabile.toString()).equals(appointment.getDoctor().toString()))
			{
				count++;
			}
		}
		System.out.println("Dr. "+doctorName+" had a "+count+" patients");
		if(count<5)
		{
		System.out.println("\nenter any patient details to search\nId\nname\ncontact\nnumber");
		detailsPatient=Utility.inputString();
		Patient patientAvailabilty=clinic.searchPatient(detailsPatient);
		read();
		listAppointment.add(addAppointmentDetails(doctorAvailabile,patientAvailabilty));
		save();
		for (Appointment appoint : listAppointment) {
			System.out.println(appoint.toString());
		}
		}
		else
		{
			System.out.println("Doctor will be not available today, because of more appointments");
		}
	
	}
	
	/**searchDoctor is to search a doctor availaibility
	 * @param details is String setails of doctor
	 * @return object of doctor
	 * @throws Exception 
	 */
	public Doctor searchDoctor(String details) throws Exception
	{	
		int count=0;
		Doctor doctor=new Doctor();
		for (Doctor doctor1 : listDoctor) {
			if (details.equals(doctor1.getName()) || 
					details.equals(doctor1.getId()) || 
							details.equals(doctor1.getSpecialization())) {
				count++;
				System.out.println("Doctor was Availabile");
				return doctor1;		
			}	
	}
		if(count==0)
		{
			System.out.println("Doctor was not available: \nenter '1' for another doctor\nenter '2' for main menu");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Enter Doctor details");
					details=Utility.inputString();
					searchDoctor(details);
					break;
			case 2:Utility.clinicManagement();
					break;
			default:System.exit(0);
			}
		}
		
		
		return doctor;
	}
	
	/**searchPatient is a function to search patient
	 * @paramdetails is String setails of patient
	 * @return object of patient
	 * @throws Exception 
	 */
	public Patient searchPatient(String details) throws Exception
	{
		Patient patient=new Patient();
		int count=0;
		for (Patient patient1 : listPatient) {
			if (details.equals(patient1.getName()) || 
					details.equals(patient1.getId()) || 
						details.equals(patient1.getAge()) || 
							details.equals(patient1.getNumber())) 
			{
			
				count++;	
				System.out.println("Patient was availabile");	
				return patient1;		
			}	else
				{
					
				}
		}
		if(count==0)
		{
			System.out.println("Patient was not available");
			Utility.clinicManagement();
		}
		
		
		return patient;
	}
	
	
	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void saveDoctor() {
		try {
			mapper.writeValue(new File( "ClinicManagement//Doctors.json"), listDoctor);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void savePatient() {
		try {
			mapper.writeValue(new File( "ClinicManagement//Patients.json"), listPatient);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void save() {
		try {
			mapper.writeValue(new File( "ClinicManagement//ClinicManagement.json"), listAppointment);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void readDoctor() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("ClinicManagement//Doctors.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {
				};
				listDoctor = objectMapper.readValue(arrayToJson, type);
			//	System.out.println(listAppointment.toString());
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void readPatient() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("ClinicManagement//Patients.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {
				};
				listPatient = objectMapper.readValue(arrayToJson, type);
			//	System.out.println(listAppointment.toString());
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void read() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("ClinicManagement//ClinicManagement.json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {
				};
				listAppointment = objectMapper.readValue(arrayToJson, type);
			//	System.out.println(listAppointment.toString());
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	
	
	
	/* 
	 * Purpose : Displaying the list
	 */
	public void printAll() {
		for (Appointment appointment : listAppointment) {
			System.out.println(appointment.toString());
		}
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	public void display() throws Exception
	{
		DisplayClinic display=new DisplayClinic();
		searchClinic search=new searchClinic();
		boolean message=true;
		while(message)
		{
			System.out.println("\n\t\t\t\tDisplay Menu");
			System.out.println("\t\t_____________________________________________\n");
			System.out.println("\t\tenter '1' to display doctor");
			System.out.println("\t\tenter '2' to display patient");
			System.out.println("\t\tenter '3' to display appointment");
			System.out.println("\t\tenter '4' to display Popular Doctor");
			System.out.println("\t\tenter '5' to display Popular Specialization");
			System.out.println("\t\tenter '6' to search");
			System.out.println("\t\tenter '7' for main menu");
			System.out.println("\t\t_____________________________________________");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
					display.displayDoctor(listDoctor);
					break;
			case 2:display.displayPatient(listPatient);
					break;
			case 3:display.displayAppointment(listAppointment);
					break;
			case 4:display.popularDoctor(listDoctor, listAppointment);
					break;
			case 5:display.popularSpecialist(listDoctor, listAppointment);
					break;
			case 6:	search.search(listDoctor,listPatient);
					break;
			case 7:message=false;
					break;
			default :System.out.println("invalid input");
					break;
			}
		}
	}
		
	

}
