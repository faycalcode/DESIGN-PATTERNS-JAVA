package Memento;

public class MyMain {
    public static void main(String [] args){
        PersonStateFull p = new PersonStateFull();


        p.setName("Polo");
        p.setAge(25);
        System.out.println(p.getAge() + " "+p.getName());
        IDataState safe = p.getState();

        p.setAge(155);

        p.setState(safe);

        System.out.println(p.getAge() + " "+p.getName());

    }
}
