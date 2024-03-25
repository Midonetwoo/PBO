public class tabletops extends products {
     private String releasedate, format;

     // contructor
     public tabletops(int id, String name, String category, String version, String description, int price, int quantity,
               String releasedate, String format) {
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
}
