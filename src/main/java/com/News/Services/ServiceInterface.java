package com.News.Services;

import java.io.IOException;

import org.json.JSONObject;

import com.News.Model.NewsEntity;

public interface ServiceInterface {

	
	String newsAPI(NewsEntity ne) throws IOException;
}
