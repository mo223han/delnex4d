package com.test;

import java.util.ArrayList;
import java.util.HashMap;

public class InputCar {
	public static void main(String[] args) {

		SRoom s1=new SRoom("TATA","HYD",123,"Indica");
		SRoom s2=new SRoom("TATA","HYD",122,"Indigo");
		SRoom s3=new SRoom("TATA","HYD",129,"Sumo");
		
		
		SRoom s4=new SRoom("MAHINDRA","BNG",123,"Bolero");
		SRoom s5=new SRoom("MAHINDRA","BNG",122,"Scorpio");
		 
		ArrayList<SRoom> sem5=new ArrayList<>();

		sem5.add(s1);
		sem5.add(s2);
		sem5.add(s3);
		 


		ArrayList<SRoom> sem3=new ArrayList<>();
		sem3.add(s4);
		sem3.add(s5);
		 





		HashMap<String, ArrayList<SRoom>> studs=new HashMap();


		studs.put("TATA", sem5);
		studs.put("MAHINDRA", sem3);


		ArrayList<SRoom> getCar=studs.get("TATA");
		ArrayList<SRoom> getCar1=studs.get("MAHINDRA");


		for(SRoom s:getCar)
		{
				System.out.println(s);
		}
		for(SRoom s:getCar1)
		{
				System.out.println(s);
		}


		}
}
