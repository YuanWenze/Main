import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePathForMac = "C:\\Users\\苑文泽\\OneDrive\\Documents\\4.2\\Groceries.txt";
        String fileToWrite = "C:\\Users\\苑文泽\\OneDrive\\Documents\\4.2\\GroceriesFormatted.txt";

        //FileReader fileReader = new FileReader(filePath);
        //BufferedReader reader = new BufferedReader(fileReader);

        String [] array = new String[4];
        
        double total = 0.0;
        String id;
        String itemName;
        String quantity; 
        double price;
        String separator = ",";


        FileReader fileReader = new FileReader(filePathForMac);
        FileWriter fileWriter = new FileWriter(fileToWrite);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;

        writer.write("****************************************************" + "\n");
        System.out.println("****************************************************");
        writer.write("ID#" + "\t" + "Item" + "\t\t" + "Quantity" + "\t\t" + "Price(€)" + "\n");
        System.out.println("ID#" + "\t" + "Item" + "\t\t" + "Quantity" + "\t" + "Price(€)");
        while((line = reader.readLine()) != null){
           

            array = line.split(separator); 
            id = array[0];
            itemName = array[1];
            quantity = array[2]; 
            price = Double.parseDouble(array[3]);

            total += price;

            System.out.println(id + "\t" + itemName + "\t\t" + quantity + "\t\t" + price);
        
            writer.write(id + "\t" + itemName + "\t\t" + quantity + "\t\t" + price);
            
            writer.newLine();

           
        }
            writer.write("****************************************************");
            writer.write("\n" + "The grocery shopping total is: €" + Math.round(total) + "\n");
            writer.write("****************************************************");
        
            System.out.println("****************************************************");
            System.out.println("The grocery shopping total is: €" + Math.round(total));
            System.out.println("****************************************************");
        
        
        
        reader.close();

        writer.flush();
        writer.close();

    }

}
