package sample;

import com.qa.api.gorest.util.TestUtil;

public class Generate {
	
	
	public static void main(String arg[]){
		
		Avatar av = new Avatar("http://www.av.com");
		Edit ed = new Edit("http://www.ed.com");
		Self sf = new Self("http://sf.com");
		Links lk = new Links(sf, ed, av);

		Result rs = new Result("Tom", "P", "male", "01-01-1990", "nav@gmail.com", "999999", "http://www.tom.com", 
				"test address", "active", lk);
		
		String jsonString = TestUtil.getSerializedJSON(rs);
		System.out.println(jsonString);
	}
	
	
	
	
	
	

}
