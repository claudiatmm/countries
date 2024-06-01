package test;

import core.Country;
import core.FileOperation;
import core.MyExceptionClass;
import core.ReadFromFile;
import data.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static core.ReadFromFile.readCountry;
import static core.ReadFromFile.readFromFile;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<Country> countries = null;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please insert your username with caps look");
            User user = User.valueOf(scan.next());
            countries = readCountry(user);
            System.out.println("aici e user" + countries);

            System.out.println("here is your country " + FileOperation.readCountry(countries, "Iran"));

        }
        catch (MyExceptionClass e) {
            e.printStackTrace();
        }

//        Country country;
//        country.getCityName();
//        Country country1 = new Country();
//        country1.getCityName();

        //Stream Filter in functie de ID country crescator
        List<Integer> idsCountry = countries.stream().map(Country ::getId).filter(i -> i > 2).collect(Collectors.toList());

        List<Country> idsCountryFilter = countries.stream().filter(i -> i.id >2).collect(Collectors.toList());

        System.out.println("lista cu id's countries: " +idsCountry);
        System.out.println("lista cu id's countries de tipul country: " +idsCountryFilter);

        //Stream in functie de suprafata crescator
        List<Integer> suprafata = countries.stream().map(Country ::getSurface).filter(i -> i>20).collect(Collectors.toList());
        System.out.println("suprafata >20 " +suprafata);
        List<Country> suprafataFilter = countries.stream().filter(i -> i.surface > 150).collect(Collectors.toList());
        System.out.println("suprafata >150 " +suprafataFilter);


    }
}
