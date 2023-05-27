package Classes;
import java.util.*;
public class Patient {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String address;
	private String disease;
	private String status;
	private long number;
	LinkedHashSet<Patient> a=new LinkedHashSet<>();
	Scanner sc=new Scanner(System.in);
	public Patient() {}
	public Patient(int id, String name, String gender, int age, String address, String disease, String status,
			long number) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.disease = disease;
		this.status = status;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void adp(int id, String name, String gender, int age, String address, String disease, String status,
			long number){
		a.add(new Patient(id,name,gender,age,address,disease,status,number));
	}
	public void addNewPatient(int id, String name, String gender, int age, String address, String disease, String status,
			long number) {
		int c=0,add=0;
		if(a.isEmpty()) {
			a.add(new Patient(id,name,gender,age,address,disease,status,number));
			add=1;
			}
			
		else{
			for(Patient p:a) {
				if(p.getId()!=id) {
					c++;
					if(a.size()==c) {
						a.add(new Patient(id,name,gender,age,address,disease,status,number));
						add=1;
						}
					}
				}
			}
		if(add==1)
			System.out.println("\n**NEW PATIENT ACCOUNT ADDED SUCCESSFULLY**");
		else
			System.out.println("\n**ENTERED ID ALREADY AVAILABLE!**");
		}
	public void printSpecPatient(int id) {
	int c=0;
	for(Patient p:a) {
		if(p.getId()==id) {
			c=1;
			System.out.println("PATIENT ID : "+p.getId());
			System.out.println("PATIENT NAME : "+p.getName());
			System.out.println("PATIENT GENDER : "+p.getGender());
			System.out.println("PATIENT AGE : "+p.getAge());
			System.out.println("PATIENT ADDRESS : "+p.getAddress());
			System.out.println("PATIENT DISEASE : "+p.getDisease());
			System.out.println("PATIENT STATUS : "+p.getStatus());
			System.out.println("PATIENT NUMBER : "+p.getNumber());
			System.out.println("\n------------------------------------------------------------------------");
			System.out.println();
			}
	}
	if(c==0)
		System.out.println("\n**ENTERED ID IS NOT AVAILABLE!**");
	}
	public void printPatientDetails() {
		if(a.isEmpty())
			System.out.println("**NO RECORD AVAILABLE!**");
		else {
			for(Patient p:a) {
				System.out.println("PATIENT ID : "+p.getId());
				System.out.println("PATIENT NAME : "+p.getName());
				System.out.println("PATIENT GENDER : "+p.getGender());
				System.out.println("PATIENT AGE : "+p.getAge());
				System.out.println("PATIENT ADDRESS : "+p.getAddress());
				System.out.println("PATIENT DISEASE : "+p.getDisease());
				System.out.println("PATIENT STATUS : "+p.getStatus());
				System.out.println("PATIENT NUMBER : "+p.getNumber());
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println();
				}
		}
	}
	public void editPatient(int id) {
		int c=0;
		if(!a.isEmpty()) {
			for(Patient p:a) {
				if(p.getId()==id) {
					c=1;
					System.out.println("PATIENT NAME : ");
					p.setName(sc.nextLine());
					System.out.println("PATIENT GENDER : ");
					p.setGender(sc.nextLine());
					System.out.println("PATIENT ADDRESS : ");
					p.setAddress(sc.nextLine());
					System.out.println("PATIENT DISEASE : ");
					p.setDisease(sc.nextLine());
					System.out.println("PATIENT STATUS : ");
					p.setStatus(sc.nextLine());
					System.out.println("PATIENT NUMBER : ");
					p.setNumber(sc.nextLong());
					System.out.println("PATIENT AGE : ");
					p.setAge(sc.nextInt());
					}
			}
			if(c==1)
				System.out.println("\n**RECORD MODIFIED SUCCESSFULLY!!**");
			else
				System.out.println("\n**ENTERED PATIENT ID IS WRONG!!**");
		}else {
			System.out.println("**\nNO RECORDS TO MODIFY !!**");
		}
		}
	public boolean PatientLogin(int id) {
		for(Patient p:a) {
			if(p.getId()==id)
				return true;
		}
		return false;
		}
	public void UploadPatStatus(int id) {
		int c=0;
		for(Patient p:a) {
			if(p.getId()==id) {
				System.out.println("\nENTER YOUR MESSAGE HERE...");
				String s=sc.nextLine();
				p.setStatus(s);
				System.out.println("STATUS ADDED SUCCESSFULLY!!");
				}
		}
		}
	public void viewMyStauts(int id){
		for(Patient p:a) {
			if(p.getId()==id) {
				System.out.println("STATUS : "+p.getStatus());
			}
		}
		}
	public void DelPatient(int id){
		int c=0;
		for(Patient p:a){
			if(p.getId()==id){
				c=1;
				a.remove(p);
				System.out.println("\n**ACCOUNT REMOVED SUCCESSFULLY!!**");
			}
			}
		if(c==0)
			System.out.println("\n**ENTERED PATIENT ID IS WRONG!!**");
		}
	}
