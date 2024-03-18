import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static products newproduct;
    static ArrayList<products> product = new ArrayList<>();
    static InputStreamReader r = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(r);

    static boolean datacheck(int len) {
        if (len == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean intcheck(int num) {
        if (num <= 0) {
            System.out.println("number must be positive");
            return true;
        } else {
            return false;
        }
    }

    static boolean idcheck(int id) {
        for (products pro : product) {
            if (id == pro.getId()) {
                System.out.println("id already exists");
                return true;
            }
        }
        return false;
    }

    public static void read() throws IOException {
        for (products pro : product) {
            System.out.println(pro.getName() + " " + pro.getId() + "." + pro.getVersion() + ", " + pro.getCategory());
            System.out.println(pro.getPrice() + " (" + pro.getQuantity() + ")");
            System.out.println("desc: " + pro.getDescription());
        }
    }

    public static void main(String[] args) throws IOException {
        String name, category, version, description;
        int id, price, quantity, index, len;

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
                    System.out.println("enter new product data correctly");
                    System.out.print("ID: ");
                    id = Integer.parseInt(br.readLine());
                    if (intcheck(id) || idcheck(id)) {
                        break;
                    }
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
                    if (intcheck(price)) {
                        break;
                    }
                    System.out.print("Quantity: ");
                    quantity = Integer.parseInt(br.readLine());
                    if (intcheck(quantity)) {
                        break;
                    }
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
                        read();
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
                        read();
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
                            if (intcheck(id) || idcheck(id)) {
                                break;
                            }
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
                            if (intcheck(price)) {
                                break;
                            }
                            System.out.print("Quantity: ");
                            quantity = Integer.parseInt(br.readLine());
                            if (intcheck(quantity)) {
                                break;
                            }
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
                        read();
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
