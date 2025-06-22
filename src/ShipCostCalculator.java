import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        //class ShippingCost
        //main ()
        //    num itemPrice
        //    num shippingCost
        //    num totalPrice
        //    output "Enter the item price: $"
        //    input price
        //    if price >= 100 then
        //      shippingCost = 0
        //    else
        //      shippingCost = price * 0.02
        //    end if
        //    totalPrice = price + shippingCost
        //    output "Shipping cost: $" + shippingCost
        //    output "Total price: $" + totalPrice
        //   return
        //end class

        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double shippingCost = 0;
        String trash = "";

        System.out.print("Enter the item price: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            double totalPrice = itemPrice + shippingCost;
            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}