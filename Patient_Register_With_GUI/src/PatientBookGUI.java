

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class PatientBookGUI implements ActionListener {

	JFrame appFrame;
	Container cPane;

	JLabel jlbRoomNobedNo, jlbName, jlbBolum, jlbAge, jlbGender, jlbCheckIn, jlbCause, jlbGFeatures, jlbSurveys,
	jlbExamination, jlbWSurveys, jlbKonsultasyon;
	JTextField jtfRoomNobedNo, jtfName, jtfBolum, jtfAge, jtfCheckIn, jtfGender;
	JTextArea jtaCause, jtaGFeatures, jtaSurveys, jtaExamination, jtaWSurveys, jtaKonsultasyon;
	JButton jbbSave, jbnDelete, jbnClear, jbnUpdate, jbnSearch,
	jbnForward, jbnBack, jbnExit;

	PatientBook patientBook;
	
	public PatientBookGUI(PatientBook patientBook) {
		
		this.patientBook = patientBook;
		
		/*Create the frame and get its ContentPane*/
		appFrame = new JFrame("HASTA KAYIT FORMU");
		cPane = appFrame.getContentPane();
	}

	public void create(){
		/*Set layout*/
		cPane.setLayout(new GridBagLayout()); 		

		//Arrange components on contentPane and set Action Listeners to each JButton
		arrangeComponents();

		appFrame.setSize(1000,1000);
		appFrame.setResizable(false);
		appFrame.setVisible(true);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayCurrentRecord();
	}

	public void arrangeComponents(){
		jlbRoomNobedNo      = new JLabel("ODA-YATAK NO");
		jlbName    = new JLabel("AD-SOYAD");
		jlbBolum = new JLabel("BÖLÜM");
		jlbAge   = new JLabel("YAÞ");
		jlbGender   = new JLabel("CÝNSÝYET");
		jlbCheckIn   = new JLabel("YATIÞ TARÝHÝ");
		jlbCause   = new JLabel("YATIÞ NEDENÝ");
		jlbGFeatures   = new JLabel("GENEL ÖZELLÝKLERÝ");
		jlbSurveys   = new JLabel("DIÞ MERKEZ TETKÝKLER");
		jlbExamination   = new JLabel("FÝZÝK MUAYENE");
		jlbWSurveys   = new JLabel("ÝSTENEN TETKÝKLER");
		jlbKonsultasyon   = new JLabel("KONSULTASYON");
		
		

		jtfRoomNobedNo      = new JTextField(6);
		jtfName    = new JTextField(20);
		jtfBolum = new JTextField(20);
		jtfAge   = new JTextField(6);
		jtfCheckIn   = new JTextField(10);
		jtaCause = new JTextArea(3,20);
		jtfGender = new JTextField(6);
		jtaGFeatures = new JTextArea(3,20);
		jtaSurveys = new JTextArea(3,20);
		jtaExamination = new JTextArea(3,20);
		jtaWSurveys = new JTextArea(3,20);
		jtaKonsultasyon = new JTextArea(3,20);
		
		jbbSave   = new JButton("KAYDET");
		jbnDelete = new JButton("SÝL");
		jbnClear  = new JButton("TEMÝZLE");
		jbnUpdate = new JButton("GÜNCELLE");
		jbnSearch = new JButton("ARA");

		jbnForward = new JButton(">>");
		jbnBack    = new JButton("<<");
		jbnExit    = new JButton("ÇIKIÞ");

		/*add all initialized components to the container*/
		GridBagConstraints gridBagConstraintsx01 = new GridBagConstraints();
		gridBagConstraintsx01.gridx = 0;
		gridBagConstraintsx01.gridy = 0;
		gridBagConstraintsx01.insets = new Insets(5,5,5,5); 
		cPane.add(jlbRoomNobedNo, gridBagConstraintsx01);

		GridBagConstraints gridBagConstraintsx02 = new GridBagConstraints();
		gridBagConstraintsx02.gridx = 1;
		gridBagConstraintsx02.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx02.gridy = 0;
		gridBagConstraintsx02.gridwidth = 2;
		gridBagConstraintsx02.fill = GridBagConstraints.BOTH;
		cPane.add(jtfRoomNobedNo, gridBagConstraintsx02);
		
		

		GridBagConstraints gridBagConstraintsx03 = new GridBagConstraints();
		gridBagConstraintsx03.gridx = 0;
		gridBagConstraintsx03.gridy = 1;
		gridBagConstraintsx03.insets = new Insets(5,5,5,5); 
		cPane.add(jlbName, gridBagConstraintsx03);

		GridBagConstraints gridBagConstraintsx04 = new GridBagConstraints();
		gridBagConstraintsx04.gridx = 1;
		gridBagConstraintsx04.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx04.gridy = 1;
		gridBagConstraintsx04.gridwidth = 2;
		gridBagConstraintsx04.fill = GridBagConstraints.BOTH;
		cPane.add(jtfName, gridBagConstraintsx04);
		
		GridBagConstraints gridBagConstraintsx05 = new GridBagConstraints();
		gridBagConstraintsx05.gridx = 0;
		gridBagConstraintsx05.gridy = 2;
		gridBagConstraintsx05.insets = new Insets(5,5,5,5); 
		cPane.add(jlbAge, gridBagConstraintsx05);

		GridBagConstraints gridBagConstraintsx06 = new GridBagConstraints();
		gridBagConstraintsx06.gridx = 1;
		gridBagConstraintsx06.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx06.gridy = 2;
		gridBagConstraintsx06.gridwidth = 2;
		gridBagConstraintsx06.fill = GridBagConstraints.BOTH;
		cPane.add(jtfAge, gridBagConstraintsx06);

		GridBagConstraints gridBagConstraintsx07 = new GridBagConstraints();
		gridBagConstraintsx07.gridx = 0;
		gridBagConstraintsx07.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx07.gridy = 3;
		cPane.add(jlbBolum, gridBagConstraintsx07);

		GridBagConstraints gridBagConstraintsx08 = new GridBagConstraints();
		gridBagConstraintsx08.gridx = 1;
		gridBagConstraintsx08.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx08.gridy = 3;
		gridBagConstraintsx08.gridwidth = 2;
		gridBagConstraintsx08.fill = GridBagConstraints.BOTH;
		cPane.add(jtfBolum, gridBagConstraintsx08);
		
		GridBagConstraints gridBagConstraintsx09 = new GridBagConstraints();
		gridBagConstraintsx09.gridx = 0;
		gridBagConstraintsx09.gridy = 4;
		gridBagConstraintsx09.insets = new Insets(5,5,5,5); 
		cPane.add(jlbCheckIn, gridBagConstraintsx09);

		GridBagConstraints gridBagConstraintsx10 = new GridBagConstraints();
		gridBagConstraintsx10.gridx = 1;
		gridBagConstraintsx10.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx10.gridy = 4;
		gridBagConstraintsx10.gridwidth = 2;
		gridBagConstraintsx10.fill = GridBagConstraints.BOTH;
		cPane.add(jtfCheckIn, gridBagConstraintsx10);
		
		GridBagConstraints gridBagConstraintsx11 = new GridBagConstraints();
		gridBagConstraintsx11.gridx = 0;
		gridBagConstraintsx11.gridy = 5;
		gridBagConstraintsx11.insets = new Insets(5,5,5,5); 
		cPane.add(jlbGender, gridBagConstraintsx11);

		GridBagConstraints gridBagConstraintsx12 = new GridBagConstraints();
		gridBagConstraintsx12.gridx = 1;
		gridBagConstraintsx12.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx12.gridy = 5;
		gridBagConstraintsx12.gridwidth = 2;
		gridBagConstraintsx12.fill = GridBagConstraints.BOTH;
		cPane.add(jtfGender, gridBagConstraintsx12);

		GridBagConstraints gridBagConstraintsx13 = new GridBagConstraints();
		gridBagConstraintsx13.gridx = 0;
		gridBagConstraintsx13.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx13.gridy = 6;
		cPane.add(jlbCause, gridBagConstraintsx13);

		GridBagConstraints gridBagConstraintsx14 = new GridBagConstraints();
		gridBagConstraintsx14.gridx = 1;
		gridBagConstraintsx14.gridy = 6;
		gridBagConstraintsx14.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx14.gridwidth = 2;
		gridBagConstraintsx14.fill = GridBagConstraints.BOTH;
		cPane.add(jtaCause, gridBagConstraintsx14);
		
		GridBagConstraints gridBagConstraintsx15 = new GridBagConstraints();
		gridBagConstraintsx15.gridx = 0;
		gridBagConstraintsx15.gridy = 7;
		gridBagConstraintsx15.insets = new Insets(5,5,5,5); 
		cPane.add(jlbGFeatures, gridBagConstraintsx15);

		GridBagConstraints gridBagConstraintsx16 = new GridBagConstraints();
		gridBagConstraintsx16.gridx = 1;
		gridBagConstraintsx16.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx16.gridy = 7;
		gridBagConstraintsx16.gridwidth = 2;
		gridBagConstraintsx16.fill = GridBagConstraints.BOTH;
		cPane.add(jtaGFeatures, gridBagConstraintsx16);

		GridBagConstraints gridBagConstraintsx17 = new GridBagConstraints();
		gridBagConstraintsx17.gridx = 0;
		gridBagConstraintsx17.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx17.gridy = 8;
		cPane.add(jlbSurveys, gridBagConstraintsx17);

		GridBagConstraints gridBagConstraintsx18 = new GridBagConstraints();
		gridBagConstraintsx18.gridx = 1;
		gridBagConstraintsx18.gridy = 8;
		gridBagConstraintsx18.gridwidth = 2;
		gridBagConstraintsx18.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx18.fill = GridBagConstraints.BOTH;
		cPane.add(jtaSurveys, gridBagConstraintsx18);
		
		GridBagConstraints gridBagConstraintsx19 = new GridBagConstraints();
		gridBagConstraintsx19.gridx = 0;
		gridBagConstraintsx19.gridy = 9;
		gridBagConstraintsx19.insets = new Insets(5,5,5,5); 
		cPane.add(jlbExamination, gridBagConstraintsx19);

		GridBagConstraints gridBagConstraintsx20 = new GridBagConstraints();
		gridBagConstraintsx20.gridx = 1;
		gridBagConstraintsx20.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx20.gridy = 9;
		gridBagConstraintsx20.gridwidth = 2;
		gridBagConstraintsx20.fill = GridBagConstraints.BOTH;
		cPane.add(jtaExamination, gridBagConstraintsx20);
		
		GridBagConstraints gridBagConstraintsx21 = new GridBagConstraints();
		gridBagConstraintsx21.gridx = 0;
		gridBagConstraintsx21.gridy = 10;
		gridBagConstraintsx21.insets = new Insets(5,5,5,5); 
		cPane.add(jlbWSurveys, gridBagConstraintsx21);

		GridBagConstraints gridBagConstraintsx22 = new GridBagConstraints();
		gridBagConstraintsx22.gridx = 1;
		gridBagConstraintsx22.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx22.gridy = 10;
		gridBagConstraintsx22.gridwidth = 2;
		gridBagConstraintsx22.fill = GridBagConstraints.BOTH;
		cPane.add(jtaWSurveys, gridBagConstraintsx22);
		
		GridBagConstraints gridBagConstraintsx23 = new GridBagConstraints();
		gridBagConstraintsx23.gridx = 0;
		gridBagConstraintsx23.gridy = 11;
		gridBagConstraintsx23.insets = new Insets(5,5,5,5); 
		cPane.add(jlbKonsultasyon, gridBagConstraintsx23);

		GridBagConstraints gridBagConstraintsx24 = new GridBagConstraints();
		gridBagConstraintsx24.gridx = 1;
		gridBagConstraintsx24.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx24.gridy = 11;
		gridBagConstraintsx24.gridwidth = 2;
		gridBagConstraintsx24.fill = GridBagConstraints.BOTH;
		cPane.add(jtaKonsultasyon, gridBagConstraintsx24);

		GridBagConstraints gridBagConstraintsx25 = new GridBagConstraints();
		gridBagConstraintsx25.gridx = 0;
		gridBagConstraintsx25.gridy = 12;
		gridBagConstraintsx25.insets = new Insets(5,5,5,5); 
		cPane.add(jbbSave, gridBagConstraintsx25);

		GridBagConstraints gridBagConstraintsx26 = new GridBagConstraints();
		gridBagConstraintsx26.gridx = 1;
		gridBagConstraintsx26.gridy = 12;
		gridBagConstraintsx26.insets = new Insets(5,5,5,5); 
		cPane.add(jbnDelete, gridBagConstraintsx26);

		GridBagConstraints gridBagConstraintsx27 = new GridBagConstraints();
		gridBagConstraintsx27.gridx = 2;
		gridBagConstraintsx27.gridy = 12;
		gridBagConstraintsx27.insets = new Insets(5,5,5,5); 
		cPane.add(jbnUpdate, gridBagConstraintsx27);

		GridBagConstraints gridBagConstraintsx28 = new GridBagConstraints();
		gridBagConstraintsx28.gridx = 0;
		gridBagConstraintsx28.gridy = 13;
		gridBagConstraintsx28.insets = new Insets(5,5,5,5);
		cPane.add(jbnBack, gridBagConstraintsx28);

		GridBagConstraints gridBagConstraintsx29 = new GridBagConstraints();
		gridBagConstraintsx29.gridx = 1;
		gridBagConstraintsx29.gridy = 13;
		gridBagConstraintsx29.insets = new Insets(5,5,5,5); 
		cPane.add(jbnSearch, gridBagConstraintsx29);

		GridBagConstraints gridBagConstraintsx30 = new GridBagConstraints();
		gridBagConstraintsx30.gridx = 2;
		gridBagConstraintsx30.gridy = 13;
		gridBagConstraintsx30.insets = new Insets(5,5,5,5); 
		cPane.add(jbnForward, gridBagConstraintsx30);

		GridBagConstraints gridBagConstraintsx31 = new GridBagConstraints();
		gridBagConstraintsx31.gridx = 3;
		gridBagConstraintsx31.insets = new Insets(5,5,5,5); 
		gridBagConstraintsx31.gridy = 12;
		cPane.add(jbnClear, gridBagConstraintsx31);

		GridBagConstraints gridBagConstraintsx32 = new GridBagConstraints();
		gridBagConstraintsx32.gridx = 3;
		gridBagConstraintsx32.gridy = 13;
		gridBagConstraintsx32.insets = new Insets(5,5,5,5); 
		cPane.add(jbnExit, gridBagConstraintsx32);
		
		
		

		

		jbbSave.addActionListener(this);
		jbnDelete.addActionListener(this);
		jbnClear.addActionListener(this);
		jbnUpdate.addActionListener(this);
		jbnSearch.addActionListener(this);
		jbnForward.addActionListener(this);
		jbnBack.addActionListener(this);
		jbnExit.addActionListener(this);
	}

	public void actionPerformed (ActionEvent e){

		if (e.getSource () == jbbSave){
			savePatient();
			clear(); 
		}

		else if (e.getSource() == jbnDelete){
			deletePatient();
			clear();
		}

		else if (e.getSource() == jbnUpdate){
			updatePatient();
			clear(); 
		}

		else if (e.getSource() == jbnSearch){
			searchPatient();
		} 

		else if (e.getSource() == jbnForward){
			displayNextRecord(); 
		}

		else if (e.getSource() == jbnBack){
			displayPreviousRecord();
		}

		else if (e.getSource() == jbnClear){
			clear();
		}

		else if (e.getSource() == jbnExit){			
			patientBook.saveAllToFile();
			System.exit(0);
		}
	}

	// Save the Person into the Address Book 
	public void savePatient() {  
		String roomNobedNo = jtfRoomNobedNo.getText();
		String name = jtfName.getText();
		name = name.toUpperCase();	//Save all names in Uppercase
		String bolum = jtfBolum.getText();
		String age = jtfAge.getText();
		String gender = jtfGender.getText();
		String checkIn = jtfCheckIn.getText();
		String cause = jtaCause.getText();
		String gFeatures = jtaGFeatures.getText();
		String surveys = jtaSurveys.getText();
		String examination = jtaExamination.getText();
		String wSurveys = jtaWSurveys.getText();
		String konsultasyon = jtaKonsultasyon.getText();

		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "LÜTFEN HASTA AD-SOYAD GÝRÝN.");
		}
		else {
			//create a PatientInfo object and pass it to PatientDAO to save it
			Patient patient = new Patient(roomNobedNo, name, bolum, age, gender, checkIn, cause, 
					gFeatures, surveys, examination,wSurveys, konsultasyon);
			patientBook.savePatient(patient);
			JOptionPane.showMessageDialog(null, "HASTA KAYDEDÝLDÝ.");
		}
	}

	public void deletePatient() {
		String roomNobedNo = jtfRoomNobedNo.getText();
		if (roomNobedNo.equals("")) {
			JOptionPane.showMessageDialog(null,"LÜTFEN SÝLMEK ÝÇÝN HASTA ODA-YATAK NO GÝRÝNÝZ.");
		}
		else {
			//remove Patient of the given name from the Patient Book 
			if (patientBook.removePatient(roomNobedNo))
				JOptionPane.showMessageDialog(null, "HASTA SÝLÝNDÝ.");
			else
				JOptionPane.showMessageDialog(null, "HASTA BULUNAMADI.");
		}
	}

	public void updatePatient() {
			/*get values from text fields*/            
			String roomNobedNo    = jtfRoomNobedNo.getText();
			if (roomNobedNo.equals("")) {
				JOptionPane.showMessageDialog(null,"LÜTFEN HASTA ODA-YATAK NO GÝRÝNÝZ.");
			}
			else {
				//remove patient of the given name from the patient Book database
				String name = jtfName.getText();
				String bolum = jtfBolum.getText();
				String age = jtfAge.getText();
				String gender = jtfGender.getText();
				String checkIn = jtfCheckIn.getText();
				String cause = jtaCause.getText();
				String gFeatures = jtaGFeatures.getText();
				String surveys = jtaSurveys.getText();
				String examination = jtaExamination.getText();
				String wSurveys = jtaWSurveys.getText();
				String konsultasyon = jtaKonsultasyon.getText();

				/*update data of the given patient name*/
				Patient patient = new Patient(roomNobedNo, name, bolum, age, gender, checkIn, cause, gFeatures, surveys, examination,
						wSurveys, konsultasyon);
				if (patientBook.updatePatient(roomNobedNo, patient))
					JOptionPane.showMessageDialog(null, "HASTA GÜNCELLENDÝ.");
				else
					JOptionPane.showMessageDialog(null, "HASTA BULUNAMADI.");
			}
	} 

	//Perform a Case-Insensitive Search to find the patient
	public void searchPatient() {
		String roomNobedNo = jtfRoomNobedNo.getText();
		if (roomNobedNo.equals("")) {
			JOptionPane.showMessageDialog(null,"LÜTFEN HADTA ODA-YATAK NO GÝRÝNÝZ.");
		}
		else {
			/*get an array list of searched patients using patientDAO*/
			Patient patient = patientBook.searchPatient(roomNobedNo);

			if(patient == null){
				JOptionPane.showMessageDialog(null, "KAYIT BULUNAMADI.");
				//Perform a clear if no records are found.
				clear();
			}
			else {
				// displaying search record in text fields 
				jtfRoomNobedNo.setText(patient.getRoomNobedNo());
				jtfName.setText(patient.getName());
				jtfBolum.setText(patient.getBolum());
				jtfAge.setText(patient.getAge());
				jtfCheckIn.setText(patient.getCheckIn());
				jtfGender.setText(patient.getGender());
				jtaCause.setText(patient.getCause());
				jtaGFeatures.setText(patient.getGFeatures());
				jtaSurveys.setText(patient.getSurveys());
				jtaExamination.setText(patient.getExamination());
				jtaWSurveys.setText(patient.getWSurveys());
				jtaKonsultasyon.setText(patient.getKonsultasyon());
			}
		}

	}

	public void displayCurrentRecord() {
		Patient patient = patientBook.getPatientAtRecordNumber();

		// displaying search record in text fields 
		jtfRoomNobedNo.setText(patient.getRoomNobedNo());
		jtfName.setText(patient.getName());
		jtfBolum.setText(patient.getBolum());
		jtfAge.setText(patient.getAge());
		jtfCheckIn.setText(patient.getCheckIn());
		jtfGender.setText(patient.getGender());
		jtaCause.setText(patient.getCause());
		jtaGFeatures.setText(patient.getGFeatures());
		jtaSurveys.setText(patient.getSurveys());
		jtaExamination.setText(patient.getExamination());
		jtaWSurveys.setText(patient.getWSurveys());
		jtaKonsultasyon.setText(patient.getKonsultasyon());	
	}

	public void displayNextRecord() {

		// increment recordNumber to display next patient info, already stored in 
		//  patientSearchResultList during search                  
		patientBook.incrementRecordNumber();

		if(patientBook.getRecordNumber() >= patientBook.getSize()){
			JOptionPane.showMessageDialog(null, "HASTA KAYIT SONU " ); 

			/*if user has reached the end of results, disable forward button*/
			jbnForward.setEnabled(false);
			jbnBack.setEnabled(true);

			// decrement by one to counter last inc
			patientBook.decrementRecordNumber();
		}
		else {
			jbnBack.setEnabled(true);
			Patient patient = patientBook.getPatientAtRecordNumber();

			// displaying search record in text fields 
			jtfRoomNobedNo.setText(patient.getRoomNobedNo());
			jtfName.setText(patient.getName());
			jtfBolum.setText(patient.getBolum());
			jtfAge.setText(patient.getAge());
			jtfCheckIn.setText(patient.getCheckIn());
			jtfGender.setText(patient.getGender());
			jtaCause.setText(patient.getCause());
			jtaGFeatures.setText(patient.getGFeatures());
			jtaSurveys.setText(patient.getSurveys());
			jtaExamination.setText(patient.getExamination());
			jtaWSurveys.setText(patient.getWSurveys());
			jtaKonsultasyon.setText(patient.getKonsultasyon());
		}
	}

	public void displayPreviousRecord() {

		// decrement recordNumber to display previous patient info, already 
		//stored in patientSearchResultList during search                  
		patientBook.decrementRecordNumber();

		if(patientBook.getRecordNumber() < 0 ){
			JOptionPane.showMessageDialog(null, "HASTA KAYIT BAÞLANGICINA ULAÞILDI " ); 

			/*if user has reached the begining of results, disable back button*/
			jbnForward.setEnabled(true);
			jbnBack.setEnabled(false);

			// increment by one to counter last dec
			patientBook.incrementRecordNumber();
		} 
		else {
			jbnForward.setEnabled(true);
			Patient patient = patientBook.getPatientAtRecordNumber();

			// displaying search record in text fields 
			jtfRoomNobedNo.setText(patient.getRoomNobedNo());
			jtfName.setText(patient.getName());
			jtfBolum.setText(patient.getBolum());
			jtfAge.setText(patient.getAge());
			jtfCheckIn.setText(patient.getCheckIn());
			jtfGender.setText(patient.getGender());
			jtaCause.setText(patient.getCause());
			jtaGFeatures.setText(patient.getGFeatures());
			jtaSurveys.setText(patient.getSurveys());
			jtaExamination.setText(patient.getExamination());
			jtaWSurveys.setText(patient.getWSurveys());
			jtaKonsultasyon.setText(patient.getKonsultasyon());
		}
	}

	public void clear() {
		jtfRoomNobedNo.setText("");
		jtfName.setText("");
		jtfBolum.setText("");
		jtfAge.setText("");
		jtfCheckIn.setText("");
		jtfGender.setText("");
		jtaCause.setText("");
		jtaGFeatures.setText("");
		jtaSurveys.setText("");
		jtaExamination.setText("");
		jtaWSurveys.setText("");
		jtaKonsultasyon.setText("");

		/*clear contents of arraylist*/
		jbnForward.setEnabled(true);
		jbnBack.setEnabled(true);
	}

}
