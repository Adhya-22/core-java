package com.xworkz.country;

public class CountryStore
{
    Country[] countries;
    int currentIndex=0;

    public CountryStore(Country[] countries)
    {
        this.countries = countries;
    }

    public void save(Country country)
    {
        if(countries!=null)
        {
            int index=countries.length-1;
            if(currentIndex<=index)
            {
                this.countries[this.currentIndex]=country;
                this.currentIndex++;
                System.out.println("Stored");
            }
        }
        else
        {
            System.out.println("Reference cannot be null");
        }
    }

    public Country findByName(String name)
    {
        if(name!=null)
        {
            for(Country country:countries)
            {
                if(country!=null && country.name.equals(name))
                {
                    return country;
                }
            }
        }
        else
        {
            System.out.println("Name cannot be null");
        }
        return null;
    }

    public State findStateByStateName(String name)
    {
        if (name != null)
        {
            for(Country country:countries)
            {
                if(country!=null && country.states!=null)
                {
                    for(State state:country.states)
                    {
                        if(state!=null && state.name.equals(name))
                        {
                            return state;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("State name cannot be null");
        }
        return null;
    }

    public City[] findAllCityByStateName(String stateName)
    {
        if(stateName!=null)
        {
            for(Country country:countries)
            {
                if(country!=null && country.states!=null)
                {
                    for(State state:country.states)
                    {
                        if(state!=null && state.name.equals(stateName) && state.cities!=null)
                        {
                            return state.cities;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("StateName cannot be null");
        }
        return null;
    }

    public int findNoOfDistrictsByCityName(String cityName)
    {
        if(cityName!=null)
        {
            for(Country country:countries)
            {
                if(country!=null && country.states!=null)
                {
                    for(State state:country.states)
                    {
                        if(state!=null && state.cities!=null)
                        {
                            for(City city:state.cities)
                            {
                                if(city!=null && city.name.equals(cityName))
                                {
                                    return city.noOfDistricts;
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("City name cannot be null");
        }
        return 0;
    }

    public Country findByCollectorName(String collectorName)
    {
        if(collectorName!=null)
        {
            for(Country country:countries)
            {
                if(country!=null && country.states!=null)
                {
                    for(State state:country.states)
                    {
                        if(state!=null && state.cities!=null)
                        {
                            for(City city:state.cities)
                            {
                                if(city!=null && city.districts!=null)
                                {
                                    for(District district:city.districts)
                                    {
                                        if(district!=null && district.collector!=null && district.collector.name.equals(collectorName))
                                        {
                                            return country;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Collector name cannot be null");
        }
        return null;
    }
}
