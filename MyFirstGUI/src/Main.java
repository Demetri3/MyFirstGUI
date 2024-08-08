import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Dion Demetrius signed

class GUI implements ActionListener {

    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    public GUI() {

        frame = new JFrame();

        button = new JButton("Click Me");
        button.addActionListener(this);

        label = new JLabel("Number of Clicks: 0       ");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 10, 50));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args){
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    }



}