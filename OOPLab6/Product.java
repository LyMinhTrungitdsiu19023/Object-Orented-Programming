package OOPLab6;

public class Product {
	  
    private String productName;
    private int  amount = 0;
    private String Description;

    public Product(String productName, int amount, String Description) {
      
        this.productName = productName;
        this.amount = amount;
        this.Description = Description;
    }

   

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Product() {
    }
    
    
}

