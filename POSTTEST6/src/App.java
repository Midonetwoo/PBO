import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App implements features {
     static ArrayList<products> product = new ArrayList<>();
     static ArrayList<tabletops> tabletop = new ArrayList<>();
     static ArrayList<digitalgames> digitalgame = new ArrayList<>();
     static ArrayList<startetsets> startetset = new ArrayList<>();
     static ArrayList<boardgames> boardgame = new ArrayList<>();

     static InputStreamReader r = new InputStreamReader(System.in);
     static BufferedReader br = new BufferedReader(r);

     // Variable Static
     static int id, price, quantity;
     static String name, category, version, description, releasedate, format, size, platfrom;
     // Variable Final
     static final int max_products = 100;

     // main
     public static void main(String[] args) throws IOException {
          int index;
          String menu_input, menu_input1, menu_input2;

          while (true) {
               int product_quantity = tabletop.size() + digitalgame.size() + startetset.size() + boardgame.size();
               System.out.println("""

                         |      MENU      |
                         [1] CREATE PRODUCT
                         [2] READ PRODUCT
                         [3] UPDATE PRODUCT
                         [4] DELETE PRODUCT
                         [0] EXIT """);
               System.out.print(" = ");
               menu_input = br.readLine();
               System.out.println("");
               switch (menu_input) {

                    // ----- create product
                    case "1":
                         if (product_quantity >= max_products) {
                              System.out.println("Can't Create new Product, Product quantity exceeds the limit");
                              break;
                         }
                         System.out.println("""

                                   |     CREATE     |
                                   [1] TABLETOP
                                   [2] DIGITAL GAME
                                   [3] STARTER SET
                                   [4] BOARD GAME
                                   [0] BACK """);
                         System.out.print(" = ");
                         menu_input1 = br.readLine();
                         System.out.println("");
                         switch (menu_input1) {
                              case "1":
                                   if (create()) {
                                        System.out.print("Release Date: ");
                                        releasedate = br.readLine();
                                        System.out.print("Format: ");
                                        format = br.readLine();
                                        tabletops newproduct = new tabletops(id, name, category, version, description,
                                                  price, quantity, releasedate, format);
                                        tabletop.add(newproduct);
                                        System.out.println("product created...");
                                   }
                                   break;

                              case "2":
                                   if (create()) {
                                        System.out.print("Release Date: ");
                                        releasedate = br.readLine();
                                        System.out.print("Size: ");
                                        size = br.readLine();
                                        System.out.print("Platfrom: ");
                                        platfrom = br.readLine();
                                        digitalgames newproduct = new digitalgames(id, name, category, version,
                                                  description, price, quantity, releasedate, size, platfrom);
                                        digitalgame.add(newproduct);
                                        System.out.println("product created...");
                                   }
                                   break;

                              case "3":
                                   if (create()) {
                                        System.out.print("Format: ");
                                        format = br.readLine();
                                        startetsets newproduct = new startetsets(id, name, category, version,
                                                  description, price, quantity, format);
                                        startetset.add(newproduct);
                                        System.out.println("product created...");
                                   }
                                   break;

                              case "4":
                                   if (create()) {
                                        System.out.print("Release Date: ");
                                        releasedate = br.readLine();
                                        System.out.print("Format: ");
                                        format = br.readLine();
                                        boardgames newproduct = new boardgames(id, name, category, version,
                                                  description, price, quantity, releasedate, format);
                                        boardgame.add(newproduct);
                                        System.out.println("product created...");
                                   }
                                   break;

                              case "0":
                                   break;

                              default:
                                   System.out.println("Invalid menu input");
                         }
                         break;

                    // ----- read product
                    case "2":
                         System.out.println("""

                                   |     READ     |
                                   [1] TABLETOP
                                   [2] DIGITAL GAME
                                   [3] STARTER SET
                                   [4] BOARD GAME
                                   [5] ALL PRODUCT
                                   [6] SEARCH
                                   [0] BACK """);
                         System.out.print(" = ");
                         menu_input1 = br.readLine();
                         System.out.println("");
                         switch (menu_input1) {
                              case "1":
                                   if (datacheck(tabletop.size())) {
                                        break;
                                   }
                                   readtabletops();
                                   break;

                              case "2":
                                   if (datacheck(digitalgame.size())) {
                                        break;
                                   }
                                   readdigitalgames();
                                   break;

                              case "3":
                                   if (datacheck(startetset.size())) {
                                        break;
                                   }
                                   readstartersets();
                                   break;

                              case "4":
                                   if (datacheck(boardgame.size())) {
                                        break;
                                   }
                                   readboardgames();
                                   break;

                              case "5":
                                   System.out.println("TABLETOPS:");
                                   readtabletops();
                                   System.out.println("DIGITAL GAMES:");
                                   readdigitalgames();
                                   System.out.println("STARTER SETS:");
                                   readstartersets();
                                   System.out.println("BOARD GAMES:");
                                   readboardgames();
                              case "6":
                                   System.out.print("[1] By Name ");
                                   System.out.print("[2] By ID ");
                                   System.out.print(" = ");
                                   menu_input2 = br.readLine();
                                   if (menu_input2 == "1") {
                                        /////
                                   } else if (menu_input2 == "2") {

                                   } else {

                                   }

                              case "0":
                                   break;

                              default:
                                   System.out.println("Invalid menu input");
                         }
                         break;

                    // ----- update product
                    case "3":
                         System.out.println("""

                                   |     UPDATE     |
                                   [1] TABLETOP
                                   [2] DIGITAL GAME
                                   [3] STARTER SET
                                   [4] BOARD GAME
                                   [0] BACK """);
                         System.out.print(" = ");
                         menu_input1 = br.readLine();
                         System.out.println("");
                         switch (menu_input1) {
                              case "1":
                                   if (datacheck(tabletop.size())) {
                                        break;
                                   }
                                   readtabletops();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= tabletop.size() && index > 0) {
                                        if (create()) {
                                             System.out.print("Release Date: ");
                                             releasedate = br.readLine();
                                             System.out.print("Format: ");
                                             format = br.readLine();
                                             tabletops updateproduct = new tabletops(id, name, category, version,
                                                       description,
                                                       price, quantity, releasedate, format);
                                             tabletop.set(index - 1, updateproduct);
                                             System.out.println("product updated...");
                                        }
                                   } else {
                                        System.out.println("Invalid index");
                                   }

                                   break;

                              case "2":
                                   if (datacheck(digitalgame.size())) {
                                        break;
                                   }
                                   readdigitalgames();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= digitalgame.size() && index > 0) {
                                        if (create()) {
                                             System.out.print("Release Date: ");
                                             releasedate = br.readLine();
                                             System.out.print("Size: ");
                                             size = br.readLine();
                                             System.out.print("Platfrom: ");
                                             platfrom = br.readLine();
                                             digitalgames updateproduct = new digitalgames(id, name, category, version,
                                                       description, price, quantity, releasedate, size, platfrom);
                                             digitalgame.set(index - 1, updateproduct);
                                             System.out.println("product updated...");
                                        }
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "3":
                                   if (datacheck(startetset.size())) {
                                        break;
                                   }
                                   readstartersets();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= startetset.size() && index > 0) {
                                        if (create()) {
                                             System.out.print("Format: ");
                                             format = br.readLine();
                                             startetsets updateproduct = new startetsets(id, name, category, version,
                                                       description, price, quantity, format);
                                             startetset.set(index - 1, updateproduct);
                                             System.out.println("product updated...");
                                        }
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "4":
                                   if (datacheck(boardgame.size())) {
                                        break;
                                   }
                                   readboardgames();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= boardgame.size() && index > 0) {
                                        if (create()) {
                                             System.out.print("Release Date: ");
                                             releasedate = br.readLine();
                                             System.out.print("Format: ");
                                             format = br.readLine();
                                             boardgames updateproduct = new boardgames(id, name, category, version,
                                                       description, price, quantity, releasedate, format);
                                             boardgame.set(index - 1, updateproduct);
                                             System.out.println("product updated...");
                                        }
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "0":
                                   break;
                              default:
                                   System.out.println("Invalid menu input");
                                   ;
                         }
                         break;

                    // ----- delete product
                    case "4":
                         System.out.println("""

                                   |     DELETE     |
                                   [1] TABLETOP
                                   [2] DIGITAL GAME
                                   [3] STARTER SET
                                   [4] BOARD GAME
                                   [0] BACK """);
                         System.out.print(" = ");
                         menu_input1 = br.readLine();
                         System.out.println("");
                         switch (menu_input1) {
                              case "1":
                                   if (datacheck(tabletop.size())) {
                                        break;
                                   }
                                   readtabletops();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= tabletop.size() && index > 0) {
                                        tabletop.remove(index - 1);
                                        System.out.println("product removed...");
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "2":
                                   if (datacheck(digitalgame.size())) {
                                        break;
                                   }
                                   readdigitalgames();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= digitalgame.size() && index > 0) {
                                        digitalgame.remove(index - 1);
                                        System.out.println("product removed...");
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "3":
                                   if (datacheck(startetset.size())) {
                                        break;
                                   }
                                   readstartersets();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= startetset.size() && index > 0) {
                                        startetset.remove(index - 1);
                                        System.out.println("product removed...");
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "4":
                                   if (datacheck(boardgame.size())) {
                                        break;
                                   }
                                   readboardgames();
                                   System.out.print("Select Product: ");
                                   index = Integer.parseInt(br.readLine());
                                   if (index <= boardgame.size() && index > 0) {
                                        boardgame.remove(index - 1);
                                        System.out.println("product removed...");
                                   } else {
                                        System.out.println("Invalid index");
                                   }
                                   break;

                              case "0":
                                   break;

                              default:
                                   System.out.println("Invalid menu input");
                                   break;
                         }
                         break;

                    case "0":
                         System.out.println("Good Bye!!");
                         return;

                    default:
                         System.out.println("Invalid menu input");
                         break;
               }
          }
     }

     // override
     static boolean inputcheck(int num) {
          if (num <= 0) {
               System.out.println("number must be positive");
               return true;
          } else {
               return false;
          }
     }

     static boolean inputcheck(String input) {
          if (input == "") {
               System.out.println("input can't be empty");
               return true;
          } else {
               return false;
          }
     }

     // methods
     static boolean datacheck(int len) {
          if (len == 0) {
               System.out.println("product are still empty");
               return true;
          } else {
               return false;
          }
     }

     static boolean idcheck(int id) {
          for (tabletops pro : tabletop) {
               if (id == pro.getId()) {
                    System.out.println("id already exists");
                    return true;
               }
          }
          for (digitalgames pro : digitalgame) {
               if (id == pro.getId()) {
                    System.out.println("id already exists");
                    return true;
               }
          }
          for (startetsets pro : startetset) {
               if (id == pro.getId()) {
                    System.out.println("id already exists");
                    return true;
               }
          }
          for (boardgames pro : boardgame) {
               if (id == pro.getId()) {
                    System.out.println("id already exists");
                    return true;
               }
          }
          return false;
     }

     static boolean create() throws IOException {
          System.out.println("enter new product data correctly");
          System.out.print("ID: ");
          id = Integer.parseInt(br.readLine());
          if (inputcheck(id) || idcheck(id)) {
               return false;
          }
          System.out.print("Name: ");
          name = br.readLine();
          if (inputcheck(name)) {
               return false;
          }
          System.out.print("Category: ");
          category = br.readLine();
          System.out.print("Version: ");
          version = br.readLine();
          System.out.print("Description: ");
          description = br.readLine();
          System.out.print("Price (Rp): ");
          price = Integer.parseInt(br.readLine());
          if (inputcheck(price)) {
               return false;
          }
          System.out.print("Quantity: ");
          quantity = Integer.parseInt(br.readLine());
          if (inputcheck(quantity)) {
               return false;
          }
          return true;
     }

     // method final
     static final void readtabletops() {
          System.out.println("--------------------------------");
          for (int i = 0; i < tabletop.size(); i++) {
               System.out.println("product number." + (i + 1));
               tabletop.get(i).display();
          }
     }

     static final void readdigitalgames() {
          System.out.println("--------------------------------");
          for (int i = 0; i < digitalgame.size(); i++) {
               System.out.println("product number." + (i + 1));
               digitalgame.get(i).display();
          }
     }

     static final void readstartersets() {
          System.out.println("--------------------------------");
          for (int i = 0; i < startetset.size(); i++) {
               System.out.println("product number." + (i + 1));
               startetset.get(i).display();
          }
     }

     static final void readboardgames() {
          System.out.println("--------------------------------");
          for (int i = 0; i < boardgame.size(); i++) {
               System.out.println("product number." + (i + 1));
               boardgame.get(i).display();
          }
     }

     // implements
     @Override
     public boolean checkproduct_quantity(int product_quantity) {
          if (product_quantity >= max_products) {
               System.out.println("Can't Create new Product, Product quantity exceeds the limit");
               return false;
          }
          return true;
     }

     @Override
     public String fillcategory() {
          System.out.println("category");
          System.out.println("[1] Tabletops");
          System.out.println("[2] Starterset");
          System.out.println("[3] Boardgames");
          System.out.println("[4] Digitalgames");
          System.out.println(" = ");
          int category_input;

          // Error Except Handling (try catch)
          try {
               category_input = Integer.parseInt(br.readLine());
          } catch (NumberFormatException | IOException e) {
               category_input = 5;
               e.printStackTrace();
          }
          if (category_input == 1){
               return "Tabletops";
          } else if(category_input == 2) {
               return "Starterset";
          } else if(category_input == 3) {
               return "Boardgames";
          } else if(category_input == 4) {
               return "DigitalGames";
          } else {
               return "";
          }
     }
     
}
