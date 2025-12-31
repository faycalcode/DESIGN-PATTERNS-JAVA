package Observer;

import java.util.List;

public class Observer1 implements Observer{
    @Override
    public void update(Observed o){
        List<Integer> elements = ((Matrix)o).getState();
        System.out.println("je rafrichis dans observer1");
        for (Integer e : elements){
            System.out.println(e);
        }
    }
}
