package HW2;

public class Student implements Comparable{
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Implementing Getters and Setters just for good practice
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //2 Students having the same grades are ordered alphabetical
    @Override
    public int compareTo(Object o) {
        if (((Student) o).getGrade() != this.grade)
            return Double.compare(((Student) o).getGrade(), this.grade);
        return this.name.compareTo(((Student) o).getName());
    }
}