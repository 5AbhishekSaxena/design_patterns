package tech.developingdeveloper.builder_pattern;

import java.util.List;

public class UserWithTelescopingConstructors {
    private String firstName;
    private String middleName; // optional
    private String lastName; // optional

    private Address address;
    private Contact contact; // optional

    private List<Education> educations;

    public UserWithTelescopingConstructors(
            String firstName,
            Address address
    ) {
        this.firstName = firstName;
        this.address = address;
    }

    public UserWithTelescopingConstructors(
            String firstName,
            String lastName,
            Address address
    ) {
        this(firstName, address);
        this.lastName = lastName;
    }

    public UserWithTelescopingConstructors(
            String firstName,
            String middleName,
            String lastName,
            Address address
    ) {
        this(firstName, lastName, address);
        this.middleName = middleName;
    }

    public UserWithTelescopingConstructors(
            String firstName,
            String middleName,
            String lastName,
            Address address,
            Contact contact
    ) {
        this(firstName, middleName, lastName, address);
        this.contact = contact;
    }

    public UserWithTelescopingConstructors(
            String firstName,
            String middleName,
            String lastName,
            Address address,
            Contact contact,
            List<Education> educations
    ) {
        this(firstName, middleName, lastName, address, contact);
        this.educations = educations;
    }

    @Override
    public String toString() {
        return "UserWithTelescopingConstructors{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", educations=" + educations +
                '}';
    }
}

