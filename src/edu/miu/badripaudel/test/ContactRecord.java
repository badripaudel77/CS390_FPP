package edu.miu.badripaudel.test;

public record ContactRecord(String name, String email) {
    public ContactRecord {
        if(name == null || email == null) {
            throw new IllegalArgumentException("Values must not be empty.");
        }
    }
    @Override
    public String toString() {
        return this.email + " => " + this.name;
    }
}

class Test {
    public static void main(String[] args) {
        ContactRecord record = new ContactRecord("BP", "BP@MIU.EDU");
        String email = record.email();
        System.out.println("email >>> " + email);
        System.out.println(record);
    }
}
