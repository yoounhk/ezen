package week03.class05.inheritance2;

public class Student extends People{
    public int no;

    public Student(String name, String ssn, int no) {
        super(name, ssn);
        this.no = no;
    }

    @Override
    public void method() {
        System.out.println("Student 메소드");
    }
}
