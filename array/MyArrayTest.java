package array;

public class MyArrayTest {
    
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        int size = myArray.size();

        System.out.println(size);

        myArray.add(99);
        myArray.add(98);
        myArray.add(97);
        myArray.show();

        myArray.delete(0);
        myArray.show();

        int value = myArray.get(1);
        System.out.println(value);
    }
}
