package practice_33.city;

import java.util.Objects;

public class City implements Comparable<practice_36.city.City>{
    private String name;
    private int population;
    private int pollution;
    private String postcode;

    public City(String name, int population, int pollution, String postcode) {
        this.name = name;
        this.population = population;
        this.pollution = pollution;
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPollution() {
        return pollution;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name  + "', population=" + population + ", pollution=" + pollution + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        practice_36.city.City city = (practice_36.city.City) o;
        return Objects.equals(name, city.name) && Objects.equals(postcode, city.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postcode);
    }

    @Override
    public int compareTo(practice_36.city.City o) { // City o - это второй объект из сравниваемых, а где первый объект, с которым происходит сравнение?
       // return this.name.compareTo(o.name); // сортируем по именам по алфавиту, таков естественный порядок для этого класса
        return -(this.population - o.population); // сортируем по кол-ву населения и большие города - сверху
    }
}
