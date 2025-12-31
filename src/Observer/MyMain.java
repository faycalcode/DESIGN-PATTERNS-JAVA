package Observer;

public class MyMain {
    public static void main(String[] args){
        Matrix m = new Matrix();

        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        m.attach(o1);
        m.attach(o2);

        m.addValue(120);
        m.addValue(10);
        m.addValue(30);
    }
}
