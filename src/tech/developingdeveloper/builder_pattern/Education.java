package tech.developingdeveloper.builder_pattern;

public class Education {

    private String school;
    private Integer yearOfPassing;
    private String degree; // optional

    public Education(String school, Integer yearOfPassing) {
        this.school = school;
        this.yearOfPassing = yearOfPassing;
    }

    public Education(String school, Integer yearOfPassing, String degree) {
        this.school = school;
        this.yearOfPassing = yearOfPassing;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Education{" +
                "school='" + school + '\'' +
                ", yearOfPassing=" + yearOfPassing +
                ", degree='" + degree + '\'' +
                '}';
    }
}
