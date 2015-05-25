package MemoryBase;

import java.io.BufferedReader;
import java.util.Scanner;
public class UI {
	int width=79;
	public void line1(){
		for(int i=0;i<width;i++){
			if(i==0){
				System.out.print("+");
			}else if(i>=(width-1)){
				System.out.print("+");
			}else{
				System.out.print("=");
			}
		}
		System.out.println();
	}
	
	public void line2(String str, int length){
		
		length = length - str.length()+2;
		int pos =  length/2;
				
		for(int i=0;i<length;i++){
			if(i==0){
				System.out.print("|");
			}else{
				if(i<length && i!=pos){
					System.out.print(" ");
				}else if(i==pos){
					System.out.print(str);
				}
			}
		}		
	}
	public void line3(int length){
		
		for(int i=0; i<length;i++){
			if(i==0)
				{ System.out.print("+");
					continue;
				}
			System.out.print("=");
			
				
		}
	}
	public void line4(int length){
		
		for(int i=0; i<length;i++){
			if(i==0)
				{ System.out.print("+");
					continue;
				}
			System.out.print("-");
			
				
		}
	}
	public void table_head(){
		String[] title_head = {"NO","Title","Author","Date"}; 
		line1();
		
		for(int i=0;i<4;i++){
			if(i==0 || i==3)
				line2(title_head[i],13);
			else if(i==1 || i==2)
				line2(title_head[i],24);
		}
		System.out.print("|");
		System.out.println();
				
		for(int i=0;i<4;i++){
			if(i==0 || i==3)
				line3(14);
			else if(i==1 || i==2)
				line3(25);
		}
		System.out.print("+");
		System.out.println();
		
		
		
	}
	
	public void table_body(String str,int length){
		
		if (str.length()>15){
			str = str.substring(0, 15)+"..."; 
		}
		
		int len = length - str.length();
		
		for(int i=0;i<len;i++){
			if(i==0){
				 System.out.print("|");
				 System.out.print(" "+str);
			}
			else
				System.out.print(" ");
		}		
	}
	
	public void tbl_row(String[] str){
		
		for(int i=0;i<str.length;i++){
			if(i==0 || i==3)
				table_body(str[i],13);
			else if(i==1 || i==2)
				table_body(str[i],24);
		}
		System.out.print("|");
		System.out.println();

		for(int i=0;i<str.length;i++){
			if(i==0 || i==3)
				line4(14);
			else if(i==1 || i==2)
				line4(25);
		}
		System.out.print("+");
		System.out.println();

	}
	
	public void tbl_footer(int cur_page, int count_page, int record, int length){				
		int space = length - ("| pages: " + cur_page + "/" + count_page + "Total records: "+record+" ").length();
		System.out.print("| pages: " + cur_page + "/" + count_page); 
		for(int i=0;i<space-1;i++){
			System.out.print(" ");
		}
		System.out.print("Total records: "+record+" |");
		System.out.println();
		line1();
	}
	public void head(){ 
		System.out.println("+======================>} Korean Software HTD Center {<=======================+");
		System.out.println("|                                                                             |");
		System.out.println("|                             Article Management                              |");
		System.out.println("|                                                                             |");
		System.out.println("|                         *Team 2 Of Battambong                               |");
		System.out.println("|                            -> Chann Vichet (GL)                             |");
		System.out.println("|                            -> Chan Sophat                                   |");
		System.out.println("|                            -> Nao Narith                                    |");
		System.out.println("|                            -> Prem Chanthorn                                |");
		System.out.println("|                            -> Sry Leangheng                                 |");
		System.out.println("|                            -> Thorn Sereyvong                               |");
		System.out.println("|_____________________________________________________________________________|");
		System.out.println("");
	}
	public void menu(){
		System.out.println("+=================================>} MENU {<==================================+");
		System.out.println("|     F)First | P)Previous | N)Next | L)Last | G)Goto | R)Set Row  X)Exit     |");
		System.out.println("|   S)Search| RD)Read | A)Add | E)Edit | D)Delete | DL)Delete-All | H)Help    |");
		System.out.println("|_____________________________________________________________________________|");
		System.out.print("\n*Choose: ");
	}
	public void thanks(){
		System.out.println("____________________________________-Thanks-___________________________________");
	}
	public void help(){
		System.out.println("+=================================>} HELP {<==================================+");
		System.out.println("| 1.  F)First : Goto the first page. (*Choose: F)                             |");
		System.out.println("| 2.  P)Previous : Previous page. (*Choose: P)                                |");
		System.out.println("| 3.  N)Next : Next page. (*Choose: N)                                        |");
		System.out.println("| 4.  L)Last : Goto the last page. (*Choose: L)                               |");
		System.out.println("| 5.  G)Goto : Goto the page. (*Choose: G 12)                                 |");
		System.out.println("| 6.  R)Set Row : Set row to dispay in page. (*Choose: R 20)                  |");
		System.out.println("| 7.  RD)Read : Read by ID. (*Choose: RD 8)                                   |");
		System.out.println("| 8.  S)Search : Filter by Title, Contain or Author (*Choose: S AJAX)         |");
		System.out.println("| 9.  A)Add : Add new Article. (*Choose: I)                                   |");
		System.out.println("| 10. E)Edit : Edit Article by ID. (*Choose: E 10)                            |");
		System.out.println("| 11. D)Delete : Delete Article by ID. (*Choose: D 10)                        |");
		System.out.println("| 12. DL)Delete-All : Delete All Article. (*Choose: DL)                       |");
		System.out.println("| 13. H)Help : Guiline application. (*Choose: H)                              |");
		System.out.println("| 14. X)Exit : Exit application. (*Choose: X)                                 |");
		System.out.println("|_____________________________________________________________________________|");
	}
	
	public Integer enterData(Scanner scan){
		try{
			System.out.println("Enter ID: ");
			int id = scan.nextInt();
			return id;
		}catch(Exception ex){
			System.out.println("ID invalid.");
			return 0;
		}
	}
	

}
