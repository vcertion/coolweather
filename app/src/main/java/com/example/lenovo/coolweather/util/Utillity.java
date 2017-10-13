package com.example.lenovo.coolweather.util;

import android.text.TextUtils;

import com.example.lenovo.coolweather.db.City;
import com.example.lenovo.coolweather.db.County;
import com.example.lenovo.coolweather.db.Province;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

/**
 * Created by lenovo on 2017/10/9.
 */

public class Utillity {
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allprovinces = new JSONArray(response);
                for (int i=0;i<allprovinces.length();i++){
                    JSONObject prvinceObject = allprovinces.getJSONObject(i);
                    Province province= new Province();
                    province.setProvincename(prvinceObject.getString("name"));
                    province.setProvincecode(prvinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public  static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i=0;i<allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city =new City();
                    city.setCityname(cityObject.getString("name"));
                    city.setCitycode(cityObject.getInt("id"));
                    city.setProvinceid(provinceId);
                    city.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }return false;
    }
    public static boolean handleCountryResponse(String response, int cityid){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allcuontries =new JSONArray(response);
                for (int i=0;i<allcuontries.length();i++){
                    JSONObject countryObject =allcuontries.getJSONObject(i);
                    County county =new County();
                    county.setCountyname(countryObject.getString("name"));
                    county.setWeatherid(countryObject.getString("weather_id"));
                    county.setCityid(cityid);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
