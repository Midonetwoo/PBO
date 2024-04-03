public class startetsets extends products {
     private String format;

     // constructor
     public startetsets(int id, String name, String category, String version, String description, int price,
               int quantity, String format) {
          super(id, name, category, version, description, price, quantity);
          this.format = format;
     }

     // getter
     public String getFormat() {
          return format;
     }

     // setter
     public void setFormat(String format) {
          this.format = format;
     }

     @Override
     public void display() {
          System.out.println(
                    getName() + " " + getId() + "." + getVersion() + ", " + getCategory());
          System.out.println(getPrice() + " (" + getQuantity() + ")");
          System.out.println("Description: " + getDescription());
          System.out.println("Format: " + getFormat());
          System.out.println("--------------------------------");
     }
}
