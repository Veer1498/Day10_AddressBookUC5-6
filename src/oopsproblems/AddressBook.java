package oopsproblems;
import java.util.Scanner;

public class AddressBook {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firstName");
		String firstName =sc.next();
		
		System.out.println("Enter LastName");
		String lastName =sc.next();

		System.out.println("Enter Address");
		String address =sc.next();
		
		System.out.println("Enter City");
		String city =sc.next();
		
		System.out.println("Enter State");
		String state =sc.next();

		System.out.println("Enter Zip");
		int zipNo =sc.nextInt();

		System.out.println("Enter phoneNumber");
		long phoneNo =sc.nextLong();
		
		PersonDetails pd[] =new PersonDetails [5];

		for(int i=0;i<pd.length;i++) {
			pd[i] = new PersonDetails(firstName,lastName, address, city, state, zipNo, phoneNo);
		}
		
		for(int i=0;i<pd.length;i++) {
		pd[i].show();
		System.out.println("");
		}
	}
	
}
