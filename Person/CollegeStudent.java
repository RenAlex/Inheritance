
/**
 * Write a description of class CollegeStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeStudent extends Student
{
    private String major;
    private int year;

    /**
     * Constructor for objects of class CollegeStudent
     */
    public CollegeStudent(String myName, int myAge, String myGender, String myIDNum, double myGPA, int year, String major)
    {
        super(myName, myAge, myGender, myIDNum, myGPA);
        this.major = major;
        this.year = year;
    }

    public String getMajor(){
        return major;
    }

    public int getYear(){
        return year;
      }

    public void setMajor(String major){
        this.major = major;
    }

    public void setYear(int year){
        this.year = year;
    }
    
    public String toString() {
        return super.toString()  + ", Year: " + year + ", Major: " + major;
    }
}
