import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student harryPotter = new Student("Harry Potter", "+996555555555", true);
        Student hermione = new Student("Hermione", "+9965559844566", false);
        Student ronWeasley = new Student("Ron Weasley", "+996555753495", false);
        Student dracoMalfoy = new Student("Draco Malfoy", "+996666666666", true);
        Student tomRiddle = new Student("Tom Marvolo Riddle" , "+996559425271", false);

        Course course = new Course();

        Teacher severusSnape = new Teacher("Severus Snape" , 5000, "Black Magic defence" );
        course.addTeacher(severusSnape);
        course.print(severusSnape);

        course.studentsCount(5);
        course.addStudent(harryPotter);
        course.addStudent(hermione);
        course.addStudent(ronWeasley);
        course.addStudent(dracoMalfoy);
        course.addStudent(tomRiddle);

        System.out.println(Arrays.toString(course.students));
        System.out.println("-----------");

        course.removeStudent("+996559425271");
        course.removeStudent("+996666666666");
        System.out.println(Arrays.toString(course.students));
    }
}
