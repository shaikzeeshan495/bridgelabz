package com.bridgelabz.ObjectOriented.clinicManagement.Controller;
/******************************************************************************
 *  Purpose:	Clinic Management to display clinic details
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   15-05-2018
 *
 ******************************************************************************/
import java.util.List;

import com.bridgelabz.ObjectOriented.clinicManagement.Modal.Appointment;
import com.bridgelabz.ObjectOriented.clinicManagement.Modal.Doctor;
import com.bridgelabz.ObjectOriented.clinicManagement.Modal.Patient;

public class DisplayClinic {
	
	/**displayDoctor to display doctor details.
	 * @param listDoctor is a list of doctors.
	 */
	public void displayDoctor(List<Doctor> listDoctor)
	{
		for (Doctor doctor : listDoctor) {
			System.out.println(doctor.toString());
		}
	}
	
	/**displayPatient to display patient details.
	 * @param listPatient is a list of patient.
	 */
	public void displayPatient(List<Patient> listPatient)
	{
		for (Patient patient : listPatient) {
			System.out.println(patient.toString());
		}
	}
	
	/**displayAppointment to display Appointment details.
	 * @param listAppointment is a list of Appointment.
	 */
	public void displayAppointment(List<Appointment> listAppointment)
	{
		for (Appointment appointment : listAppointment) {
			System.out.println(appointment.toString());
		}
	}
	
	/**popularDoctor to display popular doctor.
	 * @param listDoctor is a list of doctors.
	 * @param listAppointment is a list of Appointments.
	 */
	public void popularDoctor(List<Doctor> listDoctor,List<Appointment> listAppointment)
	{
		
		for(Doctor doctor:listDoctor)
		{
			int count=0;
		for(Appointment appointment:listAppointment)
		{
			if((doctor.toString()).equals(appointment.getDoctor().toString()))
			{
				count++;
			}
		}
		if(count>=5)
		{
			System.out.println("\t\tPopular Doctor in our clinic");
			System.out.println(doctor.toString());
		}
		}
	}
	
	/**popularSpecialist to display popular specialization in clinic.
	 * @param listDoctor  is a list of doctors.
	 * @param listAppointment is a list of Appointments.
	 */
	public void popularSpecialist(List<Doctor> listDoctor,List<Appointment> listAppointment)
	{
		
		for(Doctor doctor:listDoctor)
		{
			int count=0;
		for(Appointment appointment:listAppointment)
		{
			if((doctor.toString()).equals(appointment.getDoctor().toString()))
			{
				count++;
			}
		}
		if(count>=5)
		{
			System.out.println("\t\tPopular Specialization in our clinic");
			System.out.println("\t\t"+"Dr."+doctor.getName()+" '"+doctor.getSpecialization().toString()+"' Specialist");
		}
		}
	}

}
