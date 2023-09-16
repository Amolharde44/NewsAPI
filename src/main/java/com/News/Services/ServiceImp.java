package com.News.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import com.News.Model.NewsEntity;

import jakarta.inject.Singleton;


@Singleton
public class ServiceImp implements ServiceInterface{

	@Override
	public String newsAPI(NewsEntity ne) throws IOException {
		
		JSONObject jsonResponse=null;
		try {
            
            String apiKey = ne.getApiKey();
            String qnTitle=ne.getQnTitle();
            String from=ne.getFrom();
            String publishedAt=ne.getSortBy();
            String apiUrl = "https://newsapi.org/v2/everything?from="+from+"&sortBy="+publishedAt+"&apiKey="+apiKey+"+&qInTitle="+qnTitle;

            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request method (GET)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            
            if (responseCode == 200) {
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Read the response line by line
                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }

                // Close the reader and connection
                reader.close();
                connection.disconnect();

                // Parse the JSON response
                jsonResponse = new JSONObject(response.toString());
                
                System.out.println(jsonResponse);
            }
            
		} catch (Exception e) {
            e.printStackTrace();
        }
		return jsonResponse.toString();
	}

}
