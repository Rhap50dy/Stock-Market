import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int windowWidth = 800;
        int windowHeight = 500;

        JFrame frame = new JFrame("Stock Market");
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(0, 0);
        frame.setResizable(false);

        StockMarket stockMarket = new StockMarket(windowWidth, windowHeight);
        frame.add(stockMarket);
        frame.pack();    
    }
}
