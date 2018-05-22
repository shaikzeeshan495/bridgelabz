package com.bridgelabz.ObjectOriented.clinicManagement.Modal;
/**POJO class of Doctor.
 * @author Zeeshan
 * Date : 15-05-2018
 *
 */
public class Doctor {
	
	String name;
	String id;
	String specialization;
	String availability;
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "\n\tDoctor\t\t[name\t\t=\t" + name +"\n\t\t\tid\t\t=\t" + id + "\n\t\t\tspecialization\t=\t" + specialization + "\n\t\t\tavailability\t=\t" + availability + "]";
	}
	
}
