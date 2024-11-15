package Assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank77 {
	@Id
	private int id;
	private String name;
	private String location;
	@OneToMany
	private List <Account77> accounts;
	public Bank77() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Account77> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account77> accounts) {
		this.accounts = accounts;
	}
	 
	

}
