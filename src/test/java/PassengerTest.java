import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    Flight flight;

    @BeforeEach
    public void setUp(){
        this.passenger = new Passenger("Khatija", 12345678, "abcdef");
        this.flight = new Flight(2468, "Los Angeles", "London");

    }

    @Test
    public void canCreateBooking(){
        passenger.createBooking(flight);
        assertThat(flight.getPassengers().size()).isEqualTo(1);


    }







}
