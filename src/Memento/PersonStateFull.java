package Memento;

public class PersonStateFull {
    private DataState state = new DataState();
    public IDataState getState(){
        DataState tmp = new DataState();
        tmp.setAge(state.getAge());
        tmp.setName(state.getName());
        return tmp;
    }
    public void setState(IDataState safe){
        this.state = (DataState)safe;
    }
    public String getName(){
        return state.getName();
    }
    public void setName(String n){
        this.state.setName(n);
    }
    public Integer getAge(){
        return state.getAge();
    }
    public void setAge(Integer a){
        this.state.setAge(a);
    }
}
