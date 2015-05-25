package MemoryBase;

public class Validation {
public String[] checkNull(String str){
		
		String[] value={"Error",""};
		String subStr;
		String subStr2;
		String[] keys = {"F","P","N","L","S","A","E","D","DL","H","X"};
		
		if(str == null)
			return value;
		
		str = str.trim();
		
		
		if(str.equalsIgnoreCase(""))
			return value;
		else
			{ subStr = str.substring(0, 1);
			  subStr2 =	str.substring(1).trim();
			}
		
		if(str.trim().length()>1){
			if(str.substring(0,2).trim().length()>1){
				if(str.substring(0, 2).equalsIgnoreCase("RD")){
			
					String subStr3 = str.substring(0, 2);
					String subStr4 = str.substring(2).trim();
			
					if(subStr4.equalsIgnoreCase(""))
						return value;
					else if(subStr4.matches(".*(\\D).*"))
						return value;
					else{
				
						value[0] = subStr3;
						value[1] = subStr4;
						return value;
					}				
				}
			}			
		}
		
		 if(subStr.equalsIgnoreCase("G")|| subStr.equalsIgnoreCase("R")){
			
			if(subStr2.equalsIgnoreCase(""))
				return value;
			else if(subStr2.matches(".*(\\D).*"))
				return value;
			else{				
				value[0] = subStr;
				value[1] = subStr2;
				return value;
			}
		}
				
		else{			
			
			byte t=0;
			
			for(int i=0; i<keys.length; i++){
				
				if(subStr.equalsIgnoreCase(keys[i]))
					{	
						t=(byte)1;
						break;
					}
			}
			
			if(t==1){
				
				if(subStr2.length()==0){
					value[0] = subStr;
					return value; 
				}				
			}				
		}
		return value;			
	}
	public String[] spliteStr(String str){			
		str = str.replace("  ", " ");
		String[] arrStr = str.split(" ");
		return arrStr;
	}
	
/*	public static void main(String[] args) {
		Validation v = new Validation();		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter: ");
		String str = scan.nextLine().trim();		
		String[] a =  v.checkNull(str);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}*/
}
