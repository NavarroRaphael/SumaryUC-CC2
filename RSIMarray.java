//CITCS 1 N-A
//11/5/2024
//Navarro, Sean Ray Raphael N.
public class RSIMarray {
    public static void main(String[]args){

        //Stock level of different products
        int[] stocklevels = {20, 99, 30, 45, 44, 33, 29, 110, 50, 91};

        //Prices for different products
        double[] prices = {120.00, 50.00, 399.00, 125.99, 500.00, 450.32, 120.30, 49.50, 845.55, 20.50};

        double totalValue = 0;

        for (int i = 0; i < stocklevels.length; i++){
            totalValue += stocklevels[i] * prices[i];
        }

        System.out.println("The total value of all items in stock is : PHP" + totalValue);
    }
}
