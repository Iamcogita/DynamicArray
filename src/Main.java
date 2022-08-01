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
        newArr.contains("David");
        newArr.remove(0);
        newArr.contains("Hello");
        newArr.removeByObject("&");
        newArr.set(0, "Hey");
        newArr.removeNulls();
        newArr.addArr("!");
        newArr.insertObjectByIndex(5, "&");
        newArr.insertObjectByIndex(7, "&");
        newArr.removeNulls();
        newArr.addArr("!");
        newArr.addArr("!");
        newArr.set(1, null);
        newArr.removeNulls();
        newArr.get(0);


    }
}