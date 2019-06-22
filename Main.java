package com.demo;

import com.google.gson.Gson;

/**
 * Deserializing json object to java object.
 *
 */
public class Main {

	public static void main(String args[]) {

		String json = "{name: \"John\", age: 31, city: \"New York\"}";
		Gson gson = new Gson();

		Details details = gson.fromJson(json, Details.class);

		System.out.println("Printing Pojo Here--->" + details);
	}
}
