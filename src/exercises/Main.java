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
public class Main {

    public static void main(String[] args) {
	    StudentList list1 = new StudentList();
        list1.add(new Student("Stefani", "Georgieva", 1L, 60d, new Date(1)));
        list1.add(new Student("Eric", "Naber", 2L, 100d, new Date(1)));
        list1.add(new Student("Jan", "Naber", 3L, 200d, new Date(1)));
        list1.add(new Student("Dennis", "Mayer", 4L, 100d, new Date(1)));
        list1.add(new Student("Jérôme", "Bruck", 5L, 100d, new Date(1)));
        list1.add(new Student("Katia", "Rezek", 6L, 100d, new Date(1)));
        list1.add(new Student("Bayan", "", 7L, 100d, new Date(1)));

        System.out.println("Added all students.");

        System.out.println(list1);
        list1.sort(Student.SortKey.FIRSTNAME);
    }
}
