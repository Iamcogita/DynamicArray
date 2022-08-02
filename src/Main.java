public class Main {

    public static void main(String[] args) {

        MyArrays newArr = new MyArrays();

        newArr.addArr("Hello");
        newArr.addArr("World");
        newArr.addArr("this");
        newArr.addArr("is");
        newArr.addArr("Ana");
        newArr.addArr("&");
        newArr.addArr("Tiago");
        newArr.addArr("&");
        newArr.addArr("David");
        newArr.addArr("!");
        newArr.remove(0);
        newArr.removeByObject("World");
        newArr.insertObjectByIndex(14, "test1");
        newArr.set(12, "test2");
        newArr.removeNulls();

    }
}