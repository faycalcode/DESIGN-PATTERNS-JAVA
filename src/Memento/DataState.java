package Memento;

public class DataState implements IDataState{
    private String name;
    private Integer age;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}
