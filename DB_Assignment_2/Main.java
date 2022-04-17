package HW2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Ex1 Testing____________________________________________
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("Daniel1", 0.1);
        Student s2 = new Student("Daniel2", 0.2);
        Student s3 = new Student("Daniel3", 1.1);
        Student s4 = new Student("Daniel4", 1.2);
        Student s5 = new Student("Daniel5", 2.1);
        Student s6 = new Student("Daniel6", 2.2);
        Student s7 = new Student("Daniel7", 3.1);
        Student s8 = new Student("Daniel8", 3.2);
        Student s9 = new Student("Daniel9", 4.1);
        Student s10 = new Student("Daniel10", 4.2);
        Student s11 = new Student("Daniel11", 5.1);
        Student s12 = new Student("Daniel12", 5.2);
        Student s13 = new Student("Daniel13", 6.1);
        Student s14 = new Student("Daniel14", 6.2);
        Student s15 = new Student("Daniel15", 7.1);
        Student s16 = new Student("Daniel16", 7.2);
        Student s17 = new Student("Daniel17", 8.1);
        Student s18 = new Student("Daniel18", 8.2);
        Student s19 = new Student("Daniel19", 9.1);
        Student s20 = new Student("Daniel20", 9.2);
        Student s21 = new Student("Daniel21", 9.5);
        Student s22 = new Student("Daniel22", 10.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);
        students.add(s12);
        students.add(s13);
        students.add(s14);
        students.add(s15);
        students.add(s16);
        students.add(s17);
        students.add(s18);
        students.add(s19);
        students.add(s20);
        students.add(s21);
        students.add(s22);

        printMap(gradeMapFilter(students));
        //Ex1 End Testing____________________________________________

        //Ex2 Testing________________________________________________
        MyList l = new MyList(100);
        l.add(33);
        l.add(11);
        l.add(4);
        l.add(88);
        l.print();
        System.out.println(l.lookup(33)); //true
        System.out.println(l.lookup(0)); //false
        //Ex2 End Testing____________________________________________
    }

    //Function for mapping all students by their rounded grade
    public static Map<Integer, TreeSet<Student>> gradeMapFilter(TreeSet<Student> orderedStudentsByGrade) {
        Map<Integer, TreeSet<Student>> gradeMapFiltered = new HashMap<>();

        for (int i = 10; i >= 0; --i) {
            TreeSet<Student> studentsWithSameGrade = new TreeSet<>();
            for (Student s : orderedStudentsByGrade) {
                if (s.getGrade() < i + 0.5 && s.getGrade() >= i - 0.5){
                    studentsWithSameGrade.add(s);
                }
            }
            gradeMapFiltered.put(i, studentsWithSameGrade);
        }

        return gradeMapFiltered;
    }

    //Function to print all students by their rounded grade
    public static void printMap(Map<Integer, TreeSet<Student>> map) {
        // "var" available since Java 10 in case of compiling errors
        for (var x : map.entrySet()) {
            System.out.print(x.getKey() + " [");
            for (var y : x.getValue()) {
                System.out.print(y.getName() + ": " + y.getGrade() + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}
