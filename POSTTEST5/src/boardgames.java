//class final
public final class boardgames extends products {
     private String releasedate, format;

     // constructor
     public boardgames(int id, String name, String category, String version, String description, int price,
               int quantity, String releasedate, String format) {
          super(id, name, category, version, description, price, quantity);
          this.releasedate = releasedate;
          this.format = format;
     }

     // getter
     public String getReleasedate() {
          return releasedate;
     }

     public String getFormat() {
          return format;
     }

     // setter
     public void setReleasedate(String releasedate) {
          this.releasedate = releasedate;
     }

     public void setFormat(String format) {
          this.format = format;
     }

     @Override
     public void display() {
          System.out.println(
                    getName() + " " + getId() + "." + getVersion() + ", " + getCategory());
          System.out.println(getPrice() + " (" + getQuantity() + ")");
          System.out.println("Description: " + getDescription() + "(" + getReleasedate() + ")");
          System.out.println("Format: " + getFormat());
          System.out.println("--------------------------------");
     }
}
