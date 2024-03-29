package lab6.organization;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import lab6.Address;
import lab6.FullName;
import lab6.Gender;
import lab6.History;
import lab6.Phone;
import lab6.organization.operationsStaff.OperationsStaff;

public class Patient extends Person{
	private int age;
	private LocalDate accepted;
	private History sickness;
	private String[] prescriptions;
	private String[] allergies;
	private String[] specialReqs;
	private List<OperationsStaff> operationsStaffs = new ArrayList<OperationsStaff>();
	
	public Patient(String title, String givenName, String middleName, String familyName, FullName name, LocalDate birthDate,
			Gender gender, Address homeAddress, Phone phone, LocalDate accepted, History sickness,
			String[] prescriptions, String[] allergies, String[] specialReqs) {
		super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
		
		LocalDate now = LocalDate.now();
		Period diff = Period.between(birthDate, now);
		this.age = diff.getYears();
		
		this.accepted = accepted;
		this.sickness = sickness;
		this.prescriptions = prescriptions;
		this.allergies = allergies;
		this.specialReqs = specialReqs;
	}
	
	public void addOperationsStaff(OperationsStaff operationsStaff) {
		operationsStaffs.add(operationsStaff);
	}
	
	
}



