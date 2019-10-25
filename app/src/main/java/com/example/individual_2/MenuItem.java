package com.example.individual_2;

public class MenuItem {
    private int itemId;
    private String itemName;
    private String itemDescripton;
    private Double itemPrice;
    private int itemImageId;


    public MenuItem(int itemId, String itemName, String itemDescripton, Double itemPrice, int itemImageId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescripton = itemDescripton;
        this.itemPrice = itemPrice;
        this.itemImageId = itemImageId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescripton() {
        return itemDescripton;
    }

    public void setItemDescripton(String itemDescripton) {
        this.itemDescripton = itemDescripton;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemImageId() {
        return itemImageId;
    }

    public void setItemImageId(int itemImageId) {
        this.itemImageId = itemImageId;
    }



}
