public enum Car {
   MERCEDES(1, "Germany", "Ger"),
   FIAT(2, "Italy", "It"),
   DODGE(3, "USA", "US"),
   CHRYSLER(4, "USA", "US"),
   HONDA(5, "Japan", "JPN"),
   TOYOTA(6, "Japan", "JPN"),
   ROVER(7, "Englang", "ENG"),
   OPEL(8, "Germany", "GER"),
   SUBARU(9, "Japan", "JPN"),
   Renault(10, "France", "FRA");

   int id;
    String country;
    String code;

 Car(int id,String country,String code){
      this.id = id;
      this.country = country;
      this.code=code;




   }

   public int getId() {
      return id;
   }

   public String getCountry() {
      return country;
   }
   public String getCode(){
    return code;

      public static Car findById(int id) {
         for (Car a : values()) {
            if (a.getId() == id) {
               return a;


         }
      }
      throw new IllegalArgumentException();
   }
}
   public static Car findByCountry(String country) {

      for(Car a : values()) {

         if(a.getCountry() == country) {

            return a;

         }

      }

      throw new IllegalArgumentException();

   }

   public static Car findByCode(String code) {

      for(Car a : values()) {

         if(a.getCode() == code) {

           return a;

         }

      }

      throw new IllegalArgumentException();



   }

}


