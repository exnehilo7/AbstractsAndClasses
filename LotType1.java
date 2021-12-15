/*
Programmer: Dan Hopp
Date: 03-MAR-2020
Description: Extend Lot, implement Comparable<Lot> interface. Lots of Type 1 
are triangular. Implement the area calculation correctly. Numbers that are
passed into the constructor are the base and the height.
 */


public class LotType1 extends Lot implements Comparable<Lot> {

    double base;
    double height;
    String id;
    
    //Default constructor
    LotType1(){
        
    }
    
    //Constructor with pass-throughs
    LotType1(String id, double base, double height){
        this.id = id;
        this.base = base;
        this.height = height;
    }
    
    //Implementing calculateArea() abstract method
    @Override
    public double calculateArea(){
        return 0.5 * base * height;
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
