import java.util.Random;

public class CharterGenerator {

    Random random = new Random();
    private String[] ThemeList;
    private String[] ItemList;
    private String[] ClassOrJob;
    private String[] SpecialTrait;
    private String[] MaleBodyType;
    private String[] FemaleBodyType;
    private String[] Races;
    private String[] YokaiTypes;

    private String raceHolder;
    private String genderHolder;
    private double heightHolder;
    /*
     * The constructore seting up the arrays and the holders for the gender and race because other methods depend on them 
     * so they need to be keep consistent.
     */
    public CharterGenerator(){
        ThemeList = new String[] {"Fantasy" ,"Steampunk" ,"CyberPunk" ,"Modern" ,"Grim dark" ,"Midevil" ,"Renaissance" ,"Science fiction" ,"Horror",
                                "Post Apocalyptic"};
        ItemList = new String[] {"Pendant", "Locket", "Ring", "Wand", "Weapon", "Diary", "Glass Chest Piece", "Glass Orb Filled With Smoke", 
                                "Smoking Pipe", "A Dragon Scale", "Monocle", "Glasses", "Head Band", "Armor", "Over Sized Backpack", 
                                "A Animal Skull", "A Unique Gold Coin", "Small Jade Statue", "Set Of Tools"};
        ClassOrJob = new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer",
                                "Warlock", "Wizard", "Artificer"};
        SpecialTrait = new String[] {"Scaring", "Birth Mark", "Long Hair", "Short Hair", "Freckles", "Missing a Body Part", "Muscular",
                                "Lanky", "Thin", "Big", "Heterochromia", "Pale"};
        MaleBodyType = new String[] {"Rectangle", "Triangle", "Inverted Triangle", "Trapezoid", "Oval"};
        FemaleBodyType = new String[] {"Hourglass", "Pear", "Inverted Pear", "Rectangle", "Apple"};
        Races = new String[] {"Human", "Yokai", "Wood Elf", "Sun Elf", "Dark Elf", "Half Elf","Oni", "Ork", "Dragon Born", "Fairy", "Pixy",
                                 "Gnome", "Dwarf"};
        YokaiTypes = new String[] {"Fox", "Wolf", "Bunny", "Tanuki", "Cat", "Kappa", "Yurei", "Badger","Futakuchi-onna"};

        this.genderHolder = getGender();
        this.raceHolder = getRace();
        this.heightHolder = getNewHeight();
    }
    /*
     * Creates a random number 0 or 1 and if its 0
     * the gender is male and if is 1 its female.
     * @return genderHolder
     */
    public String getGender(){
        int GenterGenerator = random.nextInt(2);
        if(GenterGenerator == 0){
              this.genderHolder = "Male";
        }else{
             this.genderHolder = "Female";
        }
        return this.genderHolder;
    }
    /*
     * In the constor getNewHeight is called because the conversion
     * dependes on it. The getHightConverstion converts the height
     * from cm to ft and rounds it to 1 decimal place.
     * @return roundedValue
     */
    public String getHeightCoverstion(){
        double defaultHeight = this.heightHolder;
        double ConvertedHeight = defaultHeight / 30.48;
        String roundedValue = String.format("%.1f", ConvertedHeight);
        return roundedValue;
    }
    /*
     * Generates a Random value from 1 to 40 then subtracts 20 
     * to get -20 to 20. This is use for vering the height of
     * the generated Charter.
     * @return HightOffSet
     */
    public int getHeightOffSet(){
        int HeightOffSet = random.nextInt(41) - 20;
        return HeightOffSet;
    }

    /*
     * In the constor getRace and getGender ar called because newHeight Depends on them.
     * I do that to keep the race and the gender the same when printing out the results.
     * It checks the race and then the gender to find the correct base height and then adds
     * the offset to it.
     * return the base height + offSetHolder
     */
    public double getNewHeight(){
        String raceHolder = this.raceHolder;
        String genderHolder = this.genderHolder;
        double offsetHolder = (double)getHeightOffSet();

        if(raceHolder.equals("Human") || raceHolder.equals("Yokai") || 
        raceHolder.equals("Wood Elf") || raceHolder.equals("Sun Elf") ||
        raceHolder.equals("Dark Elf") || raceHolder.equals("Half Elf")){
            if(genderHolder.equals( "Male")){
                 return 175.3 + offsetHolder;
            }else{
                 return 160.95 + offsetHolder;
            }


        }else if(raceHolder.equals("Oni") || raceHolder.equals("Ork") ||
        raceHolder.equals("Dragon Born")){
            if(genderHolder.equals( "Male")){
                return 193.04 + offsetHolder;
            }else{
                return 178.04 + offsetHolder;
            }
            
        }else if(raceHolder.equals("Fairy") || raceHolder.equals("Pixy")){
            if(genderHolder.equals( "Male")){
                return 45.72 + offsetHolder;
            }else{
                return 30.89 + offsetHolder;
            }

        }else if(raceHolder.equals("Gnome")){
            if(genderHolder.equals( "Male")){
                return 106.68 + offsetHolder;
            }else{
                return 98.75 + offsetHolder;
            }
        }else if(raceHolder.equals("Dwarf")){
            if(genderHolder.equals( "Male")){
                return 137.16 + offsetHolder;
            }else{
                return 122.82 + offsetHolder;
            }
        }
                return offsetHolder;
    }

    /*
     * getter for the theme it generates a random numbers that
     * is in the range of the list if all the theme options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getTheme(){
        int ThemeListHolder = random.nextInt(ThemeList.length);
        return ThemeList[ThemeListHolder];
    }

    /*
     * getter for the item it generates a random numbers that
     * is in the range of the list if all the item options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getItem(){
        int ItemListHolder = random.nextInt(ItemList.length);
        return ItemList[ItemListHolder];
    }

    /*
     * getter for the ClassOrJob it generates a random numbers that
     * is in the range of the list if all the Class options.
     * Its saved to a varable and then it returns the Class in
     * the array at that postion.
     */
    public String getClassOrJob(){
        int ClassOrJobHolder = random.nextInt(ClassOrJob.length);
        return ClassOrJob[ClassOrJobHolder];
    }

    /*
     * getter for the trait it generates a random numbers that
     * is in the range of the list if all the traits options.
     * Its saved to a varable and then it returns the trait in
     * the array at that postion.
     */
    public String getSpecialTrait(){
        int SpecialTraitHolder = random.nextInt(SpecialTrait.length);
        return SpecialTrait[SpecialTraitHolder];
    }

    /*
     * getter for the maleBodyType it generates a random numbers that
     * is in the range of the list if all the maleBodyType options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getMaleBodyType(){
        int MaleBodyTypeHolder = random.nextInt(MaleBodyType.length);
        return MaleBodyType[MaleBodyTypeHolder];
    }

    /*
     * getter for the femaleBodyType it generates a random numbers that
     * is in the range of the list if all the femaleBodyType options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getFemaleBodyType(){
        int FemaleBodyTypeHolder = random.nextInt(FemaleBodyType.length);
        return FemaleBodyType[FemaleBodyTypeHolder];
    }

    /*
     * getter for the race it generates a random numbers that
     * is in the range of the list if all the races options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getRace(){
        int RaceHolder = random.nextInt(Races.length);
        this.raceHolder = Races[RaceHolder];
        return this.raceHolder;
    }

    /*
     * getter for the yokaiType it generates a random numbers that
     * is in the range of the list if all the yokaiType options.
     * Its saved to a varable and then it returns the thing in
     * the array at that postion.
     */
    public String getYokaiType(){
        int YokaiTypesHolder = random.nextInt(YokaiTypes.length);
        return YokaiTypes[YokaiTypesHolder];
    }

    /*
     * the printer for all the generated objects. For the race and gender
     * it gets the one that is set up in the constructure to keep things concistant.
     * because if it called the getters for them it would most likey be a differt race
     * and or gender that the one that was used for the hight getter. all the others 
     * are just the getters called at the begening and saved into a verable for 
     * keeping things consistiate. Then the print statments have some if conditions in them.
     * For the race if its a Yokai then it will print out the type the other is for printing
     * out the correct bodytypes.
     */
    public void CharterPrinter(){
        String raceHolder = this.raceHolder;
        String yokaiHolder = getYokaiType();
        String genderHolder = this.genderHolder;
        String maleBodyTypeHolder = getMaleBodyType();
        String femaleBodyTypeHolder = getFemaleBodyType();
        String themeHolder = getTheme();
        String classHolder = getClassOrJob();
        String traitHolder = getSpecialTrait();
        String itemHolder = getItem();
        double cmHightHolder = this.heightHolder;
        String ftHeightHolder = getHeightCoverstion();

                System.out.println("Race :      " + raceHolder);
                if(raceHolder.equals("Yokai")){
                    System.out.println("Type :      " + yokaiHolder);
                }
                System.out.println("Gender :    " + genderHolder);
                if(genderHolder.equals("Male")){
                    System.out.println("Body Type : " + maleBodyTypeHolder);
                }else{
                    System.out.println("Body Type : " + femaleBodyTypeHolder);
                }
                System.out.println("Theme :     " + themeHolder);
                System.out.println("Class/Job : " + classHolder);
                System.out.println("Trait :     " + traitHolder);
                System.out.println("Item :      " + itemHolder);
                System.out.println("Height cm : " + cmHightHolder);
                System.out.println("Height Ft : " + ftHeightHolder);
           
    }
    // public String CharterPrinter() {
    //     StringBuilder sb = new StringBuilder();
    
    //     String raceHolder = this.raceHolder;
    //     String yokaiHolder = getYokaiType();
    //     String genderHolder = this.genderHolder;
    //     String maleBodyTypeHolder = getMaleBodyType();
    //     String femaleBodyTypeHolder = getFemaleBodyType();
    //     String themeHolder = getTheme();
    //     String classHolder = getClassOrJob();
    //     String traitHolder = getSpecialTrait();
    //     String itemHolder = getItem();
    //     double cmHightHolder = this.heightHolder;
    //     String ftHeightHolder = getHeightCoverstion();
    
    //     sb.append("Race:       ").append(raceHolder).append("\n");
    //     if (raceHolder.equals("Yokai")) {
    //         sb.append("Type:       ").append(yokaiHolder).append("\n");
    //     }
    //     sb.append("Gender:     ").append(genderHolder).append("\n");
    //     if (genderHolder.equals("Male")) {
    //         sb.append("Body Type:  ").append(maleBodyTypeHolder).append("\n");
    //     } else {
    //         sb.append("Body Type:  ").append(femaleBodyTypeHolder).append("\n");
    //     }
    //     sb.append("Theme:      ").append(themeHolder).append("\n");
    //     sb.append("Class/Job:  ").append(classHolder).append("\n");
    //     sb.append("Trait:      ").append(traitHolder).append("\n");
    //     sb.append("Item:       ").append(itemHolder).append("\n");
    //     sb.append("Height cm:  ").append(cmHightHolder).append("\n");
    //     sb.append("Height Ft:  ").append(ftHeightHolder).append("\n");
    
    //     return sb.toString();
    // }

    public static void main(String[] args) {
        CharterGenerator testing = new CharterGenerator();
        testing.CharterPrinter();
    }
}