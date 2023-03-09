package register_user;

public class 	BuyerInformation {
private String Name;
private String Address;
private int PhoneNo;
private String Email;
public BuyerInformation()
{
	}
public BuyerInformation(String name, String address, int phoneNo, String email) {
	super();
	Name = name;
	Address = address;
	PhoneNo = phoneNo;
	Email = email;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(int phoneNo) {
	PhoneNo = phoneNo;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "BuyerInformation [Name=" + Name + ", Address=" + Address + ", PhoneNo=" + PhoneNo + ", Email=" + Email
			+ "]";
}

}