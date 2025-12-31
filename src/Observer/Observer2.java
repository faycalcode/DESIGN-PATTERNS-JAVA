package Observer;

import java.util.List;

public class Observer2 implements Observer{
    @Override
    public void update(Observed o){
        List<Integer> elements = ((Matrix)o).getState();
        System.out.println("je rafraichi dans observer2");
        for (Integer e : elements){
            System.out.println(e);
        }
    }
}
