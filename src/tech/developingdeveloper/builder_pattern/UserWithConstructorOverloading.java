package tech.developingdeveloper.builder_pattern;

import java.util.List;

public class UserWithConstructorOverloading {
    private String firstName;
    private String middleName; // optional
    private String lastName; // optional

    private Address address;
    private Contact contact; // optional

    private List<Education> educations;

    public UserWithConstructorOverloading(
            String firstName,
            Address address
    ) {
        this.firstName = firstName;
        this.address = address;
    }

    public UserWithConstructorOverloading(
            String firstName,
            String lastName,
            Address address
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public UserWithConstructorOverloading(
            String firstName,
            String middleName,
            String lastName,
            Address address
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
    }

    public UserWithConstructorOverloading(
            String firstName,
            String middleName,
            String lastName,
            Address address,
            Contact contact
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    public UserWithConstructorOverloading(
            String firstName,
            String middleName,
            String lastName,
            Address address,
            Contact contact,
            List<Education> educations
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.educations = educations;
    }

    @Override
    public String toString() {
        return "UserWithConstructorOverloading{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", educations=" + educations +
                '}';
    }
}
