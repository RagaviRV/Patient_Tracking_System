package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Admin {
	HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	public void add(){
		h.put(12, 5678);
	}
	public void addMap(int id1){
		h.put(id1,5678);
	}
	public void delmap(int id){
		h.remove(id);
	}
	public boolean checkPass(int id,int pass){
		 for (Entry<Integer, Integer> set :h.entrySet()) {
			 if(set.getKey()==id && set.getValue()==pass){
				 return true;
			 }
		 }
		 return false;
		 }
	}


