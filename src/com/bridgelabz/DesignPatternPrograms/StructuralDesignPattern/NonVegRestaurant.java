package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern;

public class NonVegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
