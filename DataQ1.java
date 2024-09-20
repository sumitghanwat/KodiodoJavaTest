package machineTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DataQ1 {
	
	
	public static void main(String[] args) {
		Employees e=new Employees();
		Map<String,List<Employees>> m=new HashMap<>();
		List<Employees> l=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of employee you want add");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter id of employee =");
			int id=s.nextInt();
			e.setId(id);
			System.out.println("Enter name of employee=");
			String name=s.next();
			e.setName(name);
			System.out.println("Enter department=");
			String dept=s.next();
			
			l.add(e);
			m.put(dept, l);
		}
	
		
		
		
		Set<String> set=m.keySet();
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			for(Employees i:m.get(key))
			{
				System.out.println("department name="+key +"employee id= "+ i.getId()+"employee name ="+i.getName() );
			}
			
		}
	}

}
