import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static boolean datacheck(int len) {
        if (len == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        String name, category, version, description;
        int id, price, quantity, index, len;
        products newproduct;
        ArrayList<products> product = new ArrayList<>();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        while (true) {
            len = product.size();
            System.out.println("""

                    |      MENU      |
                    [1] CREATE PRODUCT
                    [2] READ PRODUCT
                    [3] UPDATE PRODUCT
                    [4] DELETE PRODUCT
                    [0] EXIT """);
            System.out.print(" = ");
            String menu_input = br.readLine();
            System.out.println("");
            switch (menu_input) {
                case "1":
                    System.out.println("enter product data correctly");
                    System.out.print("ID: ");
                    id = Integer.parseInt(br.readLine());
                    System.out.print("Name: ");
                    name = br.readLine();
                    System.out.print("Category: ");
                    category = br.readLine();
                    System.out.print("Version: ");
                    version = br.readLine();
                    System.out.print("Description: ");
                    description = br.readLine();
                    System.out.print("Price (Rp): ");
                    price = Integer.parseInt(br.readLine());
                    System.out.print("Quantity: ");
                    quantity = Integer.parseInt(br.readLine());
                    newproduct = new products(id, name, category, version, description, price, quantity);
                    product.add(newproduct);
                    System.out.println("product created...");
                    break;

                case "2":
                    if (datacheck(len)) {
                        System.out.println("products are still empty");
                        break;
                    }
                    System.out.println("--------------------------------");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println("product number." + (i + 1));
                        product.get(i).read();
                        System.out.println("--------------------------------");
                    }
                    break;

                case "3":
                    if (datacheck(len)) {
                        System.out.println("products are still empty");
                        break;
                    }
                    System.out.println("--------------------------------");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println("product number." + (i + 1));
                        product.get(i).read();
                        System.out.println("--------------------------------");
                    }
                    System.out.print("Select product: ");
                    index = Integer.parseInt(br.readLine()) - 1;
                    if (index <= 0 || index > product.size()) {
                        System.out.println("Invalid index");
                    }

                    for (int i = 0; i < product.size(); i++) {
                        if (index == i) {
                            System.out.println("enter new product data correctly");
                            System.out.print("ID: ");
                            id = Integer.parseInt(br.readLine());
                            System.out.print("Name: ");
                            name = br.readLine();
                            System.out.print("Category: ");
                            category = br.readLine();
                            System.out.print("Version: ");
                            version = br.readLine();
                            System.out.print("Description: ");
                            description = br.readLine();
                            System.out.print("Price (Rp): ");
                            price = Integer.parseInt(br.readLine());
                            System.out.print("Quantity: ");
                            quantity = Integer.parseInt(br.readLine());
                            product.set(i, new products(id, name, category, version, description, price, quantity));
                            System.out.println("product updated...");
                        }
                    }
                    break;

                case "4":
                    if (datacheck(len)) {
                        System.out.println("products are still empty");
                        break;
                    }
                    System.out.println("--------------------------------");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println("product number." + (i + 1));
                        product.get(i).read();
                        System.out.println("--------------------------------");
                    }
                    System.out.print("Select product: ");
                    index = Integer.parseInt(br.readLine());

                    if (index <= product.size() && index > 0) {
                        product.remove(index - 1);
                        System.out.println("product removed...");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "0":
                    System.out.println("Good Bye!!");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
