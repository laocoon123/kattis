// V00862272 Pei, Henry
// reading data part is cited from sample solutions

import java.util.*;
import java.io.*;

public class bacon{
	public static void main(String args[]){
		//File file = new File("test.txt");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			TreeMap<String, ArrayList<String>> tree = new TreeMap<String, ArrayList<String>>();
			int cusNum = sc.nextInt(); sc.nextLine();
			if(cusNum==0){ break;}

			while(cusNum!=0){
				String[] S = sc.nextLine().split(" ");
				for(int i=1;i<S.length;i++){
					if(tree.containsKey(S[i]) ){
						if(!tree.get(S[i]).contains(S[0]) ){
							tree.get(S[i]).add(S[0]);
							Collections.sort( tree.get(S[i]) );
						}
					}else{
						ArrayList<String> nameList = new ArrayList<String>();
						nameList.add(S[0]);
						tree.put(S[i], nameList);
					}
				}
				cusNum--;
			}
			for(Map.Entry m:tree.entrySet() ){  
				System.out.print(m.getKey()+" ");
				System.out.println(m.getValue().toString().replace("[","").replace("]","").replace(",",""));
  			}
  			System.out.println();
		}
	}
}