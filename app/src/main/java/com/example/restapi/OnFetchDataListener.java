package com.example.restapi;

import com.example.restapi.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
