import java.util.Random;
public class SceneGenerator {
    Random random = new Random();
    private String[] whatCharterIsDoing;
    private String[] weather;
    private String[] timeOfDay;

    private int numOfCharters;
    


    /*
     * The constroctor for the class that intlizes the lists and inlitizes the number of charters in the scene
     */
    public SceneGenerator(){
        whatCharterIsDoing = new String[] {"Relaxing", "Training", "Reading", "Playing a Game", "Writing", "Drawing", "Bored", "Working", "Traveling"};
        weather = new String[] {"Clear Skys", "Cloudy", "Light Rain", "Heavy Rain", "Thunder Storm", "Snowing", "Blizzard", "Overcase","Foggy","Hot","Cold"};
        timeOfDay = new String[] {"Early Morning", "Morning", "Early Noon", "Noon", "Afternoon", "Early Night", "Night", "Late Night"};

        this.numOfCharters = random.nextInt(3) + 1;
    }
    /*
     * getter for what the charter is doing generates a randomnumber that is in 
     * range of the list of aptions and then returns the string at that postion.
     * @returns whatCharterIsDoing[CharDoingHolder]
     */
    public String getWhatCharterIsDoing(){
        int CharDoingHolder = random.nextInt(whatCharterIsDoing.length);
        return whatCharterIsDoing[CharDoingHolder];
    }
    /*
     * getter of the weather it generates a randomnumber that is in 
     * range of the list of aptions and then returns the string at that postion.
     * @returns weather[WeatherHolder]
     */
    public String getWeather(){
        int WeatherHolder = random.nextInt(weather.length);
        return weather[WeatherHolder];
    }
    /*
     * getter for the time of day it generates a randomnumber that is in 
     * range of the list of aptions and then returns the string at that postion.
     * @returns imeOfDay[timeOfDayHolder];
     */
    public String getTimeOfDay(){
        int timeOfDayHolder = random.nextInt(timeOfDay.length);
        return timeOfDay[timeOfDayHolder];
    }
    /*
     * getter for the amount of charters in the scene its inlitized
     * in the constroctor because it's a dependent in the used interface class
     * for when it displays the scene and charters generated for that scene.
     * @returns this.numOfCharters 
     */
    public int amountOfCharters(){
        return this.numOfCharters;
    }
    /*
     * printer for the class its just calls all the generating methods
     * and prints them out.
     */
    public void ScenePrinter(){
        System.out.println("Activity :         " + getWhatCharterIsDoing());
        System.out.println("Weather :          " + getWeather());
        System.out.println("Time of Day :      " + getTimeOfDay());
        System.out.println("Number of People : " + amountOfCharters());
    }



    public static void main(String[] args) {
        SceneGenerator test = new SceneGenerator();
        test.ScenePrinter();
    }
}
