package N2_All_indexes_array_MVC;

/**
 * Created by HP on 19.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //Run
        controller.processUser();
    }
}
