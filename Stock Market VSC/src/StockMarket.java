import java.awt.*;
import java.util.random.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class StockMarket extends JPanel {
    int windowWidth = 800;
    int windowHeight = 500;
    int stock = 500;
    int stockChange = stock + randomStock.stock;
    int money = 500 + stockChange; //need to make it so that it only changes based on the money you have invested
    
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    RandomStock randomStock = new RandomStock();

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

    }
}



