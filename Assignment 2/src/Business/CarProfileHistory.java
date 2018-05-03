/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ajaygoel
 */
public class CarProfileHistory {
    private ArrayList<CarProfile> carProfileHistory;
    String Updated_time;

    public String getUpdated_time() {
        return Updated_time;
        
    }

    public void setUpdated_time(String Updated_time) {
        this.Updated_time = Updated_time;
    }    
   
    
    public CarProfileHistory()
    {
        carProfileHistory = new ArrayList<CarProfile>();
    }

    public ArrayList<CarProfile> getCarProfileHistory() {
        return carProfileHistory;
        
    }

    public void setCarProfileHistory(ArrayList<CarProfile> carProfileHistory) {
        this.carProfileHistory = carProfileHistory;
    }
    
    public CarProfile addprofile()
    {
        CarProfile cp = new CarProfile();
        carProfileHistory.add(cp);
        update_time();
        return cp;
    }
    
   public ArrayList<CarProfile> getfirstaval()//CarProfile getFirstAvail()
   {
       
       ArrayList<CarProfile> carProfiles = new ArrayList<>();
       for(CarProfile a : carProfileHistory)
       {
           if((a.isAvail_not()==true))
           {
               carProfiles.add(a);
               break;
           }   
       }
       return carProfiles;
   }
   
    public ArrayList<CarProfile> getallAvail()
   {
       ArrayList<CarProfile> carProfiles = new ArrayList<>();
       for(CarProfile a : carProfileHistory)
       {
           if(a.isAvail_not()==true)
               carProfiles.add(a);               
       }
       return carProfiles;
   }
     
     
             
    public ArrayList<CarProfile> getMadeCar(String Companys)
   {
       ArrayList<CarProfile> carProfiles = new ArrayList<>();
       for(CarProfile a : carProfileHistory)
       {
           if(a.getManufacturer().equalsIgnoreCase(Companys))
               carProfiles.add(a);
       }
       return carProfiles;
   }
    
    public ArrayList<CarProfile> getMadeYear(int year)
    {
        ArrayList<CarProfile> carProfiles = new ArrayList<>();
        for(CarProfile a : carProfileHistory)
        {
            if(a.getManufacture_yr()==year)
                carProfiles.add(a);
        }
        return carProfiles;
    }
    
    public ArrayList<CarProfile> getCarNumber(String N)
    {
        ArrayList<CarProfile> carProfiles = new ArrayList<>();
        for(CarProfile a: carProfileHistory)
        {
            if(a.getCar_no().equalsIgnoreCase(N))
                carProfiles.add(a);
            
        }
        return carProfiles;
    }
    
    public ArrayList<CarProfile> getCarName(String name)
    {
        ArrayList<CarProfile> carProfiles = new ArrayList<>();
        for(CarProfile a: carProfileHistory)
        {
            if(a.getCar_name().equalsIgnoreCase(name))
            {
                carProfiles.add(a);
            }
        }
        return carProfiles;
    }
    
    public ArrayList<CarProfile> getCarSeats(int min, int max)
    {
        ArrayList<CarProfile> carProfiles = new ArrayList<>();
        for(CarProfile a: carProfileHistory)
        {
            if((a.getSeats()>min)&&(a.getSeats()<max))
            {
                carProfiles.add(a);
            }
                
            
        }
        return carProfiles;
    }  
    
    public void readFile() throws FileNotFoundException
    {
        String pathcsv = "/Users/ajaygoel/Documents/NEU/Lab_AED_14_01_2018/LIST_PROFILES.CSV";
       
    
        Scanner scanner = new Scanner(new File(pathcsv));
        while (scanner.hasNextLine()) 
        {
        String line = scanner.nextLine();
        String[] csvArray = line.split(",");
        addCarToUber(csvArray);   
        }
    }
    
     public void addCarToUber(String[] car_data)
    {
        CarProfile cp = new CarProfile();
        carProfileHistory.add(cp);
        
        cp.setManufacturer(car_data[0]);
        cp.setManufacture_yr(Integer.parseInt(car_data[1]));
        cp.setSeats(Integer.parseInt(car_data[2]));
        cp.setAvail_not(Boolean.valueOf(car_data[3]));
        cp.setCar_name(car_data[4]);
        cp.setCar_no(car_data[5]);
        cp.setChasis_no(car_data[6]);
        cp.setMob_no(Integer.parseInt(car_data[7]));
        cp.setColor(car_data[8]);
        
        
    }
     
     public String update_time()
     {
         String returntime = null;
         DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH.mm.ss");
         LocalDateTime localtime = LocalDateTime.now();
         returntime = timeformatter.format(localtime);
         return returntime;
         
     }
     
}
