package tech.developingdeveloper.builder_pattern.drivers;

import tech.developingdeveloper.builder_pattern.*;

import java.util.List;

public class UserWithBuilderDriver {

    public static void main(String[] args) {
        var address = new Address(
                "test",
                null,
                "Delhi",
                "Delhi",
                "India",
                123456
        );

        var company = new Company("Infosys");

        var education = new EducationBuilder()
                .setSchool("ABC University")
                .setYearOfPassing(2022)
                .setDegree("M.Tech")
                .build();

        var educations = List.of(
                new Education("SRM University", 2020, "B.Tech")
        );

        var contact = new Contact(
                "5abhisheks",
                "5AbhishekSaxena",
                "9999999999",
                "abhishek@test.com"
        );

        var anotherContact = new Contact.Builder()
                .setEmail("test@test.com")
                .setPhoneNumber("9999999999")
                .build();


        var user = new UserWithConstructorOverloading("test", address);
        var user1 = new UserWithConstructorOverloading(
                "test",
                null,
                "test",
                null,
                null,
                educations);

        var user2 = new User.Builder()
                .setFirstName("Abhishek")
                .setLastName("Saxena")
                .setAddress(address)
                .setCompany(company)
                .setEducations(educations) // <-- notice here
                .setContact(contact)
                .build();

        var user3 = new User.Builder()
                .setFirstName("Test")
                .setMiddleName("Test")
                .setLastName("Test")
                .addEducation(education) // <-- notice here
                .setContact(contact)
                .build();

        printToConsole(user);
        printToConsole(user1);
        printToConsole(user2);
        printToConsole(user3);
    }

    private static void printToConsole(User user) {
        System.out.println(user.toString());
        System.out.println();
    }

    private static void printToConsole(UserWithConstructorOverloading user) {
        System.out.println(user.toString());
        System.out.println();
    }

    private static void printToConsole(UserWithTelescopingConstructors user) {
        System.out.println(user.toString());
        System.out.println();
    }
}
