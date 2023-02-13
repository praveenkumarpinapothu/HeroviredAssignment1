package Inheritance.HeroviredAssignment;
import java.io.BufferedReader;
import java.io.FileReader;

public class fifthQuestion {
    public static void main(String[] args) {
        double minAmount = Double.MAX_VALUE;
        double maxAmount = Double.MIN_VALUE;
        int count = 0;
        String line ="";
        double Total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sampleDemo.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(" ");
                double totalAmount = Double.parseDouble(transaction[3]);
                Total += totalAmount;
                if (totalAmount > maxAmount) {
                    maxAmount = totalAmount;
                }
                if (totalAmount < minAmount) {
                    minAmount = totalAmount;
                }
                count++;
            }
            System.out.println("Total number of Transactions - " + count);
            System.out.println("Total amount - " + Total);
            System.out.println("Minimum Bill amount - " + minAmount);
            System.out.println("Maximum Bill amount - " + maxAmount);
        } 
        catch (Exception e) 
        {
            System.out.println("Run time error");
        }
    }
}
