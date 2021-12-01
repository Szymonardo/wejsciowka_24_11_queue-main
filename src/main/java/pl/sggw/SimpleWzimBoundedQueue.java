package pl.sggw;

import java.util.LinkedList;

public class SimpleWzimBoundedQueue<E> implements WzimBoundedQueue<E> {

    public int size = 0;
    public int capacity = 10;
    private E[] tablica;

    

    public boolean add(final E e)
    {
        return false;
    }

    public boolean offer(final E e)
    {
        return false;
    }


    public SimpleWzimBoundedQueue(final int maxCapacity)
    {

    }

    public int size()
    {
        return size;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
