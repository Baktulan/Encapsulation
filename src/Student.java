import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String[] courses= new String[3];

    public Student() {
    }

    public Student(String firstName, String lastName, int age, String[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courses = courses;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses,Scanner scanner) {
        for (int i = 0; i < courses.length; i++) {
            courses[i]=scanner.nextLine();
            this.courses = courses;
        }

    }

}
