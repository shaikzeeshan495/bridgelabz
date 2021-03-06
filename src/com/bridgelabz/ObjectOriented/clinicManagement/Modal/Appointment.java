package com.bridgelabz.ObjectOriented.clinicManagement.Modal;
/**POJO class of Appointment.
 * @author Zeeshan
 * Date : 15-05-2018
 *
 */
public class Appointment {
	
	private Doctor doctor;
	private Patient patient;
	private String date;
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
		return "\nAppointment\t:\n" + doctor +"\n" + patient + "\n\t\t\ttime\t=\t" + date;
	}
	

}
