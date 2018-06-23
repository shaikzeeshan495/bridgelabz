package com.bridgelabz.ObjectOriented.clinicManagement.Modal;

/**POJO class of Patient.
 * @author Zeeshan
 * Date : 15-05-2018
 *
 */
public class Patient {
	private String name;
	private String id;
	private String number;
	private String age;
	public String getName() {
		return name;
	}	
	public String getId() {
		return id;
	}
	public String getNumber() {
		return number;
	}
	public String getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "\n\tPatient\t\t[name\t=\t" + name + "\n\t\t\tid\t=\t" + id + "\n\t\t\tnumber\t=\t" + number + "\n\t\t\tage\t=\t" + age + "]";
	}

}
