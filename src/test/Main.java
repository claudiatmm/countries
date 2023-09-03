package test;

import core.Country;
import core.FileOperation;
import core.MyExceptionClass;
import core.ReadFromFile;
import data.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static core.ReadFromFile.readCountry;
import static core.ReadFromFile.readFromFile;

public class Main {
    public static void main(String[] args) throws IOException {


        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please insert your username with caps look");
            User user = User.valueOf(scan.next());
            ArrayList<Country> countries = readCountry(user);
            System.out.println("aici e user" + countries);


            System.out.println("here is your country " + FileOperation.readCountry(countries, "Iran"));

        } catch (MyExceptionClass e) {
            e.printStackTrace();
        }

//        Country country;
//        country.getCityName();
//        Country country1 = new Country();
//        country1.getCityName();

    }
}
