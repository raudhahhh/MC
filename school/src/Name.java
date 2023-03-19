public class Name {
    private String FirstName;
    private String LastName;

    public Name() {
    }

    public Name(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getSecondName() {
        return this.LastName;
    }

    public void setSecondName(String secondName) {
        this.LastName = secondName;
    }

    public String toString() {
        return this.FirstName + " " + this.LastName;
    }
}

}
