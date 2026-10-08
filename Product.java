public class Product{

   private static String id ;
   private String name;
   private double price;
   private int quantity;
   private static double maxPrice=0;
   private static double minPrice=0;
   private static int count=0;
   private Date mfd;

   public Product(String name,double price, int quantity,Date mfd){
         this.name=name;
         this.price= price;
         this.quantity= quantity;
         this.id= String.format("P%03d",count);
         this.mfd=mfd;


      if(price>maxPrice){
             maxPrice=price;}

       if(price<minPrice){
            minPrice=price;}

       else if(minPrice==0){
            minPrice=price;}

}

                    
       public Product(String name,double price, int quantity){
             this(name,price,quantity,new Date(1,1,1));
}

     
         

     
  public void displayInfo(){


       System.out.println("ID:"+id + count++);
       System.out.println("Name:"+name);
       System.out.println("Price:"+price);
       System.out.println("Quantity:"+quantity);
       System.out.println("Maximum Price:"+maxPrice);
       System.out.println("Minimum Price:"+minPrice);
       System.out.printf ("Manufacturing Date : %s \n"," " +mfd.displayDate());




}
 





}