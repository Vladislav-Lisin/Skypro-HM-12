public class Author {
    private String name;
    private String surname;

    public Author(String firstName, String lastName) {
        this.name = firstName;
        this.surname = lastName;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
