package pl.sggw;

import java.util.LinkedList;

public class SimpleWzimBoundedQueue<E> implements WzimBoundedQueue<E> {

    public int size = 0;
    public int capacity;
    private Object[] tablica;

    @Override
    public boolean add(final E e)
    {
        if(size == capacity)
            return false;
        else
        {
            tablica[size]=e;
            size++;
        }
        return true;
    }

    @Override
    public boolean offer(final E e)
    {
        return false;
    }

    public SimpleWzimBoundedQueue(final int maxCapacity)
    {
        SimpleWzimBoundedQueue<String> kolejka = new SimpleWzimBoundedQueue<String>(maxCapacity);

        System.out.println(kolejka.capacity());
    }

    public E peek()
    {
        if(size == 0)
            return null;
        return (E)tablica[0];
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
