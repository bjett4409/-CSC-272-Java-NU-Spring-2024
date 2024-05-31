import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Country {
    private String name;
    private double area;
    private long population;

    public Country(String name, double area, long population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}

class PopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        return Long.compare(c2.getPopulation(), c1.getPopulation());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();
        
        // Adding countries with random order
        countries.add(new Country("India", 2973190, 1428627663));
        countries.add(new Country("China", 9388211, 1425671352));
        countries.add(new Country("United States", 9147420, 339996563));
        countries.add(new Country("Brazil", 8358140, 216422446));
        countries.add(new Country("Russia", 16376870, 144444359));
        countries.add(new Country("Japan", 364555, 123294513));
        countries.add(new Country("France", 547557, 64756584));
        countries.add(new Country("Italy", 294140, 58870762));
        countries.add(new Country("Canada", 9093510, 38781291));
        countries.add(new Country("Colombia", 1109500	, 52085168));
        countries.add(new Country("Australia", 7682300, 26439111));
        countries.add(new Country("Greece", 128900, 10341277));

        System.out.println("Countries before sorting:");
        for (Country country : countries) {
            System.out.println(country);
        }

        Collections.sort(countries, new PopulationComparator());

        System.out.println("\nCountries after sorting by population:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}