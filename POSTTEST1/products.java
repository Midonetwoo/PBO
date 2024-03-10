public class products {
     String name, category, version, description;
     int id, price, quantity;

     public products(int id, String name, String category, String version, String description, int price, int quantity) {
          this.id = id;
          this.name = name;
          this.category = category;
          this.version = version;
          this.description = description;
          this.price = price;
          this.quantity = quantity;
     }

     void read() {
          System.out.println(name + " " + id + "." + version + ", " + category);
          System.out.println(price + " (" + quantity + ")");
          System.out.println("desc: " + description);
     }
}
