package ProducteurConsomateur;

import java.util.ArrayList;
import java.util.List;

public class File {
    private List<String> pipe;
    private Integer size;

    public File(Integer size){
        this.size = size;
        pipe = new ArrayList<>();
    }

    synchronized public void addProduct(String msg){
        while(isFull() == true){
            try{wait();}
            catch (Exception e){}
        }
        this.pipe.add(msg);
        notifyAll();
    }

    synchronized public String getProduct(){
        while(isEmpty() == true){
            try{wait();}catch (Exception e){}
        }
        String tmp = this.pipe.get(0);
        this.pipe.remove(0);
        notifyAll();
        return tmp;
    }

    public boolean isFull(){
        return (this.pipe.size() > this.size);
    }

    public boolean isEmpty(){
        return this.pipe.isEmpty();
    }

}
