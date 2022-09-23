import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cryptView {
    private JPanel root;
    private JCheckBox infile;
    private JCheckBox keyfile;
    private JButton runButton;
    private JCheckBox decrypt;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField1;
    private JCheckBox outfile;

    public cryptView() {
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        decrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //flippa bool
            }
        });
        infile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //flippa bool
            }
        });
        outfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //flippa bool
            }
        });
        keyfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //flippa bool
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("cryptView");
        frame.setContentPane(new cryptView().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
