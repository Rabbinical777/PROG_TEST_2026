/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_test_2026;

/**
 *
 * @author emeris
 */
public class PROG_TEST_2026 {

    public static void main(String[] args) {
     String [] cities = {"Cape Town","Port Elizabeth","Pretoria"};
           String []Consoles  ={"PS5","XBOX","SWITCH"};
        
        int [][]stats= {
   
       {1000,2000,3000}, //Cape tOWN 
       {2000,3000,4000}, //Port Elizabeth
       {1500,1100,1200}   //Pretoria
                
              };
        
        
         System.out.println("*".repeat(50));
           System.out.println("GAMING CONSOLE REPORT ");
              System.out.println("*".repeat(50));
              
              
              
              
               
 for (int i=0; i<cities.length; i++){
 
     System.out.println(cities[i] + "\t" + stats [i][0] +"\t"+ stats [i][1]+ "\t" + stats [i][2]);

    
 
 }
 
 
 
 
   System.out.println("*".repeat(50));
      System.out.println("CONSOLE SALES FOR EACH CITY");
            System.out.println("*".repeat(50));
            
                int highestCONSOLESALES = 0;
     //stores the higest accident total found 
     
       String highestCity = "";
     //Stores the name of the city with the  highest console sale
     
     for (int i=0; i<cities.length; i++){

    
    int total= stats[i][0] + stats [i][1] +  stats [i][2];
    
    System.out.println(cities[i] + "\t" + total );
    
    
    
if (total > highestCONSOLESALES){

highestCONSOLESALES=total;
//updates the highest console sales total 


highestCity=cities[i];
//remeber which city has that total 

System.out.println("CITY WITH THE MOST sales :" + highestCity);

}
            
            
            
            
            
            
            
            
            
            
            
    }
}
}

