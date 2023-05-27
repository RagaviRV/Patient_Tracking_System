package Classes;
import java.util.*;
public class Doctor {
LinkedHashSet<Doctor> a=new LinkedHashSet();
Scanner sc=new Scanner(System.in);
private int id;
private String name;
private String gender;
private String quali;
private String address;
private long number;
public Doctor() {
	
}
public Doctor(int id, String name, String gender, String quali, String address, long number) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.quali = quali;
	this.address = address;
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
public String getQuali() {
	return quali;
}
public void setQuali(String quali) {
	this.quali = quali;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public void adDoc(int id, String name, String gender, String quali, String address, long number){
	a.add(new Doctor(id,name,gender,quali,address,number));
}
public void addNewDoctor(int id, String name, String gender, String quali, String address, long number) {
	int c=0,add=0;
	if(a.isEmpty()) {
		a.add(new Doctor(id,name,gender,quali,address,number));
		add=1;
		}
		else{
		for(Doctor d:a) {
			if(d.getId()!=id) {
				c++;
				if(a.size()==c) {
					a.add(new Doctor(id,name,gender,quali,address,number));
					add=1;
					}
				}
			}
		}
	if(add==1)
		System.out.println("\n**NEW DOCTOR ACCOUNT ADDED SUCCESSFULLY**");
	else
		System.out.println("\n**ENTERED ID IS ALREADY AVAILABLE!!!**");
}
public void printDocDetails() {
	if(a.isEmpty())
		System.out.println("\n**NO RECORD AVAILABLE!!**");
	else {
	for(Doctor d:a) {
		System.out.println("DOCTOR ID : "+d.getId());
		System.out.println("DOCTOR NAME : "+d.getName());
		System.out.println("DOCTOR GENDER : "+d.getGender());
		System.out.println("DOCTOR QUALIFICATION : "+d.getQuali());
		System.out.println("DOCTOR ADDRESS : "+d.getAddress());
		System.out.println("DOCTOR NUMBBER : "+d.getNumber());
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println();
		}
	}
}
public void printSpecDocDetail(int id) {
	int c=0;
	for(Doctor d:a) {
		if(d.getId()==id) {
		c=1;
			System.out.println("DOCTOR ID : "+d.getId());
			System.out.println("DOCTOR NAME : "+d.getName());
			System.out.println("DOCTOR GENDER : "+d.getGender());
			System.out.println("DOCTOR QUALIFICATION : "+d.getQuali());
			System.out.println("DOCTOR ADDRESS : "+d.getAddress());
			System.out.println("DOCTOR NUMBBER : "+d.getNumber());
			System.out.println("\n------------------------------------------------------------------------");
			System.out.println();
			}
		}
	if(c==0)
		System.out.println("\n**ENTERED ID NOT AVAILABLE!**");
}
public boolean Doclogin(int id) {
	for(Doctor d:a) {
		if(d.getId()==id)
			return true;
	}
	return false;
	}
public void EditDoc(int id) {
	int c=0;
	for(Doctor d:a) {
		if(d.getId()==id) {
			c=1;
			System.out.println("DOCTOR NAME : ");
			d.setName(sc.nextLine());
			System.out.println("DOCTOR GENDER : ");
			d.setGender(sc.nextLine());
			System.out.println("DOCTOR QUALIFICATION : ");
			d.setQuali(sc.nextLine());
			System.out.println("DOCTOR ADDRESS : ");
			d.setAddress(sc.nextLine());
			System.out.println("DOCTOR NUMBER : ");
			d.setNumber(sc.nextLong());
			}
	}
	if(c==1)
		System.out.println("\n**RECORD MODIFIED SUCCESSFULLY!!**");
	else
		System.out.println("\n**ENTERED ID IS NOT AVAILABLE !!**");
	}
public boolean delDoc(int id){
	for(Doctor d:a){
		if(d.getId()==id){
			a.remove(d);
			return true;
		}
}
	return false;
}
}
