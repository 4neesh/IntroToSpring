package com.aneesh.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			//create object map
			ObjectMapper mapper = new ObjectMapper();
			
			//read the JSON file and convert to POJO
			
			Student student = mapper.readValue(
						new File("data/sample-full.json"),Student.class);
			
			
			//print out the first and last name.
			System.out.println("First name: " + student.getFirstName());
			
			//print out the address:
			Address tempAddress = student.getAddress();
			
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			System.out.println("State = " + tempAddress.getState());
			System.out.println("Country = " + tempAddress.getCountry());
		
			//print out the languages
			for (String lang : student.getLanguages()) {
				System.out.println(lang);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
