package assignment9.Prob1;

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

    //implement
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Key)) return false;
        Key key = (Key) o;
        return  key.getFirstName().equals(getFirstName()) && key.getLastName().equals(getLastName());

    }

    //implement
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
