package PassOrFailStudent;

public class StudentDriver {
    Student sd[] = new Student[3];
    Student s;
    public void addStudent(){
        for(int i=0;i<sd.length;i++){
            if(sd[i]==null){
                System.out.println("Enter id:");
                int id = Student.sc.nextInt();
                System.out.println("Enter name:");
                String name = Student.sc.next();
                s = new Student(id,name);
                sd[i] = s;
                System.out.println("Student is added in database");
                return;
            }
        }
        System.out.println("Database is full");
    }
    public void removeStudent(){
        System.out.println("Enter id to remove student");
        int id = Student.sc.nextInt();
        for (int i =0;i<sd.length;i++){
            if(sd[i]!=null && sd[i].id==id){
                sd[i]=null;
                System.out.println("Student is removed");
                return;
            }
        }
        System.out.println("Id not found");
    }
    public void displayStudent(){
        System.out.println("Enter id to display student");
        int id = Student.sc.nextInt();
        for (int i =0;i<sd.length;i++){
            if(sd[i]!=null && sd[i].id==id){
                System.out.println(sd[i]);
                return;
            }
        }
        System.out.println("Id not found");
    }
    public void dynamic(){
        System.out.println("1. Pass 2.fail");
        switch (Student.sc.nextInt()){
            case 1:{
                for(int i =0;i<sd.length;i++){
                    int count=0;
                    if(sd[i]!=null){
                        int[] marks = sd[i].marks;
                        for(int j=0;j<marks.length;j++){
                            if(marks[j]<35){
                                count++;
                            }
                        }
                    }
                    if(count==0){
                        System.out.println(sd[i]);
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Enter for how many subjects is the student failed");
                int failCount=Student.sc.nextInt();
                for(int i =0;i<sd.length;i++){
                    int count=0;
                    if(sd[i]!=null){
                        int[] marks = sd[i].marks;
                        for(int j=0;j<marks.length;j++){
                            if(marks[j]<35){
                                count++;
                            }
                        }
                    }
                    if(count==failCount){
                        System.out.println(sd[i]);
                        return;
                    }
                }
                System.out.println("No such student has failed "+failCount+" times");
                break;
            }
        }
    }
}
