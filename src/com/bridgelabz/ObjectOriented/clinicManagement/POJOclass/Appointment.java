package com.bridgelabz.ObjectOriented.clinicManagement.POJOclass;
/**POJO class of Appointment.
 * @author Zeeshan
 * Date : 15-05-2018
 *
 */
public class Appointment {
	
	Doctor doctor;
	Patient patient;
	String date;
	public Doctor getDoctor() {
		return doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public String getTime() {
		return date;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public void setTime(String time) {
		this.date = time;
	}
	@Override
	public String toString() {
		return "\nAppointment\t:\n" + doctor +"\n" + patient + "\n\t\t\ttime=" + date;
	}
	

}
