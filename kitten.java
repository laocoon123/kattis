// V00862272 Pei, Henry

import java.util.*;
import java.io.*;

public class q1{
	public static void main(String args[]){
		boolean first_line = true;
		int kitten = -1;
		int[] tree = new int[101];

		//File file = new File("test.txt");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			if(first_line){
				kitten = Integer.parseInt(sc.nextLine());
				first_line = false;
				continue;
			}
			//System.out.println(sc.nextLine());
			String a = sc.nextLine();
			q1.addNode(a, tree);

			
		}/*
		for(int i=0;i<tree.length;i++){
				if(tree[i]!=0){
					System.out.print("tree["+i+"] is ");
					System.out.println(tree[i]);
				}
			}*/
		findRoot(kitten, tree);
	}

	static void addNode(String lines, int[] tree){
		int parent = -1;
		Scanner readNum = new Scanner(lines);
		while(readNum.hasNext()){
			if(parent==-1){
				parent = readNum.nextInt();
			}else{
				tree[readNum.nextInt()] = parent;
			}
		}
		readNum.close();
	}

	static void findRoot(int kitten, int[] tree){
		boolean fence = false;
		do{
			if(fence){System.out.print(" ");}
			System.out.print(kitten);
			kitten = tree[kitten];
			fence = true;
		}while(kitten!=0);
	}
}