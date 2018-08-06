/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACHU
 */
public class DogJava {

    /**
     * @param args the command line arguments
     */
    String name;
    String breed;
    int age;
    String color;
    public DogJava(String name,String breed,int age,String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
  public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
    public String getColor()
    {
        return color;
    }
 
  
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
    public static void main(String[] args) 
    {
         DogJava tuffy = new DogJava("tuffy","hlo", 5, "white");
        System.out.println(tuffy.toString());
    }
    
}
