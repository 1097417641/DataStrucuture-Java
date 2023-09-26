package array;
public class TestArray {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int[] newArr = deleteElement(arr, 3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }
        
    }

    public static int[] deleteElement(int[] array, int index) {
 
        int[] target = new int[array.length -1];
        for (int i = 0; i < target.length; i++) {
            if (i < index) {
                target[i] = array[i];
            } else {
                target[i] = array[i + 1];
            }
            
        }
    
        return target;
    }
}