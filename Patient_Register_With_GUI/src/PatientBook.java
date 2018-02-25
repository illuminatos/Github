

import java.util.ArrayList;

public class PatientBook {

	ArrayList<Patient> patientList;
	PatientBookDAL patientBookDal;
    PatientBookGUI patientBookGUI;

   	private int recordNumber;	 // used to navigate using >> and << buttons 

   	public PatientBook() {
	    recordNumber = -1;
	
	    patientList = new ArrayList<Patient>();
	
	    // creating PatientBookDataAccessLayer object
	    String path = "patient.txt";
	    patientBookDal = new PatientBookDAL(this, path);
	    patientBookDal.readAll();

	    // creating PatientBookGraphicalUserInterface object	
	    patientBookGUI = new PatientBookGUI(this);

	    patientBookGUI.create();
   	}

   	public void addPatient(Patient patient) {
   		patientList.add(patient);
   		recordNumber++;
   		System.out.println(recordNumber + " " + patient.toString());
   	}

   	public ArrayList<Patient> getPatientList() {
   		return patientList;
   	}
   	
   	public void saveAllToFile() {
   		patientBookDal.saveAll();
   	}
   	
   	public void clear() {
   		patientList.clear();
   		recordNumber = -1;
   	}
   	
   	public int getSize() {
   		return patientList.size();
   	}
   	
   	public void savePatient(Patient patient) {
   		patientList.add(patient);
   		recordNumber++;
   		System.out.println(recordNumber + " " + patient.toString());
   	}
   	
   	public boolean removePatient(String roomNobedNo) {
   		for (Patient patientSearched : patientList) {
   			if (patientSearched.getRoomNobedNo().equals(roomNobedNo)) {
   				patientList.remove(patientSearched);
   				recordNumber--;
   				return true;
   			}  			
   		}
   		return false;
   	}
   	
   	public boolean updatePatient(String roomNobedNo, Patient patient) {
   		for (Patient patientSearched : patientList) {
   			if (patientSearched.getRoomNobedNo().equals(roomNobedNo)) {
   				patientList.remove(patientSearched);
   				patientList.add(patient);
   		   		System.out.println(recordNumber + " " + patient.toString());
   				return true;
   			}  			
   		}
   		return false;   		
   	}
   	
	public Patient searchPatient(String roomNobedNo) {
   		for (Patient patientSearched : patientList) {
   			if (patientSearched.getRoomNobedNo().equals(roomNobedNo)) {
   				return patientSearched;
   			}  			
   		}
   		return null;   		   		
   	}
	
	public Patient getPatientAtRecordNumber() {
		return patientList.get(recordNumber);
	}
	
	public int getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(int recordNumber) {
		this.recordNumber = recordNumber;
	}
	
	public void incrementRecordNumber() {
		recordNumber++;
	}
	
	public void decrementRecordNumber() {
		recordNumber--;
	}
	
}
