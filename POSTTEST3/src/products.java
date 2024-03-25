public class products {
     private String name, category, version, description;
     private int id, price, quantity;

     public products(int id, String name, String category, String version, String description, int price,
               int quantity) {
          this.id = id;
          this.name = name;
          this.category = category;
          this.version = version;
          this.description = description;
          this.price = price;
          this.quantity = quantity;
     }

     // --------------------------------- getter
     public String getName() {
          return name;
     }

     public String getCategory() {
          return category;
     }

     public String getVersion() {
          return version;
     }

     public String getDescription() {
          return description;
     }

     public int getId() {
          return id;
     }

     public int getPrice() {
          return price;
     }

     public int getQuantity() {
          return quantity;
     }

     // --------------------------------- setter
     public void setName(String name) {
          this.name = name;
     }

     public void setCategory(String category) {
          this.category = category;
     }

     public void setVersion(String version) {
          this.version = version;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public void setId(int id) {
          this.id = id;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     public void setQuantity(int quantity) {
          this.quantity = quantity;
     }

}
