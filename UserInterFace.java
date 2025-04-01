import java.util.Scanner;
/*
 * User Interface Class Just for printing out both the Background and Charter and Scenes.
 * Plans for some funcentality in what to print and how many and some 
 * other new classes Ex. Personality, Alliment, A scene the charter is in, 
 * the aesthetic of clothing they are wearing,  and other things 
 */
public class UserInterFace {
    Scanner scnr = new Scanner(System.in);
    /*
     * The printer for the User Interface class that prints a 
     * charter with a header on it. It creates a CharterGenertor object
     * and calls the printer from the class.
     */
    public void CharterPrinter(){
        CharterGenerator charter = new CharterGenerator();
        System.out.println("----------Charter Detials----------");
        charter.CharterPrinter();
    }
    /*
     * The printer for the User Interface class that prints a 
     * background with a header on it. It creates a BackGroundGenerator object
     * and calls the printer from the class.
     */
    public void BackGroundPrinter(){
        BackGroundGenerator background = new BackGroundGenerator();
        System.out.println("---------BackGround Detials---------");
        background.BackGroundPrinter();
    }
    /*
     * The printer for the User Interface class that prints a 
     * Scene with a header on it. It creates a ScenePrinter object
     * and calls the printer from the class.
     */
    public void ScenePrinter(){
        SceneGenerator scene = new SceneGenerator();
        System.out.println("---------------Scene----------------");
        scene.ScenePrinter();
    }
    /*
     * The printer for the User Interface class that prints a 
     * Scene and the charters with a header on it. 
     * It creates a SceneGenerator object
     * and calls the printer from the class. In a for loop determed 
     * by the amount of charters and then it calls
     * CharterPrinter from the user interface class.
     */
    public void allChartersInTheScene(){
        SceneGenerator scene = new SceneGenerator();
        System.out.println("---------------Scene----------------");
        scene.ScenePrinter();
        for(int i = 0; i < scene.amountOfCharters() ; i++){
            CharterPrinter();
        }

    }
    /*
     * The print for the users interface class that prints a scene
     * all the charters in that scene and backgrounds for all of
     * them. Creates a SceneGenerator object and then calls the printer
     * from that class. In a for loop determed 
     * by the amount of charters then it prints the charters and the backgrounds for 
     * thoughts charters.
     */
    public void allChartersInTheSceneAndBackgrounds(){
        SceneGenerator scene = new SceneGenerator();
        System.out.println("---------------Scene----------------");
        scene.ScenePrinter();
        for(int i = 0; i < scene.amountOfCharters() ; i++){
            CharterPrinter();
            BackGroundPrinter();;
        }
    }
    /*
     * The actual interface that the user will intercat with it prints out all the options
     * and there are if statments checking the input and then printing out what the user
     * wants to generate. It is in a while loop that will not end till the user enters the
     * option to exit the program.
     */
    public void Interface(){
        while(true){
            System.out.println("---------------------Interface--------------------");
            System.out.println("Generate a Charter                       : Enter 1");
            System.out.println("Generate a Background                    : Enter 2");
            System.out.println("Generate a Scene                         : Enter 3");
            System.out.println("Generate Scene and the Charters          : Enter 4");
            System.out.println("Generate Scene, Charters with Background : Enter 5");
            System.out.println("Ending the program                       : Enter 6");
            int answer = scnr.nextInt();
            if(answer == 1){
                CharterPrinter();
            }else if(answer == 2){
                BackGroundPrinter();
            }else if(answer == 3){
                ScenePrinter();
            }else if(answer == 4){
                allChartersInTheScene();
            }else if(answer == 5){
                allChartersInTheSceneAndBackgrounds();
            }else if(answer == 6){
                System.out.println("Ending Program");
                break;
            }else{
                System.out.println("Error : INVALID INPUT");
            }
        }
    }
    public static void main(String[] args) {
        UserInterFace testing = new UserInterFace();
        testing.Interface();
        
    }
}
