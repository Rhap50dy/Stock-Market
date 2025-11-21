import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

public class StockMarket {
    int stockPercent = 50; //used like a percent, this needs to be able to update
    int moneyIn = 5;
    int money = 1000;
    
    Random randomUpDown = new Random();
    Random randomNum = new Random(10) + 1;
    
    public void update() {
        if(randomUpDown.nextDouble() > 0.4) {
            stockPercent += (randomNum); //this will add either 1-10 stock percent. is there a way to change the individuial chances for each number? mabye using an array.
            System.out.println("stock level up"); // for testing purposes
        } else {
            stockPercent -= (randomNum);
            System.out.println("stock level down");
        }

        int stockPercentChange = stockPercent - 50; //this needs to be able to updade
        int stockPrice = 10;
        int moneyOutCalculated = stockPrice * stockPercentChange;
        money = moneyIn + moneyOutCalculated;
        
        if(money >= 100) {
            //end game
            System.out.println("You Win!!");
        } else if(money <= 0) {
            //end game
            System.out.println("You Lose");
        }
    }
}







