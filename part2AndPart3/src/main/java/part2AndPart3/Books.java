package part2AndPart3;

public class Books {
	
	private String Title;
	private String Author;
	private double price;
	private double rent;
	private int BookQuantity;
	
	public String getTitle() {
		return Title;
	}
	public int getBookQuantity() {
		return BookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		BookQuantity = bookQuantity;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}


		
	public Books(){
		Title=null;
		Author=null;
		price=0.0;
		rent=0.0;
		BookQuantity=0;
		
	}
//	public Books(String Title,String Author,double price,double rent){
//		this.Title=Title;
//		this.Author=Author;
//		this.price=price;
//		this.rent=rent;
//		
//		
//	}
	
	@Override
	public String toString(){
		return "\nTitle: " + Title + "\nAuthor: " + Author +
				"\nPrice: " + price + "\n Rent Amount: " + rent +"\nAvailable Copies:"+BookQuantity+"\n_____________________";
	}
	
	

}
