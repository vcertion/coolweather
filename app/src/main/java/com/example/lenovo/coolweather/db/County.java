package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/10/9.
 */

public class County extends DataSupport {

    private int id;

    private  String countyname;
    private String weatherid;
    private  int cityid;

    public  int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public String getCountyname(){
        return countyname;
    }
    public void setCountyname( String countyname){
        this.countyname=countyname;
    }
    public int getCityid(){
        return  cityid;
    }
    public void setCityid(int cityid){
        this.cityid=cityid;
    }
    public String getWeatherid(){
        return weatherid;
    }
    public void setWeatherid(String weatherid){
        this.weatherid=weatherid;
    }
}
