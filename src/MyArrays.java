import java.util.*;

public class MyArrays implements List {

    private Object[] objArr = new Object[1];
    private int objCounter = 0;

    public void addArr(Object obj) {
        if (objArr.length == objCounter) {
            objArr = doubleSpaces(objArr);
        }
        objArr[objCounter] = obj;
        objCounter++;
        System.out.println(Arrays.toString(objArr));
    }

    private Object[] doubleSpaces(Object[] arr) {
        Object[] tempArr = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        return arr;
    }

    @Override
    public Object[] remove(int index) {
        Object[] tempArr = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (i == index) {
                objCounter--;
                continue;
            }
            tempArr[i] = objArr[i];
        }
        objArr = tempArr;
        System.out.println(Arrays.toString(objArr));
        return objArr;
    }

    public Object[] removeByObject(Object obj) {
        Object[] tempArr = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == obj) {
                objCounter--;
                continue;
            }
            tempArr[i] = objArr[i];
        }
        objArr = tempArr;
        System.out.println(Arrays.toString(objArr));
        return objArr;
    }

    private void pushNullsToRight() {
        Object[] temp = new Object[objArr.length];
        int indexCounter = 0;
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] != null) {
                temp[indexCounter] = objArr[i];
                indexCounter++;
            }
        }
        objArr = temp;
    }

    public Object[] removeNulls() {
        pushNullsToRight();
        Object[] tempArr = new Object[objCounter];
        for (int i = 0; i < objCounter; i++) {
            if (objArr[i] == null) {
                break;
            }
            tempArr[i] = objArr[i];
        }
        objArr = tempArr;
        System.out.println(Arrays.toString(objArr));
        return objArr;
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == obj) {
                System.out.println("\"" + obj.toString() + "\"" + " Exists in your Array");
                return true;
            }
        }
        System.out.println("\"" + obj.toString() + "\"" + " Doesn't exist in your Array.");
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        if (objArr[index] == null) {
            objCounter++;
        }
        objArr[index] = element;
        System.out.println(Arrays.toString(objArr));
        return objArr;
    }

    public void insertObjectByIndex(int index, Object obj) {
        for (int i = objArr.length - 1; i > index; i--) {
            objArr[i] = objArr[i - 1];
        }
        if (objArr[index] == null) {
            objCounter++;
        }
        objArr[index] = obj;
        System.out.println(Arrays.toString(objArr));
    }

    @Override
    public int size() {
        return objArr.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        System.out.println(objArr[index].toString());
        return objArr[index];
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}