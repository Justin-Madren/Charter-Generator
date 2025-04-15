import java.util.Random;

public class PersonalityGenerator {
    Random random = new Random();

    private String[] OpennessToExperience;
    private String[] Conscientiousness;
    private String[] Extraversion;
    private String[] Agreeableness;
    private String[] Neuroticism;

    private String[] SenseOfHumor;
    private String[] Confidence;
    private String[] Ambition;
    private String[] Empathy;
    private String[] RiskTolerance;
    private String[] Temperament;
    private String[] Curiosity;
    private String[] Loyalty;

    private String[] Talkativeness;
    private String[] Politeness;
    private String[] Charm; 
    private String[] MoralAlignment;
    private String[] LoveLanguage;
    private String[] LearningStyle;
    private String[] LeadershipStyle;

    public PersonalityGenerator(){
        //Core Personality Trates List's
        OpennessToExperience = new String[] {"Loves ", "Likes ", "Not appose to ", "Neutral to ", "Is apposed to ", "Dosen't like ", "Hates "};
        Conscientiousness = new String[] {"Organized", "Disciplined", "Careless", "Impulsive"};
        Extraversion = new String[] {"Outgoing", "Energetic", "Reserved", "Solitary"};
        Agreeableness = new String[] {"Kind", "Empathetic", "Cooperative", "Critical", "Antagonistic", "Hostile"};
        Neuroticism = new String[] {"Anxious", "Moody", "Calm", "Emotionally stable"};
        //Fun Generic Trates
        SenseOfHumor = new String[] {"Dry", "Goofy", "Sarcastic", "Dark"};
        Confidence = new String[] {"Shy", "Modest", "Confident", "Arrogant"};
        Ambition = new String[] {"Lazy", "Content", "Driven", "Obsessed"};
        Empathy = new String[] {"Very low", "Low", "Moderate", "High", "Very high"};
        RiskTolerance = new String[] {"Cautious", "Balanced", "Thrill-seeker"};
        Temperament = new String[] {"Chill", "Hot-headed", "Moody"};
        Curiosity = new String[] {"Uninterested", "Curious", "Obsessed"};
        Loyalty= new String[] {"Disloyal", "Loyal", "Blindly loyal"};
        //Social , Moral, Love, and Learning Traits
        Talkativeness = new String[] {"Quiet", "Chatty", "Motor-mouth"};
        Politeness = new String[] {"Rude", "Blunt", "Polite", "Overly formal"};
        Charm = new String[] {"Awkward", "Likable", "Charismatic"};
        MoralAlignment = new String[] {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral",
                                         "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
        LoveLanguage = new String[] {"Words of Affirmation","Acts of Service", "Receiving Gifts", "Quality Time", "Physical Touch"};
        LearningStyle = new String[] {"Visual", "Auditory", "Kinesthetic", "Reading and Wrighting"};
        LeadershipStyle = new String[] {"Authoritarian", "Democratic", "Hands off", "Servant Leader", "Transformational", "Transactional"};
        
    }
    // Getter for the Openness To Experience lst that generats a number
    // that is with in the bound of the list. It takes that number and 
    // gets the string at that postion and returns it. 
    public String getOpennessToExperience(){
        int holderOpennessToExperience = random.nextInt(OpennessToExperience.length);
        return OpennessToExperience[holderOpennessToExperience] + "new experience's";

    }
    // Getter for the Conscientiousness list that generats a number
    // that is with in the bound of the list. It takes that number and 
    // gets the string at that postion and returns it. 
    public String getConscientiousness(){
        int holderConscientiousness = random.nextInt(Conscientiousness.length);
        return Conscientiousness[holderConscientiousness];

    }
    // Getter for the Extraversion list that generats a number
    // that is with in the bound of the list. It takes that number and 
    // gets the string at that postion and returns it.
    public String getExtraversion(){
        int holderExtraversion = random.nextInt(Extraversion.length);
        return Extraversion[holderExtraversion];
    }
    // Getter for the Agreeableness list that generats a number
    // that is with in the bound of the list. It takes that number and 
    // gets the string at that postion and returns it.
    public String getAgreeableness(){
        int holderAgreeableness = random.nextInt(Agreeableness.length);
        return Agreeableness[holderAgreeableness];
    }
    // Getter for the Neuroticism list that generats a number
    // that is with in the bound of the list. It takes that number and 
    // gets the string at that postion and returns it.
    public String getNeuroticism(){
        int holderNeuroticism = random.nextInt(Neuroticism.length);
        return Neuroticism[holderNeuroticism];
    }
    //Printer for the Core persontality traits calls the getters for the 5 traits
    //and prints them all out in a format that is easy to read for the user.
    public void CorePersonalityPrinter(){
        System.out.println("---------------------Core Personality--------------------");
        System.out.println("Openness To Experience :" + getOpennessToExperience());
        System.out.println("Conscientiousness      :" + getConscientiousness());
        System.out.println("Extraversion           :" + getExtraversion());
        System.out.println("Agreeableness          :" + getAgreeableness());
        System.out.println("Neuroticism            :" + getNeuroticism());
    }

    public String getSenseOfHumor(){
        int holderSenseOfHumor = random.nextInt(SenseOfHumor.length);
        return SenseOfHumor[holderSenseOfHumor];
    }

    public String getConfidence(){
        int holderConfidence = random.nextInt(Confidence.length);
        return Confidence[holderConfidence];
    }

    public String getAmbition(){
        int holderAmbition = random.nextInt(Ambition.length);
        return Ambition[holderAmbition];
    }

    public String getEmpathy(){
        int holderEmpathy = random.nextInt(Empathy.length);
        return Empathy[holderEmpathy];
    }

    public String getRiskTolerance(){
        int holderRiskTolerance = random.nextInt(RiskTolerance.length);
        return RiskTolerance[holderRiskTolerance];
    }

    public String getTemperament(){
        int holderTemperament = random.nextInt(Temperament.length);
        return Temperament[holderTemperament];
    }

    public String getCuriosity(){
        int holderCuriosity = random.nextInt(Curiosity.length);
        return Curiosity[holderCuriosity];
    }

    public String getLoyalty(){
        int holderLoyalty = random.nextInt(Loyalty.length);
        return Loyalty[holderLoyalty];
    }
    //Printer for the Generic traits it calls all the getters that appily
    //and prints out the data in a format that is easy to read.
    public void FunGenericTrarePrinter(){
        System.out.println("---------------Generic Personality Traits---------------");
        System.out.println("Sense of humor :" + getSenseOfHumor());
        System.out.println("Confidence     :" + getConfidence());
        System.out.println("Ambition       :" + getAmbition());
        System.out.println("Empathy        :" + getEmpathy());
        System.out.println("Risk tolerance :" + getRiskTolerance());
        System.out.println("Temperament    :" + getTemperament());
        System.out.println("Curiosity      :" + getCuriosity());
        System.out.println("Loyalty        :" + getLoyalty());
    }

    public String getTalkativeness(){
        int holderTalkativeness = random.nextInt(Talkativeness.length);
        return Talkativeness[holderTalkativeness];
    }

    public String getPoliteness(){
        int holderPoliteness = random.nextInt(Politeness.length);
        return Politeness[holderPoliteness];
    }

    public String getCharm(){
        int holderCharm = random.nextInt(Charm.length);
        return Charm[holderCharm];
    }

    public String getMoralAlignment(){
        int holderMoralAlignment = random.nextInt(MoralAlignment.length);
        return MoralAlignment[holderMoralAlignment];
    }

    public String getLoveLanguage(){
        int holderLoveLanguage = random.nextInt(LoveLanguage.length);
        return LoveLanguage[holderLoveLanguage];
    }

    public String getLearningStyle(){
        int holderLearningStyle = random.nextInt(LearningStyle.length);
        return LearningStyle[holderLearningStyle];
    }

    public String getLeadershipStyle(){
        int holderLeadershipStyle = random.nextInt(LeadershipStyle.length);
        return LeadershipStyle[holderLeadershipStyle];
    }

    public void SocialMoralLoveLearningTeachingPrinter(){
        System.out.println("--------Allingmant Love Learning Social Teaching----------");
        System.out.println("Talkativeness    :" + getTalkativeness());
        System.out.println("Politeness       :" + getPoliteness());
        System.out.println("Charm            :" + getCharm());
        System.out.println("MoralAlignment   :" + getMoralAlignment());
        System.out.println("Love Language    :" + getLoveLanguage());
        System.out.println("Learning Style   :" + getLearningStyle());
        System.out.println("Leadership Style :" + getLeadershipStyle());
    }


    public String PesonalityPrinterForGUI(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("-----------Core Personality---------").append("\n");
        sb.append("Openness To Experience :").append(getOpennessToExperience()).append("\n");
        sb.append("Conscientiousness :").append(getConscientiousness()).append("\n");
        sb.append("Extraversion :").append(getExtraversion()).append("\n");
        sb.append("Agreeableness :").append(getAgreeableness()).append("\n");
        sb.append("Neuroticism :").append(getNeuroticism()).append("\n");
        sb.append("------Generic Personality Traits---------").append("\n");
        sb.append("Sense of humor :").append(getSenseOfHumor()).append("\n");
        sb.append("Confidence :").append(getConfidence()).append("\n");
        sb.append("Ambition :").append(getAmbition()).append("\n");
        sb.append("Empathy :").append(getEmpathy()).append("\n");
        sb.append("Risk tolerance :").append(getRiskTolerance()).append("\n");
        sb.append("Temperament :").append(getTemperament()).append("\n");
        sb.append("Curiosity :").append(getCuriosity()).append("\n");
        sb.append("Loyalty :").append(getLoyalty()).append("\n");
        sb.append("---Allingmant Love Learning Social Teaching---").append("\n");
        sb.append("Talkativeness :").append(getTalkativeness()).append("\n");
        sb.append("Politeness :").append(getPoliteness()).append("\n");
        sb.append("Charm :").append(getCharm()).append("\n");
        sb.append("MoralAlignment :").append(getMoralAlignment()).append("\n");
        sb.append("Love Language :").append(getLoveLanguage()).append("\n");
        sb.append("Learning Style :").append(getLearningStyle()).append("\n");
        sb.append("Leadership Style :").append(getLeadershipStyle()).append("\n");

        return sb.toString();
    }

    public static void main(String[] args) {
        PersonalityGenerator test = new PersonalityGenerator();
        //test.CorePersonalityPrinter();
        //test.FunGenericTrarePrinter();
        test.SocialMoralLoveLearningTeachingPrinter();
    }
}
