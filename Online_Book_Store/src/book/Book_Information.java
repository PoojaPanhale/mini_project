package book;

public class Book_Information {
private int Book_id;
private String Book_Name;
private float Book_Price;
private String Book_Type;
public  Book_Information()
{
	
	}
public Book_Information(int book_id, String book_Name, float book_Price, String book_Type) {
	super();
	Book_id = book_id;
	Book_Name = book_Name;
	Book_Price = book_Price;
	Book_Type = book_Type;
}
public int getBook_id() {
	return Book_id;
}
public void setBook_id(int book_id) {
	Book_id = book_id;
}
public String getBook_Name() {
	return Book_Name;
}
public void setBook_Name(String book_Name) {
	Book_Name = book_Name;
}
public float getBook_Price() {
	return Book_Price;
}
public void setBook_Price(float book_Price) {
	Book_Price = book_Price;
}
public String getBook_Type() {
	return Book_Type;
}
public void setBook_Type(String book_Type) {
	Book_Type = book_Type;
}
@Override
public String toString() {
	return "Book_Information [Book_id=" + Book_id + ", Book_Name=" + Book_Name + ", Book_Price=" + Book_Price
			+ ", Book_Type=" + Book_Type + "]";
}


}
