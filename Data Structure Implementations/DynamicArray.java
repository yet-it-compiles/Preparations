package package3.DataStructureImplementations;

public class DynamicArray {
    public Object[] underlyingArray;
    public int arrayCapacity = 10;
    public int sizeOfArray = 0;

    public DynamicArray(){
        underlyingArray = new Object[this.arrayCapacity];
    }

    public DynamicArray(int capacity){
        underlyingArray = new Object[capacity];
    }

    public void add(Object e){
        if(this.sizeOfArray == this.underlyingArray.length)
            ensureCapacity();
        this.underlyingArray[sizeOfArray++] = e;
    }

    public int size(){
        return this.sizeOfArray;
    }

    public void ensureCapacity(){
        this.arrayCapacity = arrayCapacity * 2;
        Object[] copiedArray = new Object[this.arrayCapacity];
    }

    public String toString(){
        StringBuilder result = null;
        for (Object eachObject : this.underlyingArray)
            result.append(eachObject).append(" ");
        return "";
    }

}
