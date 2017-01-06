package cs303lab9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UPCDriver {
		 public static void main(String[] args) throws IOException {
		        MyMap<String, ArrayList<String>> mp=null;
		        try { 

		               String csvFile = "UPC.csv";

		               //create BufferedReader to read csv file
		               BufferedReader br = new BufferedReader(new FileReader(csvFile));
		               String line = "";
		               StringTokenizer st = null;
		               int tokenNumber=0;
		               int lineNumber=0;
		              // list = new ArrayList<String>();
		               String token;

		               mp= new MyMap<String, ArrayList<String>>();

		               //read comma separated file line by line
		                           while ((line = br.readLine()) != null) {
		               //use comma as token separator
		                st = new StringTokenizer(line, ",");
	                            while (st.hasMoreTokens()) 
		                
		                {
	                            	tokenNumber++;       
	                                String tempStr = st.nextToken();
	                                System.out.println("Line # " + 
	                                                   lineNumber + ", Token # " + 
	                                                   tokenNumber + ", Token : "+ 
	                                                   tempStr); 

	                             //   list.add(tempStr);
//		                String token_lhs=st.nextToken();
//		                            String token_rhs= st.nextToken();
//
//		                            ArrayList<String> arrVal = (ArrayList<String>) mp.get(token_lhs);
//		                            if (arrVal == null) {
//		                                arrVal = new ArrayList<String>();
//		                                mp.put(token_lhs,arrVal);
//		                            }
		                           // arrVal.add(token_rhs);
		                            }
		                           }
		                           
		                        System.out.println("Final Hashmap is : "+mp);

		               } catch (Exception e) {
		               System.err.println("CSV file cannot be read : " + e);
		            

		    }
		        

		 }
}
