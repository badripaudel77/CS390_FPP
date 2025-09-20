package edu.miu.lab8.Prob1;

import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private Standing standing;
	public Student(String firstName, String lastName, double gpa, Standing standing) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa=gpa;
		this.standing = standing;
	}
	public Standing getStanding() {
		return standing;
	}
	public double getGpa() {
		return gpa;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (!(ob instanceof Student s)) return false;
        return Objects.equals(firstName, s.firstName) &&
                Objects.equals(lastName, s.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
	
}
