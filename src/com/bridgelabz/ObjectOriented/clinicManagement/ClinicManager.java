package com.bridgelabz.ObjectOriented.clinicManagement;
/******************************************************************************
 *  Purpose:	ClinicManager interface for ClinicManager
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
import java.util.List;

import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Doctor;
import com.bridgelabz.ObjectOriented.clinicManagement.POJOclass.Patient;

public interface ClinicManager {
	
	public List<Doctor> addDoctor();
	public List<Patient> addPatient();
	public void takeAppointment() throws Exception;
	public void save();
	public void read() throws Exception;
	public void display() throws Exception;

}
