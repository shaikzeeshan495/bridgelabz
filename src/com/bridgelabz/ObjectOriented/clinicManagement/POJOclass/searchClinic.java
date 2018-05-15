package com.bridgelabz.ObjectOriented.clinicManagement.POJOclass;

import java.util.List;

import com.bridgelabz.utility.Utility;

public class searchClinic {
	
	
	public void searchDoctor(List<Doctor> listDoctor,String details)
	{
		for (Doctor doctor : listDoctor) {
			if (details.equals(doctor.getName()) || 
					details.equals(doctor.getId()) || 
							details.equals(doctor.getSpecialization())) {
				System.out.println(doctor.toString());
			}
			}
	}
	
	public void searchPatient(List<Patient> listPatient,String details)
	{
		for (Patient patient : listPatient) {
			if (details.equals(patient.getName()) || 
					details.equals(patient.getId()) || 
						details.equals(patient.getAge()) || 
							details.equals(patient.getNumber())) 
			{
				System.out.println(patient.toString());
			}
			}
	}
	
	public void search(List<Doctor> listDoctor,List<Patient> listPatient) {
		String detail="";
		boolean message=true;
		while(message)
		{
			System.out.println("enter '1' to search doctor");
			System.out.println("enter '2' to search patient");
			System.out.println("enter '3' to go main menu");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Enter any detail of doctor");
					detail=Utility.inputString();
					searchDoctor(listDoctor,detail);
					break;
			case 2:	System.out.println("Enter any detail of patient");
					detail=Utility.inputString();
					searchPatient(listPatient,detail);
					break;
			case 3:	message=false;
					break;
			default:System.out.println("invalid input");
					break;
		
			}
		}
	}
}
