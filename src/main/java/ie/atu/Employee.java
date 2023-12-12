package ie.atu;
import java.util.InputMismatchException;

public class Employee {
    private String name, employmentType, gender;
    private int age, pps[];

    public Employee(String name, String employmentType, String gender, int age, int pps[]) {

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

    public int getAge() {
        if (age > 16 && age < 66) {
            return age;
        }
        else {
            System.out.println("Invalid entry, please enter an age between 6 and 66");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getPps() {
        // Insert code to check number of values in pps
        return pps;
    }

    public void setPps(int[] pps) {
        this.pps = pps;
    }
}