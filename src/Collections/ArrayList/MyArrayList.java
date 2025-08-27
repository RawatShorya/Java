package Collections.ArrayList;

public class MyArrayList<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public int getSize(){
        return this.size;
    }

    public MyArrayList() {
        this.elementData = new Object[0];
        this.size = 0;
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    private void ensureCapacity(int minCapacity) {
        if (elementData.length == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else if (minCapacity > elementData.length) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elementData, 0, newArray, 0, size);
        elementData = newArray;
    }

    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
