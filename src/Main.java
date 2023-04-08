abstract  class A{
    int a;
    public abstract void m1();
    private A(int a){
        this.a=a;
    }
}
 public class Main {
    int a=10;
    Main(int a){
      //  super(a);
    }
    public void m1(){
        System.out.println("Overriding m1 method");
        System.out.println(a);
    }
    public static void main(String[] args) {
        Main m1 = new Main(20);
        m1.m1();
        System.out.println("Hello world!");
    }
}