package tech.developingdeveloper.builder_pattern;

public class EducationBuilder {

    public String school;
    public Integer yearOfPassing;
    public String degree; // optional

    public EducationBuilder setSchool(String school) {
        this.school = school;
        return this;
    }

    public EducationBuilder setYearOfPassing(Integer yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
        return this;
    }

    public EducationBuilder setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public Education build() {
        return new Education(school, yearOfPassing, degree);
    }
}
