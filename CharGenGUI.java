import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

        buttonScenePlusCharAndBacGro = new JButton("Generate Scene and Charters with Backgrounds");
        buttonScenePlusCharAndBacGro.addActionListener(this);

        buttonPersonality = new JButton("Generate Personality");
        buttonPersonality.addActionListener(this);

        buttonCharterPlusPersonality = new JButton("Generate Charters with Personality");
        buttonCharterPlusPersonality.addActionListener(this);

        buttonChartersInTheSceneWithBackgroundsAndPersonalitys = new JButton("Generate Char Background Personalty and Scene");
        buttonChartersInTheSceneWithBackgroundsAndPersonalitys.addActionListener(this);


        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5,2,10,10));
        panel.add(buttonCharGen);
        panel.add(buttonBacGro);
        panel.add(buttonScene);
        panel.add(buttonPersonality);
        panel.add(buttonCharterPlusPersonality);
        panel.add(buttonScenePlusChar);
        panel.add(buttonScenePlusCharAndBacGro);
        panel.add(buttonChartersInTheSceneWithBackgroundsAndPersonalitys);
        //panel.add(lable);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Charter Generator GUI");
        frame.pack();
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //UserInterFace testing = new UserInterFace();
        CharterGenerator charGen = new CharterGenerator();
        CharterGenerator charGen1 = new CharterGenerator();
        CharterGenerator charGen2 = new CharterGenerator();
        BackGroundGenerator bacGorndGen = new BackGroundGenerator();
        BackGroundGenerator bacGorndGen1 = new BackGroundGenerator();
        BackGroundGenerator bacGorndGen2 = new BackGroundGenerator();
        SceneGenerator snenGen = new SceneGenerator();
        PersonalityGenerator perGen = new PersonalityGenerator();
        PersonalityGenerator perGen1 = new PersonalityGenerator();
        PersonalityGenerator perGen2 = new PersonalityGenerator();
        
        if(e.getSource() == buttonCharGen){
            String result = charGen.CharterPrinterForGUI();
            outputArea.setText(result);

        }else if(e.getSource() == buttonBacGro){
            String result = bacGorndGen.BackGroundPrinterForGUI();
            outputArea.setText(result);

        }else if(e.getSource() == buttonScene){
            String result = snenGen.ScenePrintForGUI();
            outputArea.setText(result);

        }else if(e.getSource() == buttonScenePlusChar){
            if(snenGen.amountOfCharters() == 1){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI();
                outputArea.setText(result);
            }else if(snenGen.amountOfCharters() == 2){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + charGen1.CharterPrinterForGUI();
                outputArea.setText(result);
            }else{
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + charGen1.CharterPrinterForGUI()
                                + charGen2.CharterPrinterForGUI();
                outputArea.setText(result);
            }

        }else if(e.getSource() == buttonScenePlusCharAndBacGro){
            if(snenGen.amountOfCharters() == 1){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }else if(snenGen.amountOfCharters() == 2){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI()
                                + charGen1.CharterPrinterForGUI()
                                + bacGorndGen1.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }else{
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI()
                                + charGen1.CharterPrinterForGUI()
                                + bacGorndGen1.BackGroundPrinterForGUI()
                                + charGen2.CharterPrinterForGUI()
                                + bacGorndGen2.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }

        }else if(e.getSource() == buttonPersonality){
            String result = perGen.PesonalityPrinterForGUI();
            outputArea.setText(result);

        }else if(e.getSource() == buttonCharterPlusPersonality){
            String result = charGen.CharterPrinterForGUI() + perGen.PesonalityPrinterForGUI();
            outputArea.setText(result);

        }else if(e.getSource() == buttonChartersInTheSceneWithBackgroundsAndPersonalitys){
            if(snenGen.amountOfCharters() == 1){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + perGen.PesonalityPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }else if(snenGen.amountOfCharters() == 2){
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + perGen.PesonalityPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI()
                                + charGen1.CharterPrinterForGUI()
                                + perGen1.PesonalityPrinterForGUI()
                                + bacGorndGen1.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }else{
                String result = snenGen.ScenePrintForGUI() 
                                + charGen.CharterPrinterForGUI()
                                + perGen.PesonalityPrinterForGUI()
                                + bacGorndGen.BackGroundPrinterForGUI()
                                + charGen1.CharterPrinterForGUI()
                                + perGen1.PesonalityPrinterForGUI()
                                + bacGorndGen1.BackGroundPrinterForGUI()
                                + charGen2.CharterPrinterForGUI()
                                + perGen2.PesonalityPrinterForGUI()
                                + bacGorndGen2.BackGroundPrinterForGUI();
                outputArea.setText(result);
            }

        }
    }


    public static void main(String[] args) {
        new CharGenGUI();
    }

}
