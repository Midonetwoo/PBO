//class final
public final class digitalgames extends products {
     private String releasedate, size, platfrom;

     // contructor
     public digitalgames(int id, String name, String category, String version, String description, int price,
               int quantity, String releasedate, String size, String platfrom) {
          super(id, name, category, version, description, price, quantity);
          this.releasedate = releasedate;
          this.size = size;
          this.platfrom = platfrom;
     }

     // setter
     public void setReleasedate(String releasedate) {
          this.releasedate = releasedate;
     }

     public void setSize(String size) {
          this.size = size;
     }

     public void setPlatfrom(String platfrom) {
          this.platfrom = platfrom;
     }

     // getter
     public String getReleasedate() {
          return releasedate;
     }

     public String getSize() {
          return size;
     }

     public String getPlatfrom() {
          return platfrom;
     }

     @Override
     public void display() {
          System.out.println(
                    getName() + " " + getId() + "." + getVersion() + ", " + getCategory());
          System.out.println(getPrice() + " (" + getQuantity() + ")");
          System.out.println("Description: " + getDescription() + "(" + getReleasedate() + ")");
          System.out.println("Size: " + getSize());
          System.out.println("Platfrom: " + getPlatfrom());
          System.out.println("--------------------------------");
     }
}
