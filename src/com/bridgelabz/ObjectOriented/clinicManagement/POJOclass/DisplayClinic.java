package com.bridgelabz.ObjectOriented.clinicManagement.POJOclass;

import java.util.List;

public class DisplayClinic {
	public void displayDoctor(List<Doctor> listDoctor)
	{
		for (Doctor doctor : listDoctor) {
			System.out.println(doctor.toString());
		}
	}
	
	public void displayPatient(List<Patient> listPatient)
	{
		for (Patient patient : listPatient) {
			System.out.println(patient.toString());
		}
	}
	
	public void displayAppointment(List<Appointment> listAppointment)
	{
		for (Appointment appointment : listAppointment) {
			System.out.println(appointment.toString());
		}
	}

}
