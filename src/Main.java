import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Rectangle деген класс түзүнүз.
         * Поляларын түзүнүз.
         * Объектисин түзүнүз.
         * Поялларына маанини геттер жана сеттер менен бериңиз.
         * Маанини бергенден кийин ошол тик бурчтуктун аянтын табыныз.
         * Aянтын табуу үчүн атайын метод түзүнүз, ал метод ошол тик бурчтуктун аянтын
         * кайтарышы керек.
         */


//        Rectangle rectangle= new Rectangle();
//
//        rectangle.setA(3);
//        rectangle.setB(7);
//
//        System.out.println(rectangle.getA());
//        System.out.println(rectangle.getB());
//
//        rectangle.getArea(rectangle.getA(),rectangle.getB());

        /**
         * Student деген класс түзүнүз.
         * Поле: Аты, фамилиясы, жашы жана катышкан сабактары
         * (courses)болсун.
         * Геттер сеттерлерди маани берип жана алуу үчүн түзүнүз.
         * Setterлерге маанини сканнер аркылуу бериниз .
         * Курстарды сканнер аркылуу толтурунуз.
         * Бардык маанилерди консольго чыгарыныз.
         */

        Scanner scanner = new Scanner(System.in);
        Scanner scannerForArray=new Scanner(System.in);
        Student student = new Student();
        String[] course = new String[3];
        System.out.println("Write first name:");
        student.setFirstName(scanner.nextLine());
        System.out.println("Write last name: ");
        student.setLastName(scanner.nextLine());
        System.out.println("Write age: ");
        student.setAge(scanner.nextInt());
        System.out.println("Write courses (3)");
        student.setCourses(course, scannerForArray);


        System.out.println("Student Name: "+student.getFirstName());
        System.out.println("Student Surname: "+student.getLastName());
        System.out.println("Student age: "+student.getAge());
        System.out.println("Student`s courses: "+Arrays.toString(student.getCourses()));

    }
}