package services;

import oop.Location;

public class LocationService {

    public static void main(String[] args){
        Location location = new Location("A1", "105.51", "99.415");


        Location location1 = location.withLatitude("104.51").withLongitude("98.415").withName("B1");

        System.out.println(location);
        System.out.println(location1);

    }


}
