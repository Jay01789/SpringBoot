package com.example.Chucknorris;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;


public class ChucknorrisApplication {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://api.chucknorris.io/jokes/random");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();
		if(responseCode == 200){
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder jsonResponseData = new StringBuilder();
			String ReadLine = null ;
			while((ReadLine = in.readLine()) != null){
				jsonResponseData.append(ReadLine);
			}
			in.close();
			JSONObject masterData = new JSONObject(jsonResponseData.toString());
			System.out.println(masterData.get("value"));
		}else{
			System.out.println("Error , Check connection");
		}
	}

}
