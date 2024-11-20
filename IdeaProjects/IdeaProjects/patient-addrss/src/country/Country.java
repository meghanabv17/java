package country;

import com.xworkz.patientdetails.state.State;

public class Country {

    String countryName;
    public State state;
    public Country(String countryName){
        this.countryName = countryName;
    }

    public void getCountryDetails(){
        System.out.println("The country name is: "+this.countryName);
        state.getStateDetails();
    }
}
