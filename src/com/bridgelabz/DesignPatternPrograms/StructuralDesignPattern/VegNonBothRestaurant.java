package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern;

public class VegNonBothRestaurant implements Hotel
{
    public Menus getMenus()
    {
        Both b = new Both();
        return b;
    }
}
