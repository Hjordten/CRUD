public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int birthYear;
    private double height;
    private char gender;

    public Person(String firstName, String secondName, String lastName, int birthYear, double height, char gender){
        this.firstName = firstName;
        this.middleName = secondName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public double getHeight(){
        return height;
    }

    public char getGender(){
        return gender;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + " " +  "middleName: " + middleName + " " + "lastName: " + lastName + " " + "birthYear: " + birthYear + "height: " + height + "gender: " + gender + "\n";
    }
}
