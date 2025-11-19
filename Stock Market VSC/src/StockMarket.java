import java.awt.*;
import java.util.random.*;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;

public class StockMarket extends JPanel {
    int windowWidth = 800;
    int windowHeight = 500;
    int stock = 500;
    double randomUpDown = Math.random();
    int money = 500 + stock; //need to make it so that it only changes based on the money you have invested
    
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    StockMarket(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        setPreferredSize(new Dimension(this.windowWidth, this.windowHeight));
        setBackground(Color.black);

        textLabel.setFont(new Font("Arial", Font.PLAIN, 250));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setVerticalAlignment(JLabel.BOTTOM);
        textLabel.setText("Money:" + money);
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);

            while(true) {
            if (randomUpDown < 0.47) {
                stock = stock - 50;
            } else {
                stock = stock + 50;
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
