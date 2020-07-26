import java.util.*;
interface FuncInterface 
{ 
     
    void abstractFun(List<Integer> x); 
  
     
    
} 
  
class averageOfList 
{ 
    public static void main(String args[]) 
    { 
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter number of elements to be inserted into the list : ");
    	List<Integer> list=new ArrayList<Integer>(); 
    	int n= sc.nextInt();
    	for(int i=0;i<n;i++)
    	{
    		int a= sc.nextInt();
    		list.add(a);
    	}
        FuncInterface fobj = (List<Integer> x)->{
        	int avg=0;
        	for (Integer listItem : list) {
                avg+=listItem;
            }
        	double output=avg;
        	System.out.println(output/list.size());
        }; 
  
         
        fobj.abstractFun(list); 
        sc.close();
    } 
   
} 