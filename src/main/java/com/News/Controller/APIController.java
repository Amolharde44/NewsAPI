package com.News.Controller;

import java.io.IOException;

import org.json.JSONObject;

import com.News.Model.NewsEntity;
import com.News.Services.ServiceInterface;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller
public class APIController {
	
	@Inject
	ServiceInterface si;
	
	
	@Post("/NewsAPI")
	
	String newsapi(@Body NewsEntity ne) throws IOException
	{
		String response=si.newsAPI(ne);
		
		return response;
	}
	

}
