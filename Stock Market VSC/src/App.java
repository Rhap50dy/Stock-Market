import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int windowWidth = 800;
        int windowHeight = 500;

        
        
        JFrame frame = new JFrame("Stock Market");
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setBackground(Color.BLACK);

        JLabel textLabel = new JLabel();
        JButton button = new JButton("Buy Shares");
        
        StockMarket stockMarket = new StockMarket();

        textLabel.setFont(new Font("Arial", Font.PLAIN, 150));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setVerticalAlignment(JLabel.BOTTOM);
        textLabel.setOpaque(true);
        textLabel.setText("Money:" + stockMarket.money);

        frame.add(button);
        frame.add(textLabel);
        frame.pack();


        Timer timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stockMarket.update();
                textLabel.setText("Money:" + stockMarket.money);
            }
        });
        timer.start();
    }
}




