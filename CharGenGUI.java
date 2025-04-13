import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharGenGUI implements ActionListener {

    private JFrame frame;
    private JLabel lable;
    private JPanel panel;

    public CharGenGUI(){
        frame = new JFrame();

        JButton button = new JButton("Generate Charter");
        button.addActionListener(this);
        lable = new JLabel("Creates a new Charter");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(lable);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Charter Generator GUI");
        frame.pack();
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserInterFace testing = new UserInterFace();
        testing.CharterPrinter();
    }


    public static void main(String[] args) {
        new CharGenGUI();
    }

}
