/**
 * Simple module which demonstrates my first attempt at creating an ArrayList in Java.
 */
package package3.DataStructureImplementations;

public class DynamicArray {
    private Object[] underlyingArray;
    private final int DEFAULT_CAPACITY = 10;
    private int sizeOfArray = 0;

    public DynamicArray(){this.underlyingArray = new Object[DEFAULT_CAPACITY];}

    public void add(Object newElement){
        this.underlyingArray[this.sizeOfArray] = newElement;
        sizeOfArray++;
    }

}
