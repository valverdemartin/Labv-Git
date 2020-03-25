import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GenericArray <T extends Comparable<T>>{
    //Attributes
    private List<T> myArray;

    //Constructor
    public GenericArray() {
        this.myArray = new ArrayList<T>();
    }

    //Getters && Setters

    public List<T> getMyArray() {
        return this.myArray;
    }

    public void setMyArray(List<T> myArray) {
        this.myArray = myArray;
    }

    //Methods
    public boolean exist(T element){
        return this.myArray.contains(element);
    }

    public T getMax(){
        T max = null;
        if(!this.myArray.isEmpty()){
            max = this.myArray.get(0);
            for (T value: this.myArray) {
                if(value.compareTo(max) > 0)
                    max = value;
            }
        }
        return max;
    }

    public T getMin(){
        T min = null;
        if(!this.myArray.isEmpty()){
            min = this.myArray.get(0);
            for (T value: this.myArray) {
                if(value.compareTo(min) < 0)
                    min = value;
            }
        }
        return min;
    }

    public void add(T element){
        this.myArray.add(element);
    }

    public void remove(T element){
        this.remove(element);
    }

    public T removeLastOne(){
        T removed = returnLastOne();
        this.myArray.remove(removed);
        return removed;
    }

    public T returnLastOne(){
        T lastOne = null;
        if(!this.myArray.isEmpty()){
            lastOne = this.myArray.get(this.myArray.size() - 1);
        }
        return lastOne;
    }

    public int mySize(){
        return this.myArray.size() - 1;
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "myArray=" + myArray +
                '}';
    }
}
