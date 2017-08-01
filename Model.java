package N2_All_indexes_array_MVC;

/**
 * Created by HP on 19.07.2017.
 */
public class Model {
    //internal array of the modal
    private int array[];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * this method check does the array contain number
     * @param number
     * @return true if array contains number, false - in the other case
     */
    public boolean isContainsNumber(int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

    /**
     * this method return array of indexes where elements equals number
     * @param number
     * @return array of indexes elements equals number
     */
    public int[] getIndexesArray(int number){
        int j = 0;
        int[] indexesArray = new int[getCountNumberIntoArray(number)];
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                indexesArray[j] = i;
                j++;
            }
        }
        return indexesArray;
    }

    /**
     * this method find amount elements of the array equals number
     * @param number
     * @return amount elements equals number
     */
    private int getCountNumberIntoArray(int number){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                counter++;
            }
        }
        return counter;
    }
}