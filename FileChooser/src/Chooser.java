import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Chooser extends JFrame implements ActionListener {

    JButton button;

    Chooser() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        button = new JButton("Open File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {

            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            int file = chooser.showOpenDialog(null);



            if(file == JFileChooser.APPROVE_OPTION) {

                File file1 = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file1);
                System.out.println();

            }


        }
    }
}
