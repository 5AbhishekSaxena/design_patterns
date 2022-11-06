package tech.developingdeveloper.builder_pattern;

public class Address {

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private Integer pinCode;

    public Address(String line1, String line2, String city, String state, String country, Integer pinCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public static class Builder {

        public String line1;
        public String line2;
        public String city;
        public String state;
        public String country;
        public Integer pincode;

        public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
        }

        public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPincode(Integer pincode) {
            this.pincode = pincode;
            return this;
        }

        public Address build() {
            return new Address(line1, line2, city, state, country, pincode);
        }
    }
}
