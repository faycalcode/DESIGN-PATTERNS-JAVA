package Prototype;

public class Wall implements Prototype{

    private Integer height;
    private Integer length;
    private String color;

    public Wall(){}

    public Wall setHeight(Integer h){
        this.height = h;
        return this;
    }

    public Wall setLength(Integer l){
        this.length = l;
        return this;
    }

    public Wall setColor(String c){
        this.color = c;
        return this;
    }

    @Override
    public Prototype clone() {
        //newObj = obj.clone();
        return (Prototype) new Wall().setLength(this.length).setHeight(this.height).setColor(this.color);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
