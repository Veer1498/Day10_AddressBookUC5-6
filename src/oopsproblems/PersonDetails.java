package oopsproblems;
import java.util.Scanner;

public class PersonDetails {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipNo;
	private long phoneNo;
	//static Scanner sc = new Scanner(System.in);

	public PersonDetails(String firstName,String lastName, String address, String city, String state, int zipNo, long phoneNo ) {

	//	System.out.println("Enter firstName");
	//	firstName =sc.next();
		this.firstName =firstName;
		
	//	System.out.println("Enter LastName");
		//lastName =sc.next();
		this.lastName =lastName;

	//	System.out.println("Enter Address");
		//address =sc.next();
		this.address =address;
		
	//	System.out.println("Enter City");
		//city =sc.next();
		this.city =city;
		
	//	System.out.println("Enter State");
		//state =sc.next();
		this.state =state;

	//	System.out.println("Enter Zip");
		//zipNo =sc.nextInt();
		this.zipNo =zipNo;

	//	System.out.println("Enter phoneNumber");
		//phoneNo =sc.nextLong();
		this.phoneNo =phoneNo;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getZipNo() {
		return zipNo;
	}



	public void setZipNo(int zipNo) {
		this.zipNo = zipNo;
	}



	public long getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}



	public void show() {
		// TODO Auto-generated method stub
		System.out.println( "Person Details" );
		System.out.println("FirstName = "+ this.firstName);
		System.out.println("LastName = "+ this.lastName);
		System.out.println("Address = "+ this.address);
		System.out.println("city = "+ this.city);
		System.out.println("state = "+ this.state);
		System.out.println("zip = " +this.zipNo);
		System.out.println("phoneNumber = " + this.phoneNo);
	}

}
