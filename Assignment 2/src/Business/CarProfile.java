/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ajaygoel
 */
public class CarProfile {
    private String manufacturer;
    private String car_name;
    private int manufacture_yr;
    private int mob_no;
    private int seats;
    private String chasis_no;
    private String maintenance_date;
    private String color;
    private String car_no;
    private boolean avail_not;
    private String profile_image;

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getManufacture_yr() {
        return manufacture_yr;
    }

    public void setManufacture_yr(int manufacture_yr) {
        this.manufacture_yr = manufacture_yr;
    }

    public int getMob_no() {
        return mob_no;
    }

    public void setMob_no(int mob_no) {
        this.mob_no = mob_no;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getChasis_no() {
        return chasis_no;
    }

    public void setChasis_no(String chasis_no) {
        this.chasis_no = chasis_no;
    }

    public String getMaintenance_date() {
        return maintenance_date;
    }

    public void setMaintenance_date(String maintenance_date) {
        this.maintenance_date = maintenance_date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar_no() {
        return car_no;
    }

    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }

    public boolean isAvail_not() {
        return avail_not;
    }

    public void setAvail_not(boolean avail_not) {
        this.avail_not = avail_not;
    }

   
    
    @Override
    public String toString()
    {
      return this.car_name;  
    }
    
}
