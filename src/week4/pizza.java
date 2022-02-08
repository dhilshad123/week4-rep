public class Pizza {
 
    private String Size;
    private double Price;
    private static int numberofobjects =0;
  public Pizza()
  {
  }
  public Pizza(String Size)
  {
   this.Size=Size;
   numberofobjects++;
  }
   static public int getNumberofObjects()
 {
return numberofobjects;
 }
    public void setSize(String s) {
    this.Size = Size;
  }
    public void setPrice(double Price) {
    this.Price = Price;
  }
    public String getSize() {
    return Size;
  }
  public double getPrice() {
    return Price;
  }
  double totalCost;
    public double determinePizzaPrice()
  {
    if (getSize().equals("small")){
      Price = 10;
    }
    else if (getSize().equals("medium")){
      Price = 12;
    }
    else if (getSize().equals("large")){
      Price = 15;
    }
    else {
      System.out.println("Error");
    }
    return Price;
  }
 
 
  public double totalCost(int numberofobjects){
	if(numberofobjects<=3){
		double totalCOst = price - price * (15/100);
	}
else{
	double totalCOst=price;
}
return totalCOst;

    return totalCost = Price;
  }
}
