package ua.od.iptel.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ipvinner on 17.01.2016.
 */
public class BeerExpert {
    public List<String> getBrands(String color){
        List brands = new ArrayList<>();

        if(color.equals("Light")){
            brands.add("Оболонь");
            brands.add("Светлое");
        }else if(color.equals("Hard")){
            brands.add("Лев");
            brands.add("Метрополис");
        }
        return brands;

    }
}
