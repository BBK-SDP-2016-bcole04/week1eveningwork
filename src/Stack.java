import java.util.LinkedList;
import java.util.List;

/**
 * Created by digibrose on 07/01/2016.
 */
public class Stack< T extends Integer > implements Stackint<T> {

    List<T> ItemList = new LinkedList<T>();


    public void push(T Item){
        ItemList.add(0, Item);
    }

    public T pop(){
        return ItemList.remove(0);
    }

}
