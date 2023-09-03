package core;

public class Country {


    public int id;
    public String cityName;
    public String countryName;
    public String population;
    public int surface;


    public Country(int id, String cityName, String countryName, String population, int surface) {
        this.id = id;
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
        this.surface = surface;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", city=" + cityName +
                ", country=" + countryName +
                ", population=" + population +
                ", surface=" + surface +
                '}';
    }


}
