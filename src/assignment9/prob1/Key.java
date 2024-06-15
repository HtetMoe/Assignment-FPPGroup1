package assignment9.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	@Override
	public boolean equals(Object o){
		if (o == null || !(o.getClass() == getClass())){
			return false;
		}
		Key k = (Key) o;
		return firstName.equals(k.getFirstName()) && lastName.equals(k.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
