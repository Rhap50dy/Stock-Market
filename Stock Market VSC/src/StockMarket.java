import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;

public class StockMarket {
    int stockPercent = 50; //used like a percent, this needs to be able to update
    int stockPercentChange = stockPercent - 50; //this needs to be able to uptade
    int moneyIn = 5;
    int moneyOutUncalculated = 0;
    int moneyOutCalculated = moneyOutUncalculated * 
    int money = moneyIn + moneyOutCalculated;

    BoolStockChange boolStockChange = new RandomStock

    while(true) {
        if(boolStockChange = true) {
            stockPercent + 2;
            System.out.println("stock level up"); // for testing purposes
        } else {
            stockPercent - 2;
            System.out.println("stock level down")
        }
            try(system.sleep(400))
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





