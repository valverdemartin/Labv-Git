import java.util.List;

///////////////////////////////////////////Stack implementing our GenericArray//////////////////////////////////////////
public class Pila <T extends Comparable<T>>{
    //Attributes

    private T element;
    private T top;
    private int index;
    private GenericArray myArray;

    //Constructor

    public Pila() {
        this.element = null;
        this.top = null;
        this.myArray = new GenericArray();
    }

    //Getter&&Setters

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getTop() {
        return top;
    }

    public void setTop(T top) {
        this.top = top;
    }

    public GenericArray getMyArray() {
        return myArray;
    }

    public void setMyArray(GenericArray myArray) {
        this.myArray = myArray;
    }

    //Methods

    public void push(T element){
        if(this.myArray != null){ //Redefinir isEmpty??
            this.myArray.add(element);
            this.top = element;
        }
    }

   public T pop(){
       T removed = null;
        if(this.myArray != null){ //Redefinir isEmpty??
            removed = this.top;
            this.myArray.removeLastOne();
            this.index = this.myArray.mySize();
            this.top = (T) this.myArray.returnLastOne();
        }
        return removed;
    }

    public int size(){
        return this.myArray.mySize();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "myArray=" + myArray ;
    }
}
