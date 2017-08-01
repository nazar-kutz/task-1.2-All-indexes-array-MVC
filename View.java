package N2_All_indexes_array_MVC;

/**
 * Created by HP on 19.07.2017.
 */
public class View {
    public static final String INPUT_INTEGER = "Input integer value: ";
    public static final String WRONG_VALUE = "Wrong value! ";
    public static final String INPUT_AMOUNT = "Input number of elements in array(>0). ";
    public static final String OUR_ARRAY = "Our array: ";
    public static final String FILL_ARRAY = "Fill the array, please: ";
    public static final String ARRAY_CONTAINS_NUMBER = "Array has specified number at the indexes: ";
    public static final String ARRAY_DO_NOT_CONTAINS_NUMBER = "Array has no specified number.";
    public static final String INPUT_YOUR_NUMBER = "Input number to search its indexes. ";

    public void printlnMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message) {
        System.out.print(message);
    }

    /**
     * this method print all elements of the array
     * @param arr
     */
    public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i%5 == 0){
                System.out.println();
            }
            System.out.print("[" + i + "] = " + arr[i] + "; ");
        }
        System.out.println();
    }

    public void showIndexes(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(i%7 == 0){
                System.out.println();
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + ".");
    }
}
