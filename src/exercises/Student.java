package exercises;

import java.util.Date;

/**
 * Exercise 2, Task 2
 *
 * Group: AG1 01
 * Dennis Mayer 108 020 *** ***
 * Jérôme Bruck 108 020 *** ***
 * Eric Naber 108 020 213 168
 */
public class Student {
    // fields of class Student
    private String firstname;
    private String lastname;
    private final long studentId;
    private double weight;
    private Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    // constructors of class Student
    Student(){
        this(null, null, 0, 0, new Date(0));
    }
    Student(String pFirstname, String pLastname, long pStudentId, double pWeight, Date pBirthday){
        this.firstname = pFirstname;
        this.lastname = pLastname;
        this.studentId = pStudentId;
        this.weight = pWeight;
        this.birthday = pBirthday;
    }

    // getter methods of class Student
    String getFirstname(){
        return this.firstname;
    }
    String getLastname(){
        return this.lastname;
    }
    long getStudentId(){
        return this.studentId;
    }
    double getWeight(){
        return this.weight;
    }
    Date getBirthday(){
        return this.birthday;
    }
    // setter methods of class Student
    void setFirstname(String pFirstname){
        this.firstname = pFirstname;
    }
    void setLastname(String pLastname){
        this.lastname = pLastname;
    }
    void setWeight(double pWeight){
        this.weight = pWeight;
    }
    void setBirthday(Date pBirthday){
        this.birthday = pBirthday;
    }

    @Override
        /**
         * Overwriting toString()-method. Gives out all fields of Student
         * like "studentId firstname lastname birthday weight"
         */
        public String toString(){
                return this.studentId + " " + this.firstname + " " + this.lastname + " " + this.birthday + " " +
                        this.weight;
            }
}
