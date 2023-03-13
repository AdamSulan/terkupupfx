package models;

public class MainModel {
    public double calcConeVolume(double radius, double height){
        double volume;
        volume=Math.pow(radius, 2)*Math.PI*height/3.0;
        return volume;
    }
}
