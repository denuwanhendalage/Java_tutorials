import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private int count = 0; // Counter value
    private JLabel label;

    public CounterApp() {
        // Create a frame
        JFrame frame = new JFrame("Counter App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create buttons
        JButton plusButton = new JButton("Increase");
        JButton minusButton = new JButton("Decrease");

        // Create label to show the count
        label = new JLabel("Count: " + count);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Add action listeners
        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });

        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText("Count: " + count);
            }
        });

        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(plusButton);
        panel.add(minusButton);

        // Add components to the frame
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        // Set frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the app
        new CounterApp();
    }
}
