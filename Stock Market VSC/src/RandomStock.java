public class RandomStock {
    double randomUpDown = Math.random();

    public RandomStock() {
        while(true) {
            if (randomUpDown < 0.47) {
                return(stock - 50);
                System.out.println("stock down");
            } else {
                return(stock + 50);
                System.out.println("stock up");
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}

