package lab6.organization;

import java.time.LocalDate;

import lab6.Address;
import lab6.FullName;
import lab6.Gender;
import lab6.Phone;

public class Staff extends Person{
	private LocalDate joined;
	private String[] education; 
	private String[] certification;
	private String[] languages;
	private Departament departament;
	
	
	
	public Staff(String title, String givenName, String middleName, String familyName, FullName name, LocalDate birthDate,
			Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined, String[] education, String[] certification, String[] languages, Departament departament) {
		super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
		this.joined = joined;
		this.education = education;
		this.certification = certification;
		this.languages = languages;
		this.departament = departament;
	}
	
	
}
