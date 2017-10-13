package com.example.lenovo.coolweather;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lenovo.coolweather.db.City;
import com.example.lenovo.coolweather.db.County;
import com.example.lenovo.coolweather.db.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/10/9.
 */

public class ChooseAreaFragment extends Fragment {
    public static final int LEAVE_PROVINCE = 0;
    public  static final int LEAVE_CITY = 1;
    public  static final  int LEAVE_COUNTY = 2;

    private ProgressDialog progressDialog;

    private TextView textView;

    private Button backbutton;

    private ListView titlelist;

    private ArrayAdapter<String> adapter;
    private List<String> datalist=new ArrayList<>();

    private List<Province> provicelist;

    private List<City> cityList;

    private List<County> countyList;

    private Province selectedProvince;

    private  City selectedCity;

    private int currentLevel;

    public View onCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

    }
f}
