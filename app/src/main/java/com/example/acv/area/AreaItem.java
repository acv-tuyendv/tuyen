package com.example.acv.area;

import android.support.annotation.NonNull;

import com.example.acv.area.databinding.ItemAreaBinding;
import com.xwray.groupie.ExpandableGroup;
import com.xwray.groupie.ExpandableItem;
import com.xwray.groupie.databinding.BindableItem;

public class AreaItem extends BindableItem<ItemAreaBinding> implements ExpandableItem {

    private String idArea;
    private String name;
    private boolean check;
    private ExpandableGroup expandableGroup;

    public AreaItem(String id, String name, boolean check){
        this.idArea = id;
        this.name = name;
        this.check = check;
    }

    @Override
    public void bind(@NonNull ItemAreaBinding viewBinding, int position) {
        viewBinding.setArea(this);
    }

    @Override
    public int getLayout() {
        return R.layout.item_area;
    }

    @Override public void setExpandableGroup(@NonNull ExpandableGroup onToggleListener) {
        this.expandableGroup = onToggleListener;
    }

    public String getIdArea() {
        return idArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
