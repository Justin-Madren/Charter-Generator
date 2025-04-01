import java.util.Random;
public class BackGroundGenerator {
    
    Random random = new Random();
    private String[] AreaFrom;
    private String[] FatherCondition;
    private String[] MotherCondition;
    private String[] BackGround;
    private int numOfBrothers;
    private int numOfSisters;

    public BackGroundGenerator(){
        AreaFrom = new String[] {"Farm", "Small Town", "Big City", "Traveled from place to place", "Country"};
        FatherCondition = new String[] {"Alive", "Dead", "Missing"};
        MotherCondition = new String[] {"Alive", "Dead", "Missing"};
        BackGround = new String[] {"Acolyte", "Anthropologist", "Archaeologist", "Athete", "Charlatan", "City Watch", "Clan Crafter",
                                "Cloistered Scholar", "Courtier", "Criminal", "Entertainer", "Faceless", "Faction Agent",
                                "Far Traveler", "Feylost","Fisher", "Folk Hero", "Giant Foundling", "Gladiator", "Guild Artisan",
                                "Guild Merchant", "Haunted One", "Hermit", "House Agent", "Inheritor", "Invertigator", 
                                "Kight", "Kight of the Order", "Matine", "Mercenary Vereran", "Noble", "Outlander", "Pirate",
                                "Rewarded", "Ruined", "Rune Carver", "Sage", "Sailor", "Shipwright", "Smuggler", "Soldier","Spy"};
        generatedSylbings();
    }

    /* geting the amount of sylbings the charter has
     * and seeing how many are boys or girls. First it generates a 
     * random number and goes through a for loop that many times.
     * Every time the loop is iterated an other number is gererated and 
     * there is and if statemnt to see if its ever or odd. If its even its is added
     * to the number of brothers if its odd its added to the number of sisters.
     */
    private void generatedSylbings(){
        int numOfSylbings = random.nextInt(11);
        for(int i = 0; i < numOfSylbings; i++){
            int SylbingGenterGenerator = random.nextInt(101);
            if(SylbingGenterGenerator % 2 == 0){
                numOfBrothers++;
            }else{
                numOfSisters++;
            }
        }
    }

    /*
     * getter for the areaFrom it generates a random numbers that
     * is in the range of the list if all the area options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getRandomAreaFrom(){
        int AreaFromHolder = random.nextInt(AreaFrom.length);
        return AreaFrom[AreaFromHolder];
    }

    /*
     * getter for the fatherCondition it generates a random numbers that
     * is in the range of the list if all the fatherCondition options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getFatherCondition(){
        int FatherConditionHolder = random.nextInt(FatherCondition.length);
        return FatherCondition[FatherConditionHolder];
    }

    /*
     * getter for the motherCondition it generates a random numbers that
     * is in the range of the list if all the motherCondition options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getMotherCondition(){
        int MotherConditionHolder = random.nextInt(MotherCondition.length);
        return MotherCondition[MotherConditionHolder];
    }

    /*
     * getter for the background it generates a random numbers that
     * is in the range of the list if all the background options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getBackGround(){
        int BackGroundHolder = random.nextInt(BackGround.length);
        return BackGround[BackGroundHolder];
    }
    
    /*
     * getter for the total number of sylbings adds the getter for 
     * the brothers and sisters.
     */
    public int getNumberOfSylbings(){
        return getNumberOfBrothers() + getNumberOfSisters();
    }

    /*
     * The method getNumberOfBrothers()  can access the numOfBrothers because  numOfBrothers  is a instance variable of
     * the BackGroundGenerator class. This variable is set and modified within the class, specifically
     * within the generatedSylbings() method, and are accessible by any method within the class.
     * After the generatedSylbings has run returns the numOfBrothers.
     */
    public int getNumberOfBrothers(){
        return numOfBrothers;
    }

    /*
     * The method getNumberOfSisters()  can access the numOfSisters because  numOfSisters  is a instance variable of
     * the BackGroundGenerator class. This variable is set and modified within the class, specifically
     * within the generatedSylbings() method, and are accessible by any method within the class.
     * After the generatedSylbings has run returns the numOfSisters.
     */
    public int getNumberOfSisters(){
        return numOfSisters;
    }

    /*
     * Printer for the Backeround Class it just calles all the getters
     * from all of the methods and prints them out.
     */
    public void BackGroundPrinter(){
        System.out.println("Area From :          " + getRandomAreaFrom());
        System.out.println("Father Condition :   " + getFatherCondition());
        System.out.println("Mother Condition :   " + getMotherCondition());
        System.out.println("Number of Sylbings : " + getNumberOfSylbings());
        System.out.println("Number of Borthers : " + getNumberOfBrothers());
        System.out.println("Number of Sisters :  " + getNumberOfSisters());
        System.out.println("BackGround :         " + getBackGround());
    }
    public static void main(String[] args) {
       BackGroundGenerator display = new BackGroundGenerator();
       display.BackGroundPrinter();
    }
}
