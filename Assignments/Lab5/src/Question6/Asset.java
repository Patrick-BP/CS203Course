package Question6;

import java.util.*;

public class Asset {
    private List<Appliances> appList;
    private List<Automobiles> autList;
    private List<CompactDisk> compactList;
    private List<Furnitures> furnitureList;

    public Asset() {
        this.appList = new ArrayList<Appliances>();
        this.autList = new ArrayList<Automobiles>();
        this.compactList = new ArrayList<CompactDisk>();
        this.furnitureList = new ArrayList<Furnitures>();
    }


    public List<Appliances> getAppList() {
        return appList;
    }

    public void setAppList(List<Appliances> appList) {
        this.appList = appList;
    }

    public List<Automobiles> getAutList() {
        return autList;
    }

    public void setAutList(List<Automobiles> autList) {
        this.autList = autList;
    }

    public List<CompactDisk> getCompactList() {
        return compactList;
    }

    public void setCompactList(List<CompactDisk> compactList) {
        this.compactList = compactList;
    }

    public List<Furnitures> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(List<Furnitures> furnitureList) {
        this.furnitureList = furnitureList;
    }
    public void AddAppliances(Appliances obj){
        appList.add(obj);
    }
    public void modifierAppliances(Appliances obj, int n){
        appList.set(n,obj);
    }
    public void AddAutomobiles(Automobiles obj){
        autList.add(obj);
    }
    public void AddCompactDisk(CompactDisk obj){
        compactList.add(obj);
    }
    public void AddFurniture(Furnitures obj){
        furnitureList.add(obj);
    }

    public void deleteAppliances(Appliances obj){
        appList.remove(obj);
    }
    public void deleteAutomobiles(Automobiles obj){
        autList.remove(obj);
    }
    public void deleteAppliances(CompactDisk obj){
        compactList.remove(obj);
    }
    public void deleteFurniture(Furnitures obj){
        furnitureList.remove(obj);
    }
    public void modifierAutomobiles(Automobiles obj1, Automobiles obj2){
        autList.set(autList.indexOf(obj1), obj2);
    }
    public void modifierCompactDisk(CompactDisk obj, int n){
        compactList.set(n,obj);
    }
    public void modifierFurniture(Furnitures obj,int n){
        furnitureList.set(n,obj);
    }








    @Override
    public String toString() {
        return
                appList +
                        " " + autList +
                        " " + compactList +
                        " " + furnitureList ;
    }



}
