import java.util.ArrayList;

public class ListStack<T> implements StackInterface<T> {

    private ArrayList<T> data;
    private int stackPointer;

    public ListStack() {
        this.data = new ArrayList<T>();
    }

    public void push(T item) {
        this.data.add(stackPointer++, item);
    }

    public T pop() {
        if (this.stackPointer == 0) throw new IndexOutOfBoundsException();
        return this.data.get(--stackPointer);
    }

    public boolean contains(T item) {
        for (T ignored : this.data) {
            if (ignored.equals(item)) return true;
        }
        return false;
    }

    public T access(T item) {
        while (this.stackPointer > 0) {
            T tempItem = this.pop();
            if (item.equals(tempItem)) return tempItem;
        }
        throw new IllegalArgumentException();
    }

    public int size() {
        return this.stackPointer;
    }
}
