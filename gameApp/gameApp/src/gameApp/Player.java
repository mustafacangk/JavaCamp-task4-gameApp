package gameApp;

public class Player {

	private String idNo;
	private String name;
	private String surname;
	private int yearOfBirth;
	
	
	public Player(String idNo, String name, String surname, int yearOfBirth) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
	}


	public String getIdNo() {
		return idNo;
	}


	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
}