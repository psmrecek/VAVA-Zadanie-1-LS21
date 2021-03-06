/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.logic;

import java.text.DecimalFormat;

/**
 *
 * @author PeterSmrecek
 */
public class Item {
    
    private String name;
    private String description;
    private Double price;
    private static DecimalFormat df = new DecimalFormat("0.00");

    public Item(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    public String invFormatItem(){
        String text = name + "\t" + description + "\n" + Double.toString(price);
        
        return text;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public String getPrice_string(){
        return df.format(price);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
