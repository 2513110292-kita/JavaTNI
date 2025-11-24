import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("0,000.00");
        String product_id = "PB-001";
        String product_name = "Pencil Box";
        int item = 112;
        double price_per_item = 30.20;

        System.out.println("Product name: " + product_name+ "("+ product_id + ")");
        System.out.println("Product item: " + item + "("+ price_per_item + " bath/piece)");

        double total_price = item * price_per_item;
        System.out.println("Total Price: " + frm.format(total_price) + " bath");

    }
}
