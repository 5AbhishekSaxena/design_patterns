package tech.developingdeveloper.builder_pattern;

public class Contact {

    private String twitterHandle;
    private String githubHandle;

    private String phoneNumber;

    private String email;

    public Contact(String twitterHandle, String githubHandle, String phoneNumber, String email) {
        this.twitterHandle = twitterHandle;
        this.githubHandle = githubHandle;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "twitterHandle='" + twitterHandle + '\'' +
                ", githubHandle='" + githubHandle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        public String twitterHandle;
        public String githubHandle;

        public String phoneNumber;

        public String email;

        public Builder setTwitterHandle(String twitterHandle) {
            this.twitterHandle = twitterHandle;
            return this;
        }

        public Builder setGithubHandle(String githubHandle) {
            this.githubHandle = githubHandle;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Contact build() {
            return new Contact(twitterHandle, githubHandle, phoneNumber, email);
        }
    }
}
