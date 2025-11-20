public class RandomStock {
    double randomUpDown = Math.random();
    int stock = 500;

    public RandomStock() {
        while(true) {
            if (randomUpDown < 0.47) {
                stock = stock - 50;
                System.out.println("stock down");
            } else {
                stock = stock + 50;
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

