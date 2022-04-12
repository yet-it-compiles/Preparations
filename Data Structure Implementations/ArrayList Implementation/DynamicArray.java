/**
 * Simple module which demonstrates my first attempt at creating an ArrayList in Java.
 */
package package3.DataStructureImplementations;

public class DynamicArray {
    private Object[] underlyingArray;
    private final int DEFAULT_CAPACITY = 10;
    private int sizeOfArray = 0;

    /**
     * Initializes the Dynamic Array to its default capacity of 10
     */
    public DynamicArray() {
        this.underlyingArray = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Adds an element to the first available space in the array
     *
     * @param newElement the element the user wants to add
     */
    public void add(Object newElement) {
        if (sizeOfArray == underlyingArray.length) // Checks to see if the array has to be increased

            this.underlyingArray[this.sizeOfArray++] = newElement; // Adds item to the next available space
    }

    /**
     * Returns the size of the array
     */
    public int size() {
        return this.sizeOfArray;
    }
    
}
