package tech.developingdeveloper.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String middleName; // optional
    private String lastName; // optional

    private Address address;
    private Contact contact; // optional

    private Company company; // optional

    private List<Education> educations;

    public User(
            String firstName,
            String middleName,
            String lastName,
            Address address,
            Contact contact,
            Company company,
            List<Education> educations) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.company = company;
        this.educations = educations;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", company=" + company +
                ", educations=" + educations +
                '}';
    }

    public static class Builder {
        public String firstName;
        public String middleName; // optional
        public String lastName; // optional

        public Address address;
        public Contact contact; // optional

        public Company company; // optional

        public List<Education> educations = new ArrayList<>();

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setCompany(Company company) {
            this.company = company;
            return this;
        }

        public Builder addEducation(Education education) {
            this.educations.add(education);
            return this;
        }

        public Builder setEducations(List<Education> educations) {
            if (educations == null) return this;
            this.educations.clear();
            this.educations.addAll(educations);
            return this;
        }

        public User build() {
            return new User(firstName, middleName, lastName, address, contact, company, educations);
        }
    }
}
