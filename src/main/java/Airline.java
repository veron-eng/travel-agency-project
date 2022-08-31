import java.util.ArrayList;

public class Airline {

    private String airline;
    private ArrayList<Flight> flights;

        public Airline(String airline) {
        this.airline = airline;
        this.flights = new ArrayList<>();
    }

    //Methods
    public void addFlight(Flight flight){
            flights.add(flight);
    }

    public void cancelFlight(Flight flight){
            flights.remove(flight);
    }


    //Getters and setters
    public String getAirlineName() {
        return airline;
    }

    public void setAirlineName(String airlineName) {
        this.airline = airlineName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}