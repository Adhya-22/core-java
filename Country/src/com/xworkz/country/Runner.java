package com.xworkz.country;

public class Runner
{
    public static void main(String[] args)
    {
        Collector collector1 = new Collector("Ravi", 2010);
        Collector collector2 = new Collector("Sita", 2012);

        District district1 = new District("Bangalore Urban", collector1);
        District district2 = new District("Bangalore Rural", collector2);

        District[] districts1 = {district1, district2};

        City city1 = new City("Bangalore", 2, districts1);

        /// //////////////////////////////////////////////////////////////////

        Collector collector3 = new Collector("Arjun", 2015);
        District d3 = new District("Shivamogga", collector3 );
        District[] districts2 = {d3};

        City city2 = new City("Shivamogga", 1, districts2);

        /// //////////////////////////////////////////////////////////////////

        City[] cities1 = {city1, city2};

        State state1 = new State("Karnataka", 60000000L, cities1);

        State[] states1 = {state1};

        Address address1 = new Address(101, 560001, state1);

        President president1 = new President("Droupadi Murmu", 68, address1);

        Country country1 = new Country("India", president1, states1);

        Country[] countryArray = new Country[10];
        CountryStore countryStore = new CountryStore(countryArray);

        /// //////////////////////////////////////////////////////////////

        countryStore.save(country1);

        Country resultedCountry=countryStore.findByName("India");
        System.out.println(resultedCountry);


        State resultedState=countryStore.findStateByStateName("Karnataka");
        System.out.println(resultedState);

        City[] resultCities = countryStore.findAllCityByStateName("Karnataka");
        if(resultCities != null)
        {
            for(City city : resultCities)
            {
                System.out.println(city);
            }
        }

        int noOfDistricts=countryStore.findNoOfDistrictsByCityName("Bangalore");
        System.out.println("No of Districts : "+noOfDistricts);

        Country collectorsCountry=countryStore.findByCollectorName("Ravi");
        System.out.println(collectorsCountry);
        }
}
