package PassOrFailStudent;
import java.util.Scanner;

public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int marks[] = new int[5];
    static Scanner sc = new Scanner(System.in);
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        storeMarks();
    }
    public void storeMarks(){
        System.out.println("Enter marks");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
    }
}
