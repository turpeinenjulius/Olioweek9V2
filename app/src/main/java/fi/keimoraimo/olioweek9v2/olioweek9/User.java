package fi.keimoraimo.olioweek9v2.olioweek9;

public class User {
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String degreeProgram;

    public User(String firstName, String lastName, String email, String degreeProgram){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }

    public String getFullName(){
        fullName = firstName  + " " + lastName;
        return fullName;
    }

    public String getEmail(){
        return email;
    }

    public String getDegreeProgram(){
        return degreeProgram;
    }

}
