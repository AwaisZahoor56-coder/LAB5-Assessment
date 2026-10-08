public class Demo{

     public static void main(String[] args){

          Product p1= new Product("Awais",30.0,100);
          Product p2= new Product("Awan",40.0,200);
          Product p3= new Product("Arman",50.0,300);
          Product p4= new Product("Arman",50.0,300,new Date(20,10,2026));

         p1.displayInfo();
         p2.displayInfo();
         p3.displayInfo();
         p4.displayInfo();
}




}