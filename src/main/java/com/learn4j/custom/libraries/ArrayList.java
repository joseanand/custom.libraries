/**
 * 
 */
package com.learn4j.custom.libraries;

import java.util.Arrays;

/**
 * @author jose
 *
 */
public class ArrayList<E>  {
    
    /** The data. */
    Object [] data;
    
    /** The size. */
    int size;
    
    
    /**
     * Instantiates a new array list.
     */
    public ArrayList() {
        data = new Object [0];
    }
    
    /**
     * Adds the.
     *
     * @param obj the obj
     */
    public void add(Object obj) {
        capacity(size + 1);
        data[size++]=obj;
    }

    /**
     * Capacity.
     *
     * @param minCapacity the min capacity
     */
    private void capacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            data = Arrays.copyOf(data, minCapacity);
        }
        
    }
    
    /**
     * Gets the.
     *
     * @param index the index
     * @return the object
     */
    public Object get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            return data[index];
        }
    }
    
    /**
     * Size.
     *
     * @return the int
     */
    public int size() {
        return size;
    }

    

}
