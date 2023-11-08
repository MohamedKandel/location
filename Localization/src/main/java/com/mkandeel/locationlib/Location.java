package com.mkandeel.locationlib;

import android.content.Context;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private String country;
    private String gov;
    private String city;
    private Map<String,String> countries;
    private Map<String,Integer> countriesWithGovern;
    private static Location instance;
    private static Context context;

    private Location() {

    }
    private Location(Context context) {
        this.context = context;
    }

    public static Location getInstance() {
        if (instance == null) {
            instance = new Location();
        }
        return instance;
    }

    public static Location getInstance(Context context) {
        if (instance == null) {
            instance = new Location(context);
        }
        return instance;
    }

    private void mapAllCountries() {
        countries = new LinkedHashMap<>();
        countries.put("EG","Egypt");
        countries.put("SAU","Saudi Arabia");
    }
    private void mapAllGovern() {
        countriesWithGovern = new LinkedHashMap<>();
        countriesWithGovern.put("C",R.array.C);
        countriesWithGovern.put("G",R.array.G);
        countriesWithGovern.put("AS",R.array.AS);
        countriesWithGovern.put("ALEX",R.array.ALEX);
        countriesWithGovern.put("ES",R.array.ES);
    }

}