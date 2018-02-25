

public class Patient {

	private String roomNobedNo, name, bolum, age, gender, checkIn, cause, gFeatures, surveys, examination,
	wSurveys, konsultasyon;

	public Patient(String roomNobedNo, String name, String bolum, String age, String gender, 
			String checkIn, String cause, String gFeatures, String surveys, String examination,
			String wSurveys, String konsultasyon) {
        this.roomNobedNo = roomNobedNo;
		this.name = name;
		this.bolum = bolum;
		this.age = age;
		this.gender = gender;
		this.checkIn = checkIn;
		this.cause = cause;
		this.gFeatures = gFeatures;
		this.surveys = surveys;
		this.examination = examination;
		this.wSurveys = wSurveys;
		this.konsultasyon = konsultasyon;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomNobedNo() {
		return roomNobedNo;
	}

	public void setRoomNobedNo(String roomNobedNo) {
		this.roomNobedNo = roomNobedNo;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	
	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
	
	public String getGFeatures() {
		return gFeatures;
	}

	public void setGFeatures(String gFeatures) {
		this.gFeatures = gFeatures;
	}
	
	public String getSurveys() {
		return surveys;
	}

	public void setSurveys(String surveys) {
		this.surveys = surveys;
	}
	
	public String getExamination() {
		return examination;
	}

	public void setExamination(String examination) {
		this.examination = examination;
	}
	
	public String getWSurveys() {
		return wSurveys;
	}

	public void setWSurveys(String wSurveys) {
		this.wSurveys = wSurveys;
	}
	
	public String getKonsultasyon() {
		return konsultasyon;
	}

	public void setKonsultasyon(String konsultasyon) {
		this.konsultasyon = konsultasyon;
	}
	


	public String toFile() {
		return roomNobedNo + "," + name + "," +  bolum + "," + age + "," + gender
				+ "," + checkIn + "," + cause + "," + gFeatures + "," + surveys 
				+ "," + examination + "," + wSurveys + "," + konsultasyon;
	}

	@Override
	public String toString() {
		return "ODA_YATAK NO=" + roomNobedNo + ", AD-SOYAD=" + name + ", BÖLÜM=" + bolum +
				", YAÞ=" + age + ", CÝNSÝYET=" + gender + ", YATIÞ TARÝHÝ=" + checkIn + ", YATIÞ NEDENÝ=" + cause +
				", GENEL ÖZELLÝKLER=" + gFeatures + ", DIÞ MERKEZ TETKÝKLERÝ=" + surveys
				+", FÝZÝK MUAYENE=" + examination + ", ÝSTENEN TETKÝKLER=" + wSurveys + ", KONSULTASYON="
				+ konsultasyon;
	}

}
