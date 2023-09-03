package core;

import data.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {



    static String pathCSVfileNord= System.getProperty("user.dir") + "\\src\\data\\Nord.csv";
    static String pathCSVfileSud= System.getProperty("user.dir") + "\\src\\data\\Sud.csv";
    static String pathCSVfileVest= System.getProperty("user.dir") + "\\src\\data\\Vest.csv";


   public static ArrayList<Country> readCountry(User user) throws MyExceptionClass, IOException {
       if(user.equals(User.USER1)){
           return readFromFile(pathCSVfileNord);
       }
       else if (user.equals(User.USER2)){
           return readFromFile(pathCSVfileSud);
       }
       else if (user.equals(User.USER3)){
           return readFromFile(pathCSVfileVest);
       }
       else throw new MyExceptionClass("User name is not in the user File, Try another one");
   }


    public static ArrayList<Country> readFromFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        bufferedReader.readLine();

        String line;
        Country country = null;
        ArrayList<Country> listWithAllCountries = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null){
            String[] splitAfterSpace = line.split("\\s+");
            String concat = "";

            for (int i = 2; i < splitAfterSpace.length-2; i++){
                if (concat.isEmpty())
                    concat = concat+""+ splitAfterSpace[i];

                else concat= concat+" "+ splitAfterSpace[i];
            }

            String number = splitAfterSpace[splitAfterSpace.length-2].replace(",", ".");
            country = new Country(Integer.parseInt(splitAfterSpace[0]), String.valueOf(splitAfterSpace[1]),
                    concat, number, Integer.parseInt(splitAfterSpace[splitAfterSpace.length-1]));
            listWithAllCountries.add(country);
        }
        return listWithAllCountries;
    }





}
