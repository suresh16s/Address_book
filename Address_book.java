package Program;

import java.util.Scanner;


class Details
{
	 
	 private String firstName;
	 private String lastName;
	 private String address;
	 private String city;
	 private String state;
	 private int zip;
	 private long phoneNo;
	 
	 
	
	 public Details(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNo) {
		 
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
	}
	 
	 public String toString() {
			return "Details [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
					+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo +  "]";
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
public class addressBook {

	public static void main(String[] args) {
		 String firstName = null;
		 String lastName;
		 String address;
		 String city;
		 String state;
		 int zip;
		 long phoneNo;
		 Details detail[]=new Details[100];
		 Scanner sc=new Scanner(System.in);
		 int i,count=0,choice=0,Dbook;
		 while(true)
		 {
			    System.out.println("****Welcome To Address Book***");
			    System.out.println("1. Add  Details");
				System.out.println("2. Update  Details");
				System.out.println("3. Delete  Details");
				System.out.println("4. Display all  Details");
				System.out.println("5. Search  Details By Phone Number");
				System.out.println("6. Exit");
				
				System.out.println("Please Enter your choice  : ");
				choice = sc.nextInt();
				switch (choice) {
				
				
				case 1:
					System.out.println("Add Record");
					System.out.println(" ");
					System.out.println("Enter number of Details to be entered");
					Dbook = sc.nextInt();
					for(i=0;i<Dbook;i++)
					{
						System.out.println("Enter First Name :");
						firstName=sc.next();
						System.out.println("Enter Last Name :");
						lastName=sc.next();
						System.out.println("Enter Address :");
						address=sc.next();
						System.out.println("Enter State :");
						state=sc.next();
						System.out.println("Enter City :");
						city=sc.next();
						System.out.println("Enter Zip Code :");
						zip=sc.nextInt();
						System.out.println("Enter Phone Number:");
						phoneNo=sc.nextLong();
						detail[count++]=new Details(firstName, lastName, address, city, state, zip, phoneNo);
						System.out.println("Added the Record sucessfully.");
						System.out.println(" ");
										
					}
					break;
				case 2:
					   System.out.println("******Updated Record******");
					   System.out.println("Enter Phone Number for updation : ");
						phoneNo = sc.nextLong();
						for (i = 0; i <= count; i++) {
							
							if (detail[i] != null && detail[i].getPhoneNo()==phoneNo) {
								System.out.println("Enter First Name :");
								firstName=sc.next();
								detail[i].setFirstName(firstName);
								System.out.println("Enter Last Name :");
								lastName=sc.next();
								detail[i].setLastName(lastName);
								System.out.println("Enter Address :");
								address=sc.next();
								detail[i].setAddress(address);
								System.out.println("Enter State :");
								state=sc.next();
								detail[i].setState(state);
								System.out.println("Enter City :");
								city=sc.next();
								detail[i].setCity(city);
								System.out.println("Enter Zip Code :");
								zip=sc.nextInt();
								detail[i].setZip(zip);
								System.out.println("AddressBook Updated by PhoneNumber"+phoneNo);
							}
						}
						break;
				
				case 3:
					System.out.println("Delete the record details");
					System.out.println(" ");
					System.out.println("Enter phone number for deletion : ");
					phoneNo= sc.nextLong();
					for (i = 0; i <= count; i++) {

						if (detail[i] != null && detail[i].getPhoneNo()== phoneNo) {
							detail[i] = null;
							System.out.println("Record deleted successfully");
						}
					}

					break;
					
				case 4:
					
					System.out.println("Display all Addressbook record");
					System.out.println(" ");

					for (i = 0; i <count; i++) {

						System.out.println(detail[i]);

					}

					break;
					
				case 5:
					System.out.println("Search Addressbook details by Phone Number: ");
					System.out.println(" ");
					System.out.println("Enter Phone Number for search : ");
					phoneNo = sc.nextLong();
					for (i = 0; i < count; i++) {

						if (detail[i] != null && detail[i].getPhoneNo()==phoneNo) {
							System.out.println(detail[i]);
						}
					}
					break;

				case 6:

					System.exit(0);

				default:
					System.out.println("Please enter correct choice");
				
					
				}
		 }

	
	}

}
