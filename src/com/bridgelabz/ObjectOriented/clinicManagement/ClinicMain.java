package com.bridgelabz.ObjectOriented.clinicManagement;

import com.bridgelabz.utility.Utility;

public class ClinicMain {

	public static void main(String[] args) throws Exception {
		ClinicImplementation clinic=new ClinicImplementation();	
		clinic.readDoctor();
		clinic.readPatient();
		clinic.read();
		boolean message=true;
		while(message)
		{
			System.out.println("enter '1' to add doctor");
			System.out.println("enter '2' to add patient");
			System.out.println("enter '3' to take appointment");
			System.out.println("enter '4' to display appointments and to search");
			System.out.println("enter any other to close");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1: clinic.addDoctor();
					clinic.saveDoctor();
					break;
			case 2: clinic.addPatient();
					clinic.savePatient();
					break;
			case 3: clinic.takeAppointment();
					clinic.save();
					break;
			case 4:clinic.display();
					break;
			default:message=false;
					break;
					
			}
		}
		System.out.println("Clinic Closed");

	}

}
