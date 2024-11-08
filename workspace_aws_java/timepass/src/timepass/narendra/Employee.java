package timepass.narendra;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private List<?> contacts;
	
	public Employee(int id, String name, long salary, List contacts) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public List getContacts() {
		return contacts;
	}

	public void setContacts(List contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", contacts=" + contacts + "]";
	}
}
