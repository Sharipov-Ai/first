public class Course {
    int id;
    String name;
    int price;
    int duration; // minutes
    Teacher teacher;
    Student[] students;

    public Course() {
    }

    public Course(int id, String name, int price, int duration, Teacher teacher, Student[] students) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.teacher = teacher;
        this.students = students;
    }

    public void studentsCount(int count) {
        students = new Student[count];
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    public void removeStudent(String phoneNumber) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].phoneNumber.equals(phoneNumber)) {
                students[i] = null;
                break;
            }
        }
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacher;
    }

    public void print(Teacher teacher) {
            System.out.println(teacher.fio + " " + teacher.courseName);
    }
    //TODO Вывести имя учителя и название курса на экран

}
