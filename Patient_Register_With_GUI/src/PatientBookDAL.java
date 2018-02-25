

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PatientBookDAL {
	
	PatientBook patientBook;
	String path;
	private String roomNobedNo, name, bolum, age, gender, checkIn, cause, gFeatures, surveys, examination,
	wSurveys, konsultasyon;

	public PatientBookDAL(PatientBook patientBook, String path) {
		this.patientBook = patientBook;
		this.path = path;
	}
	
	public void readAll() {
		Patient patient;
		Scanner scanner;
		StringTokenizer tokenizer;

		try {
			scanner = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			System.out.println("DOSYA BULUNAMADI!");
			return;
		}

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			tokenizer = new StringTokenizer(line, ",");
			
			if (tokenizer.hasMoreTokens()) {
				roomNobedNo = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				name = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				bolum = tokenizer.nextToken();
			}

			if (tokenizer.hasMoreTokens()) {
				age = tokenizer.nextToken();
			}

			if (tokenizer.hasMoreTokens()) {
				gender = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				checkIn = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				cause = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				gFeatures = tokenizer.nextToken();
			}

			if (tokenizer.hasMoreTokens()) {
				surveys = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				examination = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				wSurveys = tokenizer.nextToken();
			}
			
			if (tokenizer.hasMoreTokens()) {
				konsultasyon = tokenizer.nextToken();
			}




			patient = new Patient(roomNobedNo, name, bolum, age, gender, checkIn, cause, gFeatures, surveys, examination,
					wSurveys, konsultasyon);
			patientBook.addPatient(patient);
		}
		scanner.close();
	}
	
	/*public void saveAll() {
		PrintWriter outputStream;
		
		try {
			outputStream = new PrintWriter(new FileOutputStream("patient.txt"));
		} catch (Exception e) {
			System.out.println("Cannot write to file");
			return;
		}

		ArrayList<Patient> patientList = patientBook.getPatientList();
		for (Patient patient : patientList) {
			outputStream.println(patient.toFile());
		}
		
		outputStream.close();	
	}*/
	
	public void saveAll(){
		PrintWriter pw=null;
		
		try{
			
			pw=new PrintWriter(new FileOutputStream("patient.txt"));
			
		}catch(Exception e){
			System.out.println("Error when you write to file"+e.getMessage());
		}
		
		
		ArrayList<Patient> patientList=patientBook.getPatientList();
		
		for(Patient patient:patientList){
			pw.println(patient.toFile());
		}
		pw.close();
	}

}
