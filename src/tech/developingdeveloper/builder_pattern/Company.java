package tech.developingdeveloper.builder_pattern;

public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        public String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Company build() {
            return new Company(name);
        }
    }
}
