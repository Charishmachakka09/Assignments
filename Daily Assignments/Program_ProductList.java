package dailyassignments;
import java.util.*;
class Product
{
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId, String productName, double price, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
}
public class Program_ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Product>list=new ArrayList<Product>();
       Product p1=new Product(101,"Laptop",55000,5);
       Product p2=new Product(102,"Mouse",800,10);
       Product p3=new Product(103,"Keyboard",1500,0);
       list.add(p1);list.add(p2);list.add(p3);
       System.out.println("All Products List:");
       double totalInventory=0;
       for(Product pr:list)
       {
    	   System.out.println(pr.productId+":"+pr.productName+":"+pr.price+":"+pr.quantity);
    	   totalInventory+=pr.price*pr.quantity;
    	   
        }
       System.out.println("\nProducts whose quantity is less than 5:");
       for(Product pr:list)
       {
    	   if(pr.quantity<5)
    	          System.out.println(pr.productId+":"+pr.productName+":"+pr.price+":"+pr.quantity);
       }
       Product expensive=list.get(0);
       for(Product pr:list)
       {
    	   if(pr.price>expensive.price)
    		   expensive=pr;
       }
       
       System.out.println("\nMost Expensive Product:"+expensive.productId+" "+expensive.productName+" "+expensive.price+" "+expensive.quantity);
       System.out.println("\nTotal Inventory Value:"+totalInventory);
       
       for(Product pr:list)
       {
    	   if(pr.productName=="Mouse")
    		   pr.price=1000;
    	   
       }
       
       for(int i=0;i<list.size();i++)
       {
    	   if(list.get(i).quantity==0)
    		   list.remove(i);
        }
       System.out.println("\nFinal Product List:");
       for(Product pr:list)
       {
    	   System.out.println(pr.productId+":"+pr.productName+":"+pr.price+":"+pr.quantity);
    	  
    	   
        }
	}

}
