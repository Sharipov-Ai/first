public class Student {
    String fio;
    String phoneNumber;
    boolean isPaid;

    public Student(String fio, String phoneNumber, boolean isPaid) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Имя='" + this.fio + '\'' + ", Номер телефона='" + this.phoneNumber + '\'' + ", Оплачено=" + this.isPaid + '}' + "\n";
    }
}
