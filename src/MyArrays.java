import java.util.*;

public class MyArrays implements List {

    public static Object[] objArr = new Object[3];

    public static int indexCounter = 0 ;

    public static void addArr(Object obj) {
        if(objArr.length == indexCounter) {
            objArr = doubleSpaces(objArr) ;}
        objArr[indexCounter] = obj;
        indexCounter++ ;
        System.out.println(Arrays.toString(MyArrays.objArr));
    }
    public static Object[] doubleSpaces(Object[] tempArr){
        Object[] newArr = new Object[tempArr.length * 2];
        for (int i = 0; i < tempArr.length ; i++) {
            newArr[i] = tempArr[i] ;
        }
        tempArr = newArr ;
        return tempArr;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object obj) {
       /*
       for (Object obj1 : objArr) {
            if (obj1 == obj) {
               System.out.println("It exists");
                return true;
            }
        }*/

        for (int i = 0; i < objArr.length ; i++) {
            if (objArr[i] == obj) {
                System.out.println("It exists");
                return true;
            }
        }
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
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
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
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
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