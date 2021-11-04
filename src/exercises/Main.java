package exercises;

import java.util.Date;

/**
 * Exercise 2, Task 2
 *
 * Group: AG1 01
 * Dennis Mayer 108 020 207 299
 * Jérôme Bruck 108 020 218 150
 * Eric Naber 108 020 213 168
 */
public class Main {

    public static void main(String[] args) {
//      Creating a new list from type StudentList
        System.out.println("Creating new StudentList.");
        StudentList list1 = new StudentList();

//      Adding all students to the list.
        System.out.println("Adding all students:\n");
        list1.add(new Student("Harry", "Potter", 1L, 80d, new Date(80, 6, 31)));
        list1.add(new Student("Ginny", "Weasley", 2L,  70d, new Date(81, 7, 11)));
        list1.add(new Student("Ron", "Weasley", 3L, 90d, new Date(80, 2, 1)));
        list1.add(new Student("Hermione", "Granger", 4L, 72d, new Date(79, 8, 19)));
        list1.add(new Student("Arthur", "Weasley", 5L, 89d, new Date(50, 1, 6)));
        list1.add(new Student("Draco", "Malfoy", 6L, 68d, new Date(80, 5, 5)));
        list1.add(new Student("Albus", "Dumbledore", 7L, 92d, new Date(-18, 0, 0)));
        list1.add(new Student("Remus", "Lupin", 8L, 85d, new Date(60, 2, 10)));
        list1.add(new Student("Sirius", "Black", 9L, 85d, new Date(59, 10, 3)));
        list1.add(new Student("Severus", "Snape", 10L, 83d, new Date(60, 0, 9)));
        list1.add(new Student("Peter", "Pettigrew", 11L, 74d, new Date(60, 8, 9)));
        list1.add(new Student("Tom", "Riddle", 12L, 66d, new Date(26, 11, 31)));
        list1.add(new Student("Rubeus", "Hagrid", 13L, 160d, new Date(28, 11, 6)));
        list1.add(new Student("Gellert", "Grindelwald", 14L, 83d, new Date(-16, 0, 0)));
        list1.add(new Student("Newt", "Scamander", 15L, 76d, new Date(97, 1, 24)));
        list1.add(new Student("Neville", "Longbottom", 16L, 76d, new Date(80, 6, 30)));
        list1.add(new Student("Neville", "Longbottom", 16L, 76d, new Date(80, 6, 30)));
        System.out.println(list1 + "\n");

//      Removing Dumbledore:
        System.out.print("Removing Dumbledore... ");
        list1.remove(list1.findLastname("Dumbledore").get(0));
        if (list1.findLastname("Dumbledore").size() == 0){
            System.out.println("Successfully\n");
        }

//      Sorting and printing by firstname:
        list1.sort(Student.SortKey.FIRSTNAME);
        System.out.println("Sorted by firstname:\n" + list1 + "\n");
//      Adding Student with existing StudentID (wont add, ID already given):
        System.out.println("Adding Eric Naber (ID=1), Successfully... " + list1.add(new Student("Eric",
                "Naber", 1L, 74d, new Date(101, 3, 25))) + "\n");
//      Sorting and printing by studentID
        list1.sort(Student.SortKey.STUDENT_ID);
        System.out.println("Sorted by studentId:\n" + list1 + "\n");
//      Removing Harry Potter, adding Eric Naber again, printing
        System.out.println("Removing Harry Potter, adding Eric Naber again.");
        list1.remove(list1.findStudentId(1));
        list1.add(new Student("Eric", "Naber", 1L, 74d, new Date(101, 3, 25)));
        list1.sort(Student.SortKey.STUDENT_ID);
        System.out.println(list1);
//      Here you can keep on debugging. It is hard to test every function especially super rare cases.
//      E.g. sorting list with no element. There can always be exceptions hard to consider...


        StudentList list2 = new StudentList();
        list2.add(new Student("Peter", "Maffay", 1L, 60d, new Date(0)));
        StudentList list3 = new StudentList(list2);
        list3.remove(0);
        System.out.println(list2);
        System.out.println(list3);

    }
}
