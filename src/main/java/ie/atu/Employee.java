package ie.atu;
import java.util.InputMismatchException;

public class Employee {
    private String name, employmentType, gender;
    private double age, pps;

    public Employee(String name, String employmentType, String gender, double age, double pps) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getGender() {
        if (gender == "Man" || gender == "Woman" || gender == "Non-binary") {
            return gender;
        }
       else {

        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        if (age > 16 && age < 66) {
            return age;
        }
        else {
            System.out.println("Invalid entry, please enter an age between 6 and 66");
        }
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getPps() {
        // Insert code to check number of values in pps
        return pps;
    }

    public void setPps(double pps) {
        this.pps = pps;
    }
}