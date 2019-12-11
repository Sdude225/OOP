package lab6.organization.operationsStaff;

import java.time.LocalDate;

import lab6.Address;
import lab6.FullName;
import lab6.Gender;
import lab6.Phone;
import lab6.organization.Departament;
import lab6.organization.Person;



public class Doctor extends OperationsStaff{
	
	protected String[] speciality;
	protected String[] locations;

	public Doctor(String title, String givenName, String middleName, String familyName, FullName name,
			LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined,
			String[] education, String[] certification, String[] languages, Departament departament, String[] speciality, String[] locations) {
		super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, person, joined, education,
				certification, languages, departament);
		this.locations = locations;
		this.speciality = speciality;
		
	}
	
	
}
