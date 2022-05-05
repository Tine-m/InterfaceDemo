package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

  private PrintStream output;

  public FileHandler() {
  }

  public ArrayList<Product> loadProducts() throws FileNotFoundException {
    ArrayList<Product> products = new ArrayList<>();
    Scanner fileScanner = new Scanner(new File("products.csv"));
    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      //linje scanner
      Scanner lineScanner = new Scanner(line).useDelimiter(";");
      String productName = lineScanner.next();
      int quantityOnHand = lineScanner.nextInt();
      products.add(new Product(productName, quantityOnHand));
    }
    return products;
  }

  public void saveProducts(ArrayList<Product> products) throws FileNotFoundException {
    output = new PrintStream("products.csv");
    for (Product product : products) {
      writeToFile(product);
    }
  }

  public void writeToFile(Product product) {
    output.print(product.getProductName());
    output.print(";");
    output.print(product.getQuantityAvailable());
    output.print("\n");
  }

}
