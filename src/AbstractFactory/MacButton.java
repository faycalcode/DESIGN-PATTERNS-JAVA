package AbstractFactory;

public class MacButton implements Button {
    private String text;
    public MacButton(String s){
        this.text = s;
    }
    @Override
    public void onClick(){
        System.out.println("clique sur le button mac :" + this+text);
    }
}
