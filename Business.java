public class Business {
   private String name;
   private String address;
   
   void setName(String busName) { 
      name = busName; 
   }
   
   void setAddress(String busAddress) {
      address = busAddress; 
   }
   
   String getDescription() {
      return name + " -- " + address;
   }
}
