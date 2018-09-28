package com.example.acv.area;

import android.support.annotation.NonNull;

import com.example.acv.area.databinding.ItemCityBinding;
import com.xwray.groupie.databinding.BindableItem;

public class CityItem extends BindableItem<ItemCityBinding> {
    private String idCity;
    private String name;
    private boolean check;

    public CityItem(String id, String name, boolean check){
        this.idCity = id;
        this.name = name;
        this.check = check;
    }

    @Override
    public void bind(@NonNull ItemCityBinding viewBinding, int position) {
        viewBinding.setCity(this);
    }

    @Override
    public int getLayout() {
        return R.layout.item_city;
    }

    public String getidCity() {
        return idCity;
    }

    public void setId(String id) {
        this.idCity = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
