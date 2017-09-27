import java.util.Arrays;

public class StackExample<T> {

    private T[] data;
    private int stackPointer;

    public StackExample() {
        this.data = (T[]) new Object[1000];
        this.stackPointer = 0;
    }

    public StackExample(int stackSize) {
        this.data = (T[]) new Object[stackSize];
        this.stackPointer = 0;
    }

    public void push(T item) {
        this.data[this.stackPointer++] = item;
    }

    public T pop() {
        if (this.stackPointer == 0) throw new IndexOutOfBoundsException();
        return this.data[--this.stackPointer];
    }

    public boolean contains(T item) {
        for (int i = 0; i < this.stackPointer; i++) {
            if (this.data[i].equals(item)) return true;
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

    @Override
    public String toString() {
        return "StackExample{" +
                "data=" + Arrays.toString(data) +
                ", stackPointer=" + stackPointer +
                '}';
    }
}
