package com.josemanuel.menu;

import java.util.Scanner;
import java.util.function.Function;

public class ItemMenu {

    private String mensajeMenu;
    private Menu subMenu;
    private Function<Scanner, Void> itemMenuFuncion;

    public ItemMenu(String mensajeMenu, Menu subMenu) {
        this.subMenu = subMenu;
        this.mensajeMenu = mensajeMenu;        
    }

    //sobrecarga de constructor
    public ItemMenu(String mensajeMenu, Function<Scanner, Void> itemMenuFuncion) {
        this.mensajeMenu = mensajeMenu;
        this.itemMenuFuncion = itemMenuFuncion;
    }
//getter y setter
    public Menu getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(Menu subMenu) {
        this.subMenu = subMenu;
    }

    public String getMensajeMenu() {
        return mensajeMenu;
    }

    public void setMensajeMenu(String mensajeMenu) {
        this.mensajeMenu = mensajeMenu;
    }
//metodo
    public Function<Scanner, Void> getItemMenuFuncion() {
        return itemMenuFuncion;
    }

}
