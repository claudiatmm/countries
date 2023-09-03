package core;

import java.util.ArrayList;

public class FileOperation {



    public static Country readCountry(ArrayList<Country> countries, String country){
        for(Country country1 : countries){
            if (country1.countryName.equals(country))
                return country1;
        }
        return null;
    }


}
