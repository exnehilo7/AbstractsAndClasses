/*
Programmer: Dan Hopp
Date: 03-MAR-2020
Description: Extend Lot, implement Comparable<Lot> interface. Lots of Type 2 
are rectangular. Implement the area calculation correctly.
 */


public class LotType2 extends Lot implements Comparable<Lot> {
    
    double width;
    double height;
    String id;
    
    //Default constructor
    LotType2(){
        
    }
    
    //Constructor with pass-throughs
    LotType2(String id, double width, double height){
        this.id = id;
        this.width = width;
        this.height = height;
    }
    
    //Implementing calculateArea() abstract method
    @Override
    public double calculateArea(){
        return width * height;
    }
    
    //Implementing getID() abstract method
    @Override
    public String getID(){
        return id;
    }
    
    //Implemeting the compareTo for class' Comparable<Lot>
    @Override
    public int compareTo(Lot o){
        if (calculateArea() > o.calculateArea()){
            return 1;
        }
        else if (calculateArea() < o.calculateArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
