import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;

public class StockMarket {
    int stockLevel = 500; //max 1000 min 0 
    RandomStockChange randomStockChange = new RandomStock

    while(true) {
        if(RandomStockChange = true) {
            stockLevel + 50;
            System.out.println(stockLevel); // for testing purposes
        } else {
            stockLevel - 50;
            System.out.println(stockLevel)
        }
    }
}

/* I am shutting down this class because I think the code is in the wrong places so i will rewrite it neater. i am keeping it just in case
public class StockMarket extends JPanel {
    int windowWidth = 800;  //should this code be in the app file? i feel like StockMarket should not inlcude the window.
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
*/



