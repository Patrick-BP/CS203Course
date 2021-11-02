package Question1;

public class City implements Comparable<City> {
    private String cityName;
    private double temperature;

    public City() {
        this.cityName ="unknown";
        this.temperature = 60.5;
    }

    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return cityName +" : "+temperature + " degree";
    }

    @Override
    public int compareTo(City o) {
        if(this.temperature < o.temperature) return -1;
        if(this.temperature > o.temperature) return 1;
        return 0;
    }
}
