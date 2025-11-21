import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int windowWidth = 800;
        int windowHeight = 500;

        JLabel textLabel = new JLabel();
        JPanel textPanel = new JPanel();
        JPanel button = new JButton("Buy Shares")
        

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

        if(money => 100) {
            //end game
            System.out.println("You Win!!");
        } else if(money =< 0) {
            //end game
            System.out.println("You Lose")
        }

        
    }
}




