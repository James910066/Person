import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    public Person(String ID, String firstName, String lastName, String title, int YOB)//constructor
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }
    //Getters and Setters from here down to custom methods
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYOB() {
        return YOB;
    }
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    //Custom methods
    public String fullName()
    {
        return   getFirstName() + " " + getLastName();
    }
    public String formalName()
    {
        return getTitle() + " " + fullName();
    }
    public int getAge()
    {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        return currentYear - getYOB();
    }
    public int getAgeOffYear(int year)
    {
        return year - getYOB();
    }

    //To String to show internal data
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    public String toCSVRecord()
   {
            return this.getID() + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
    }
}
