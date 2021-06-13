public class Teacher {
    String fio;
    int salary;
    String courseName;

    public Teacher(String fio, int salary, String courseName) {
        this.fio = fio;
        this.salary = salary;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Имя = " + fio + '\'' + ", Зарплата = " + salary + ", Предмет = " + courseName + '\'' + '}';
    }
}
