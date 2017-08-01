package N2_All_indexes_array_MVC;

import java.util.Scanner;

/**
 * Created by HP on 19.07.2017.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        int numberOfElements = inputAmountElementsOfArray();
        model.setArray(fillArray(numberOfElements));

        //our array
        view.printMessage(View.OUR_ARRAY);
        view.showArray(model.getArray());

        //input number to search indexes
        view.printMessage(View.INPUT_YOUR_NUMBER);
        int userNumber = inputIntWithScanner(); //number indexes in the array user want know

        if (model.isContainsNumber(userNumber)){    //if array contains user's number
            //print indexes of user's number at the array
            view.printlnMessage(View.ARRAY_CONTAINS_NUMBER);
            view.showIndexes(model.getIndexesArray(userNumber));
        }
        else {   //if array doesn't contains user's number
            view.printlnMessage(View.ARRAY_DO_NOT_CONTAINS_NUMBER);
        }
    }

    /**
     * this method read an integer number with the Scanner
     * @return integer value
     */
    private int inputIntWithScanner() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(view.INPUT_INTEGER);
        while (!scanner.hasNextInt()) {
            view.printMessage(view.WRONG_VALUE + view.INPUT_INTEGER);
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * this method read and check an integer value
     * is it number > 0
     * @return amount elements in array
     */
    private int inputAmountElementsOfArray(){
        System.out.print(view.INPUT_AMOUNT);
        int amount = inputIntWithScanner(); //amount elements in the array
        while(amount < 1){
            System.out.print(view.WRONG_VALUE + view.INPUT_AMOUNT);
            amount = inputIntWithScanner();
        }
        return amount;
    }

    /**
     * this method create a new array for
     * numberOfElements elements and fill it
     * @param numberOfElements
     * @return a link to array
     */
    private int[] fillArray(int numberOfElements){

        //create temporary link to array
        int[] arr = new int[numberOfElements];

        //fill array with scanner
        view.printlnMessage(view.FILL_ARRAY);
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = inputIntWithScanner();
        }

        return arr;
    }
}