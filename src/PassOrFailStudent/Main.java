package PassOrFailStudent;

public class Main {

    public static void main(String[] args) {
        StudentDriver s = new StudentDriver();
        while(true){
            System.out.println("1.add Student 2. remove Student 3.display student 4.dynamic 5. exit");
            switch (Student.sc.nextInt()){
                case 1 :{
                    s.addStudent();
                    break;
                }
                case  2:{
                    s.removeStudent();
                    break;
                }
                case 3:{
                    s.displayStudent();
                    break;
                }
                case 5 :{
                    System.out.println("Application is closed");
                    return;
                }
                case 4: {
                    s.dynamic();
                    break;
                }
            }

        }
    }
}
