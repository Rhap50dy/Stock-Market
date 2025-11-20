import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int windowWidth = 800;
        int windowHeight = 500;
        int money = 500;
        int investedWinLoss + /*something like the stock change converted to a percentage times the invested stock*/;
        int stockMoney = money + /*investedWinLoss*/;

        JLabel textLabel = new JLabel();
        JPanel textPanel = new JPanel();

        JFrame frame = new JFrame("Stock Market");
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setColor(black);

        StockMarket stockMarket = new StockMarket(windowWidth, windowHeight);
        frame.add(stockMarket);
        frame.pack();
        textLabel.setFont(new Font("Arial", Font.PLAIN, 250));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setVerticalAlignment(JLabel.BOTTOM);
        textLabel.setOpaque(true);
        textLabel.setText("Money:" + money);
    }
}


