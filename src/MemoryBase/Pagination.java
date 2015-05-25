package MemoryBase;
import java.util.ArrayList;

public class Pagination {
	public static int page=1;
	public static int perpage=5;	
	
	public void showPage(ArrayList<Article> arr, int value,String act,UI ui){
		int cArr = arr.size();
		
		if(cArr>0){
			int total_page = (int) Math.ceil((cArr/(float)perpage));
			
			switch (act) {
				case "G":
					page=value;
					break;
				case "L":
					page=total_page;
					break;
				case "P":
					if(page!=1){
						page--;
					}else{
						System.out.println("This is the first page. Can not Previous.");
					}
					break;
				case "F":
					page=1;
					break;
				case "N":
					if(page==total_page){
						System.out.println("This is the last page. Can not Next.");
					}else{
						page++;
					}
					break;
				case "R":
					if(value>cArr){
						System.out.println("Show row can be not bigger than record.");
					}else{
						System.out.println("R"+value);
						perpage=value;
						page=1;
						total_page = (int) Math.ceil((cArr/(float)perpage));
					}
					break;
				default:
					break;
			}
			
			int start = (page-1)*perpage;
			int stop = start+perpage;
			
			
			if(page == total_page){
				if(cArr%perpage != 0)
					stop= start+cArr%perpage;
			}
		
			if(page>total_page){ 
				System.out.println("page not found!!!");
				start=0;
				stop=0;
			}	
			ui.table_head();	
			for(int i=start;i<stop;i++){
				String[] str ={""+arr.get(i).getId(),arr.get(i).getTitle(),arr.get(i).getAuthor(),arr.get(i).getDate()};
				ui.tbl_row(str);			
			}
			ui.tbl_footer(page, total_page, cArr,ui.width);
		}else{ 
			System.out.println("No record!");
		}
	}
	public void showPage(ArrayList<Article> arrList,ArrayList<Integer> arr, int value,String act,UI ui){
		int cArr = arr.size();
		if(cArr>0){
			int total_page = (int) Math.ceil((cArr/(float)perpage));			
			switch (act) {
				case "G":
					page=value;
					break;
				case "L":
					page=total_page;
					break;
				case "P":
					if(page!=1){
						page--;
					}else{
						System.out.println("This is the first page. Can not Previous.");
					}
					break;
				case "F":
					page=1;
					break;
				case "N":
					if(page==total_page){
						System.out.println("This is the last page. Can not Next.");
					}else{
						page++;
					}
					break;
				case "R":
					if(value>cArr){
						System.out.println("Show row can be not bigger than record.");
					}else{
						System.out.println("R"+value);
						perpage=value;
						page=1;
						total_page = (int) Math.ceil((cArr/(float)perpage));
					}
					break;
				default:
					break;
			}
			
			int start = (page-1)*perpage;
			int stop = start+perpage;
			
			
			if(page == total_page){
				if(cArr%perpage != 0){
					stop= start+cArr%perpage;
				}
			}
		
			if(page>total_page){ 
				System.out.println("page not found!!!");
				start=0;
				stop=0;
			}
			
			
			ui.table_head();	
			for(int i=start;i<stop;i++){
				String[] str ={""+arrList.get(arr.get(i)).getId(),arrList.get(arr.get(i)).getTitle(),arrList.get(arr.get(i)).getAuthor(),arrList.get(arr.get(i)).getDate()};
				ui.tbl_row(str);			
			}
			ui.tbl_footer(page, total_page, cArr,ui.width);
		}else{
			System.out.println("No record!");
		}
	}
}
