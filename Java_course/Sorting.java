import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> { // To make the student capable of sorting
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + " : " + this.age;
    }

    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }
}

public class Sorting {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(12, "Sandeep"));
        studs.add(new Student(14, "Rajat"));
        studs.add(new Student(11, "Sagar"));
        studs.add(new Student(10, "Varun"));

        System.out.println("-------Unsorted-----");
        for (Student stud : studs) {
            System.out.println(stud);
        }

        // will give errror because studnent does not implement Compparable by default
        // Collections.sort(studs);

        // To solve the above problem we will use comparator obj and pass it to sort
        // method
        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student s1, Student s2) {
        // return s1.age > s2.age ? 1 : -1;
        // }
        // };

        // Lambda Expression for above Anonymous class
        Comparator<Student> com = (Student s1, Student s2) -> {
            return s1.age > s2.age ? 1 : -1;
        };
        Collections.sort(studs, com);

        System.out.println("-------Sorted using Comparator-----");
        for (Student stud : studs) {
            System.out.println(stud);
        }

        // To solve the above problem we can also make Student implement Comparable
        // method
        Collections.sort(studs);

        System.out.println("-------Sorted by Implemeting Comparable-----");
        for (Student stud : studs) {
            System.out.println(stud);
        }
    }
}
