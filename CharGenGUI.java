import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CharGenGUI implements ActionListener {

    private JFrame frame;
    //private JLabel lable;
    private JPanel panel;
    private JTextArea outputArea;
    private JButton buttonCharGen;
    private JButton buttonBacGro;
    private JButton buttonScene;
    private JButton buttonScenePlusChar;
    private JButton buttonScenePlusCharAndBacGro;
    private JButton buttonPersonality;
    private JButton buttonCharterPlusPersonality;
    private JButton buttonChartersInTheSceneWithBackgroundsAndPersonalitys;

    public CharGenGUI(){
        frame = new JFrame();

        buttonCharGen = new JButton("Generate Charter");
        buttonCharGen.addActionListener(this);
        //lable = new JLabel("Creates a new Charter");
        buttonBacGro = new JButton("Generate Background");
        buttonBacGro.addActionListener(this);

        buttonScene = new JButton("Generate Scene");
        buttonScene.addActionListener(this);

        buttonScenePlusChar = new JButton("Generate Scene and Charters");
        buttonScenePlusChar.addActionListener(this);

        buttonScenePlusCharAndBacGro = new JButton("Generate Scene and Charters with BackgroundS");
        buttonScenePlusCharAndBacGro.addActionListener(this);

        buttonPersonality = new JButton("Generate Personality");
        buttonPersonality.addActionListener(this);

        buttonCharterPlusPersonality = new JButton("Generate Scene Charters with Personality");
        buttonCharterPlusPersonality.addActionListener(this);

        buttonChartersInTheSceneWithBackgroundsAndPersonalitys = new JButton("Generate Char Background Personalty and Scene");
        buttonChartersInTheSceneWithBackgroundsAndPersonalitys.addActionListener(this);


        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        //JScrollPane scrollPane = new JScrollPane(outputArea);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5,2,10,10));
        panel.add(buttonCharGen);
        panel.add(buttonBacGro);
        panel.add(buttonScene);
        panel.add(buttonScenePlusChar);
        panel.add(buttonScenePlusCharAndBacGro);
        panel.add(buttonPersonality);
        panel.add(buttonCharterPlusPersonality);
        panel.add(buttonChartersInTheSceneWithBackgroundsAndPersonalitys);
        //panel.add(lable);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Charter Generator GUI");
        frame.pack();
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserInterFace testing = new UserInterFace();
        
        if(e.getSource() == buttonCharGen){
            testing.CharterPrinter();
        }else if(e.getSource() == buttonBacGro){
            testing.BackGroundPrinter();
        }else if(e.getSource() == buttonScene){
            testing.ScenePrinter();
        }else if(e.getSource() == buttonScenePlusChar){
            testing.allChartersInTheScene();
        }else if(e.getSource() == buttonScenePlusCharAndBacGro){
            testing.allChartersInTheSceneAndBackgrounds();
        }else if(e.getSource() == buttonPersonality){
            testing.PersontalityEverthingPrinter();
        }else if(e.getSource() == buttonCharterPlusPersonality){
            testing.allChartersWithPersonalityInTheScene();
        }else if(e.getSource() == buttonChartersInTheSceneWithBackgroundsAndPersonalitys){
            testing.allChartersInTheSceneWithBackgroundsAndPersonalitys();
        }
    }


    public static void main(String[] args) {
        new CharGenGUI();
    }

}
