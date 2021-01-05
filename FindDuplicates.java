package arrays;
import java.util.*;
public class FindDuplicates {

public static void main(String[] args) {
	int arr[]= {0,1,1,2,2,8,8,8};
	
	Map<Integer,Integer> hm=new HashMap<>();
	for(int no:arr) {
		Integer count =hm.get(no);
		if(count==null) {
			hm.put(no, 1);
		}
		else {
			hm.put(no,++count);
		}
	}
	Set<Map.Entry<Integer,Integer>> duplicate=hm.entrySet();
	for(Map.Entry<Integer,Integer> value:duplicate) {
		if(value.getValue()>1)
		{
			System.out.println(value.getKey() +" is dupliplicate and exist "+value.getValue()+" times");
		}
		
	}
	
	
	}
}

