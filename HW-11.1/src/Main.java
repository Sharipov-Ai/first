public class Main {
    public static void main(String[] args) {
        Employee Aidar = new Employee();
        Aidar.fullName = "Aidar Sharipov";
        Aidar.age = 18;
        Aidar.position = "Developer";
        Aidar.salary = 800;
        System.out.println(Aidar);
        Employee ElonMusk = new Employee();
        ElonMusk.fullName = "Elon Musk";
        ElonMusk.age = 49;
        ElonMusk.position = "Director";
        ElonMusk.salary = 0;
        System.out.println(ElonMusk);
        Employee TilekMamytov = new Employee();
        TilekMamytov.fullName = "Tilek Mamytov";
        TilekMamytov.age = 36;
        TilekMamytov.position = "Director";
        TilekMamytov.salary = 2000;
        System.out.println(TilekMamytov);
        Employee BillGates = new Employee();
        BillGates.fullName = "Bill Gates";
        BillGates.age = 65;
        BillGates.position = "Owner";
        BillGates.salary = 5000;
        System.out.println(BillGates);

    }
}