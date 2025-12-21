package Decorator;

public abstract class Decorator implements View{
    protected View reference;
    protected Decorator(View target){
        reference = target;
    }
}