package Classes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Process{
	public static  void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Doctor d=new Doctor();
		Patient p=new Patient();
		Admin a=new Admin();
		d.adDoc(12,"fjdlskf","dfds","dfsd","dfds",423432);
		p.adp(25,"fds","dfds",545,"dfd","df","dfdsf",34534);
		a.add();
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println("\t\t     DATA STRUCTURES PROJECT\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.print("\n\n");
		    System.out.println("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**");
		    System.out.print("      =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		    System.out.print("\n      =                  WELCOME                  =");
		    System.out.print("\n      =                    TO                     =");
		    System.out.print("\n      =              Patient Record               =");
		    System.out.print("\n      =                 MANAGEMENT                =");
		    System.out.print("\n      =                   SYSTEM                  =");
		    System.out.print("\n      =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		    System.out.println("\n**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**");
		    System.out.println();
		    boolean maincheck=true;
		    while(maincheck) {
		    	 boolean check=true;
		    System.out.println("\n**SELECT THE OPTION**");
			System.out.println("-----------------------------------------------------------------");
		    System.out.println("1.DOCTOR LOGIN\n2.PATIENT LOGIN\n3.ADMIN LOGIN\n4.EXIT\n");
		    int login=sc.nextInt(),ch=0;
		    if(login==1) {
		    	System.out.println("ENTER DOCTOR ID : ");
		    	int id=sc.nextInt();
		    	if(d.Doclogin(id)) {
		    		System.out.println("\n----LOGGED IN SUCCESSFULLY!!----");
		    		while(check) {
		    		System.out.println("\n***YOUR OPTIONS***");
		    		System.out.println("-----------------------------------------------------------------");
		    		System.out.println("\n1.ADD NEW DOCTOR \n2.VIEW DOCTOR DETAILS \n3.VIEW PATIENT DETAILS \n4.SEARCH DOCTOR DETAIL \n5.SEARCH PATIENT DETAIL ");
		    		int choice=sc.nextInt();
		    		switch(choice) {
		    		case 1:
		    				System.out.println("DOCTOR NAME : ");
			    			String name=sc.next();
			    			System.out.println("DOCTOR QUALIFICATION : ");
			    			String quali=sc.next();
			    			System.out.println("DOCTOR GENDER : ");
			    			String gen=sc.next();
			    			System.out.println("DOCTOR ADDRESS : ");
			    			String addr=sc.next();
			    			System.out.println("DOCTOR NUMBER : ");
			    			long no=sc.nextLong();
			    			System.out.println("DOCTOR ID : ");
			    			int did=sc.nextInt();
			    			d.addNewDoctor(did, name, gen, quali, addr, choice);
			    			a.addMap(id);
			    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
			    			ch=sc.nextInt();
			    			if(ch==1)
			    				check=true;
			    			else if(ch==0) {
			    				maincheck=true;
			    				check=false;
			    				}
			    			break;
		    		case 2:
		    			d.printDocDetails();
		    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
		    			break;
		    		case 3:
		    			p.printPatientDetails();
		    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
		    			break;
		    		case 4:
		    			System.out.println("ENTER DOCTOR ID TO SEARCH : ");
		    			int docid=sc.nextInt();
		    			d.printSpecDocDetail(docid);
		    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
		    			break;
		    		case 5:
		    			System.out.println("ENTER PATIENT ID TO SEARCH : ");
		    			int docid2=sc.nextInt();
		    			p.printSpecPatient(docid2);
		    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
		    			break;
		    		default:
		    			System.out.println("WRONG CHOICE!!");
		    			check=true;
		    			}
		    		}
		    	}else{
		    		System.out.println("ENTERED ID IS WRONG!!");
			    	System.out.println("\nReturn back enter 1 or Main menu Enter 0");
	    			ch=sc.nextInt();
	    			if(ch==1)
	    				check=true;
	    			else if(ch==0) {
	    				maincheck=true;
	    				check=false;
	    				}
	    			}
		    	}else if(login==2) {
		    		System.out.println("ENTER PATIENT ID : ");
		    		int id=sc.nextInt();
		    		if(p.PatientLogin(id)) {
		    			System.out.println("\n----LOGGED IN SUCCESSFULLY----");
		    			while(check) {
		    				System.out.println("\n***YOUR OPTIONS***");
				    		System.out.println("-----------------------------------------------------------------");
		    				System.out.println("1.VIEW MY DETAILS \n2.UPLOAD MY STATUS\n3.VIEW MY STATUS");
		    				int choice=sc.nextInt();
		    				switch(choice) {
		    				case 1:
		    					p.printSpecPatient(id);
		    					System.out.println("\nReturn back enter 1 or Main menu Enter 0");
				    			ch=sc.nextInt();
				    			if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
				    			break;
		    				case 2:
		    					String s=sc.nextLine();
		    					p.UploadPatStatus(id);
		    					System.out.println("\nReturn back enter 1 or Main menu Enter 0");
				    			ch=sc.nextInt();
				    			if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
				    			break;
		    				case 3:
		    					p.viewMyStauts(id);
		    					System.out.println("\nReturn back enter 1 or Main menu Enter 0");
				    			ch=sc.nextInt();
				    			if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
				    			break;
		    				default:
				    			System.out.println("WRONG CHOICE!!");
				    			check=true;
		    					}
		    				}
		    		}else{
		    			System.out.println("PATIENT ID IS WRONG!!");
		    			System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
		    			}
		    		}else if(login==3){
		    		System.out.println("ENTER DOCTOR ID : ");
		    		int id=sc.nextInt();
		    		System.out.println("ENTER ADMIN PASSWORD : ");
		    		int pass=sc.nextInt();
		    		if(a.checkPass(id, pass)){
		    			System.out.println("\n----ADMIN LOGGED IN SUCCESSLLY!!----");
		    			while(check){
		    			System.out.println("\n**AVAILABLE OPERATIONS**");
		    			System.out.println("-----------------------------------------------------------------");
		    			System.out.println("1.ADD NEW PATIENT\n2.EDIT DOCTOR DETAILS \n3.EDIT PATIENT DETAILS\n4.DELETE PATIENT RECORD\n5.DELETE DOCTOR ACCOUNT");
		    			int choice=sc.nextInt();
		    			switch(choice){
		    			case 1:
		    				System.out.println("PATIENT ID : ");
							int pid=sc.nextInt();
		    				System.out.println("PATIENT NAME : ");
							String name=sc.next();
							System.out.println("PATIENT GENDER : ");
							String gen=sc.next();
							System.out.println("PATIENT ADDRESS : ");
							String addr=sc.next();
							System.out.println("PATIENT DISEASE : ");
							String dis=sc.next();
							System.out.println("PATIENT STATUS : ");
							String status=sc.next();
							System.out.println("PATIENT NUMBER : ");
							long no=sc.nextLong();
							System.out.println("PATIENT AGE : ");
							int age=sc.nextInt();
							p.addNewPatient(pid, name, gen, age, addr, dis, status, no);
							System.out.println("\nReturn back enter 1 or Main menu Enter 0");
			    			ch=sc.nextInt();
			    			if(ch==1)
			    				check=true;
			    			else if(ch==0) {
			    				maincheck=true;
			    				check=false;
			    				}
			    			break;
		    			case 2:
		    				d.EditDoc(id);
		    				System.out.println("\nReturn back enter 1 or Main menu Enter 0");
			    			ch=sc.nextInt();
			    			if(ch==1)
			    				check=true;
			    			else if(ch==0) {
			    				maincheck=true;
			    				check=false;
			    				}
			    			break;
		    			case 3:
		    				System.out.println("ENTER PATIENT ID TO MODIFY : ");
		    				int ppid=sc.nextInt();
		    				if(p.PatientLogin(ppid)){
		    					p.editPatient(ppid);
		    					System.out.println("\nReturn back enter 1 or Main menu Enter 0");
				    			ch=sc.nextInt();
				    			if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
				    			}else{
		    					System.out.println("ENTERED PATIENT ID NOT IS WRONG!!");
		    					System.out.println("\nReturn back enter 1 or Main menu Enter 0");
				    			ch=sc.nextInt();
				    			if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
		    					}
		    				break;
		    			case 4:
		    				System.out.println("ENTER PATIENT ID TO DELETE : ");
		    				int did=sc.nextInt();
		    				p.DelPatient(did);
		    				System.out.println("\nReturn back enter 1 or Main menu Enter 0");
			    			ch=sc.nextInt();
			    			if(ch==1)
			    				check=true;
			    			else if(ch==0) {
			    				maincheck=true;
			    				check=false;
			    				}
			    			break;
		    			case 5:
		    				System.out.println("ARE YOU SURE YOU WANT TO DELETE YOUR ID?\n1.Yes\n2.No");
		    				int chose=sc.nextInt();
		    				if(chose==1){
		    				if(d.delDoc(id)){
		    					System.out.println("\n***ACCOUNT REMOVED SUCCESSFULLY!!***");
		    					a.delmap(id);
		    					check=false;
		    				}
		    				}else if(chose==2){
		    					check=true;
		    				}else{
		    					System.out.println("\nWRONG CHOICE!");
		    					if(ch==1)
				    				check=true;
				    			else if(ch==0) {
				    				maincheck=true;
				    				check=false;
				    				}
		    				}
		    				break;
		    			default:
			    			System.out.println("WRONG CHOICE!!");
			    			check=true;
			    			}
		    			}
		    			
		    		}else{
	    				System.out.println("ENTERED DOCTOR ID OR PASSWORD IS WRONG!!");
	    				System.out.println("\nReturn back enter 1 or Main menu Enter 0");
		    			ch=sc.nextInt();
		    			if(ch==1)
		    				check=true;
		    			else if(ch==0) {
		    				maincheck=true;
		    				check=false;
		    				}
	    			}
		    	}
		    	else if(login==4){
		    		System.out.println("**THANK YOU**");
		    		maincheck=false;
		    		
		    		
		    	}else{
		    		System.out.println("WRONG CHOICE!!");
		    		maincheck=true;
		    		
		    	}
		    }
		    }
		}
