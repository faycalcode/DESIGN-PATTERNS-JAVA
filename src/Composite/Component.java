package Composite;

import java.util.List;

public abstract class Component {
    protected String name;
    protected Integer size; //en octet/byte

    public Component(String n, Integer s) {
        this.name = n;
        this.size = s;
    }
    public abstract Integer getSize();

    public abstract List<Component> getChildren();
}