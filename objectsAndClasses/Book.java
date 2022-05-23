package objectsAndClasses;

public class Book {

	private String bname;
	private Author author;
	private double price;
	private int qtyInStock=0;
	
	Book(String name,Author author,int price){
		this.bname=name;
		this.author=author;
		this.price=price;
	}
	
	Book(String name,Author author,double price,int qtyInStock){
		this.bname=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	public String getName() {
		return bname;
	}

	
	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
	@Override
	public String toString() {
		return "Book [Book name=" + bname + " by " + author + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1=new Author("Kiran","Kiran@gmail.com",'M');
		Author a2=new Author("Varun","Varunn@gmail.com",'M');
		
		Book b1=new Book("Java",a1,300,3);
		Book b2=new Book("C++",a2,250,5);
		
		System.out.println("Book :"+a1.toString());
		
		System.out.println("Author :"+b1.toString());
		
		System.out.println(b1.bname+" by "+b1.getAuthor().getName()+" ("+b1.getAuthor().getGender()+")"+" @ "+b1.getAuthor().getEmail());
		
		
		
		

		
	}

}
