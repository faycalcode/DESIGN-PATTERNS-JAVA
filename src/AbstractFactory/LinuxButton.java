package AbstractFactory;

public class LinuxButton implements Button{
    private String text;
    public LinuxButton(String s){
        this.text = s;
    }

    @Override
    public void onClick(){
        System.out.println("clique sur le button linux : " + this.text);
    }
}
