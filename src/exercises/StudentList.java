package exercises;

import java.util.ArrayList;

/**
 * Exercise 2, Task 2
 *
 * Group: AG1 01
 * Dennis Mayer 108 020 *** ***
 * Jérôme Bruck 108 020 *** ***
 * Eric Naber 108 020 213 168
 */
public class StudentList {
    // fields of class StudentList
    private ArrayList<Student> list;

    // constructors of class StudentList
    StudentList(){
       this.list = new ArrayList<Student>();
    }
    StudentList(StudentList pList){
        this.list = pList.list;
    }

    // methods of class StudentList
    /**
     * This method adds a Student to the list if the student is not already in the list.
     * @param pStudent this student will be added to the list.
     * @return 's true if it was successfully and false if it wasn't.
     */
    boolean add(Student pStudent){                                      // adds Student to this.list
        for (Student student : this.list) {                             // iter over Students in this.list
            if (pStudent.getStudentId() == student.getStudentId()) {    // Test if Student already exists
                return false;                                           // If so: return false
            }
        }
        this.list.add(pStudent);                                        // Student not existed yet. Add now
        return true;                                                    // Added Student successfully to list
    }

    /**
     * This method removes the Student pStudent out of the list if existing.
     *
     * @param pStudent object from type Student that shall be removed from the list.
     * @return 's true if it was successfully and false if it wasn't.
     */
    boolean remove(Student pStudent){
        for (int i = 0; i < this.list.size(); i++){                             // iter over this.list
            if (pStudent.getStudentId() == this.list.get(i).getStudentId()){    // Test if this is Student to be removed
                this.list.remove(i);                                            // found Student, remove him
                return true;                                                    // Successfully removed Student
            }
        }
        return false;                                                           // Student did not exist
    }

    /**
     * This method removes the Student at a concrete position in the list and returns
     * the Student.
     * If the position is too small or bigger than the length of the list it returns null.
     *
     * @param pPos is the position in the list. The Student on that position will be removed.
     */
    Student remove(int pPos){
        if (pPos < 0 | pPos >= this.list.size()){
            return null;
        }
        else{
            Student tmp = this.list.get(pPos);
            this.list.remove(pPos);
            return tmp;
        }
    }

    /**
     * This method returns the Student at a concrete position in the list.
     * If the position is too small or bigger than the length of the list it returns null.
     *
     * @param pPos is the position in the list. The Student on that position will be returned.
     */
    Student get(int pPos){
        if (pPos < 0 | pPos >= this.list.size()){
            return null;
        }
        else{
            return this.list.get(pPos);
        }
    }

    /**
     *
     * @param pLastname
     * @return
     */
    ArrayList<Student> findLastname(String pLastname){
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student student : this.list){
            if (student.getLastname().equals(pLastname)){
                result.add(student);
            }
        }
        return result;
    }

    /**
     *
     * @param pFirstname
     * @return
     */
    ArrayList<Student> findFirstname(String pFirstname){
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student student : this.list){
            if (student.getFirstname().equals(pFirstname)){
                result.add(student);
            }
        }
        return result;
    }

    /**
     *
     * @param pStudentId
     * @return
     */
    int findStudentId(long pStudentId){
        for (int i = 0; i < this.list.size(); i++){
            Student student = this.list.get(i);
            if (student.getStudentId() == pStudentId){
                return i;
            }
        }
        return -1;
    }

    /**
     * @return The size the list what is equal to the number of Students the list contains.
     */
    int size(){
        return this.list.size();
    }

    /**
     * Searches for pStudentId in list.
     * @param pStudentId searches for this StudentId in the list.
     * @return returns true if list contains student with pStudentId. Otherwise it returns false.
     */
    private boolean containsId(final long pStudentId){
        return this.findStudentId(pStudentId) != -1;
    }

    /**
     * This method is can be used to sort the list of Students by a special key.
     * The method is sorting the elements with ***sort.
     * @param key
     */
    void sort(Student.SortKey key){
        if (this.list.size() == 0){
            return;
        }
        switch (key){
            case FIRSTNAME:
                this.sortByFirstname();
                break;
            case LASTNAME:
                this.sortByLastname();
                break;
            case STUDENT_ID:
                this.sortByStudentID();
                break;
            case WEIGHT:
                this.sortByWeight();
                break;
            case BIRTHDAY:
                this.sortByBirthday();
                break;
            default:
                System.out.println("Default");
                throw new IllegalArgumentException("The sort-key is not valid. Please take a correct one.");
        }
    }

    /**
     * ...
     */
    void sortByFirstname(){
        for (int i = this.list.size(); i > 0; i--){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (this.list.get(j).getFirstname().compareTo(this.get(tmp).getFirstname()) < 0){
                    tmp = j;
                }
            }
            this.add(this.remove(tmp));
        }
    }

    /**
     * ...
     */
    void sortByLastname(){
        for (int i = this.list.size(); i > 0; i--){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (this.list.get(j).getLastname().compareTo(this.get(tmp).getLastname()) < 0){
                    tmp = j;
                }
            }
            this.add(this.remove(tmp));
        }
    }
    /**
     * ...
     */
    void sortByStudentID(){
        for (int i = this.list.size(); i > 0; i--){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (this.list.get(j).getStudentId() < this.get(tmp).getStudentId()){
                    tmp = j;
                }
            }
            this.add(this.remove(tmp));
        }
    }

    /**
     * ...
     */
    void sortByWeight(){
        for (int i = this.list.size(); i > 0; i--){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (this.list.get(j).getWeight() < this.get(tmp).getWeight()){
                    tmp = j;
                }
            }
            this.add(this.remove(tmp));
        }
    }
    /**
     * ...
     */
    void sortByBirthday(){
        for (int i = this.list.size(); i > 0; i--){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (
                        this.list.get(j).getBirthday().compareTo(this.get(tmp).getBirthday()) < 0){
                    tmp = j;
                }
            }
            this.add(this.remove(tmp));
        }
    }

    @Override
        /**
         * Overwriting toString()-method. Gives out all students like "Student\n".
         */
        public String toString(){
            String result = "";
            for (Student student : this.list){
                result += student + "\n";
            }
            return result;
        }
}
