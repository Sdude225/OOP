package lab6.organization;

import java.util.ArrayList;
import java.util.List;

import lab6.Address;
import lab6.Phone;


public class Hospital {
	private String name;
	private Address address;
	private Phone phone;
	private List<Person> persons = new ArrayList<Person>();
	private List<Departament> departaments = new ArrayList<Departament>();
	
	public Hospital(String name, Address address, Phone phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
}
