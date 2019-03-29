
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private double salary;
    private String subject;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher(String myName, int myAge, String myGender, String subject, double salary)
    {
        super(myName,myAge,myGender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject(){
        return subject;
    }

    public double getSalary(){
        return salary;
      }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
}
