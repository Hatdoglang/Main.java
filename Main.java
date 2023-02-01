import java.util.*;
import java.util.ArrayList;



public class Main {
  
    
 
  
  
   public static void main(String args[]){

	   
	   Mainclass main=new Mainclass();
	   main.Menu();
   }
   }
class Mainclass{      

	
	
	
	
	public void Menu() {
		
		
		int code;
		String name,employee,type;
		Scanner sc=new Scanner(System.in);
		List<info> in=new ArrayList<info>();
		Iterator<info> per=in.iterator();
int i=6;
		
		do {
		    System.out.println("Welcome To Peripheral Management System");
		    System.out.println("---------------------------------------------");
			System.out.println("1. Add Record");
			System.out.println("2. View Record");
			System.out.println("3. Edit Record");
			System.out.println("4. Delete Record");
			System.out.println("5. Report Record");
			System.out.println("6. Exit");
		    System.out.println("---------------------------------------------");

			System.out.print("Enter Your Choice : ");
	         i=sc.nextInt();
			
			
			switch(i) {
	
			case 1:  
			    System.out.println("---------------------------------------------");
				System.out.println("Add Record");
				System.out.println("---------------------------------------------");
				System.out.print("Enter Code/That must be 8 Digit : ");
				code=sc.nextInt();
				System.out.print("Enter The Device Name : ");
				name=sc.next();
				System.out.print("Enter The Name of Employee : ");
				employee=sc.next();
				System.out.print("Enter Peripheral Type  :");
				type=sc.next();
						
	      
	        info c=new info(code,name,employee,type);
	        in.add(c);
				
				break;
			case 2:
			    System.out.println("---------------------------------------------------");
			    System.out.println("View record");
				System.out.println("---------------------------------------------------");
				per=in.iterator();
				while(per.hasNext()) {
				System.out.println(per.next().Information());
				}
				System.out.println("---------------------------------------------------");
				break;
			case 3:
				
				boolean peri=false;
				
				ListIterator<info> ch=in.listIterator();
				System.out.println("---------------------------------------------------");
				System.out.println("Edit Record");
				System.out.println("---------------------------------------------------");
				System.out.print("Enter The Code/ That must be 8 digit :");
				code=sc.nextInt();
				while(ch.hasNext()) {
				info p=ch.next();
				if(p.Code()==code) {
				    	
						System.out.print("Enter Code/ That must be 8 digit: ");
						code=sc.nextInt();
						System.out.print("Enter the device Name : ");
						name=sc.next();
						System.out.println("Enter Employee Name : ");
						employee=sc.next();
						System.out.print("Enter Type Of Peripheral :");
						type=sc.next();
						
						ch.set(new info(code,name,employee,type));
						peri=true;
						
                        if(!peri) {						
                    	System.out.println("Not Found, Try Again");
                        }else {
                     	System.out.println("Successfuly");
                        }
						
					}
				}break;
			
			case 4:
				per=in.iterator();
				System.out.print("Enter The Code To Delete : ");
				code=sc.nextInt();
				peri=false;
				while(per.hasNext()) {
			    info tt=per.next();
				if(tt.Code()==code) {
				per.remove();
				peri=true;
					}
				}
			
				
				if(!peri) {
					System.out.println("The you Code Enter Didn't Match, Please Try Again!!!");
				}else {
					System.out.println("It is Deleted Successfuly!!!");
				}
				
				break;
				
			case 5:
				while(per.hasNext()) {
					System.out.println(per.next().Information());
				}
				break;
			case 6:
				System.out.println("---------------------------------------------------");
				System.out.println("Thank You So Much!!!");
				System.out.println("----------------------------------------------------");
				break;
			
			}
		}while(i!=6);
	}
}
class info{
	int code;
	String name,employee,type;
	info(int code,String name,String employee,String type){
		this.code=code;
		this.name=name;
		this.employee=employee;
		this.type=type;
	}
	
	public String Information() {
		return "CODE: "+code+" "+"NAME: "+name+" "+"EMPLOYEE NAME: "+employee+" "+"PERIPHERAL TYPE : "+type;
	}
	public int Code() {
		return code;
	}
}
