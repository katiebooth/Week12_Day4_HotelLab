public class Booking {

    Bedroom bedroom;
    private int numberOfNightsBooked;

    public Booking(Bedroom bedroom, int numberOfNightsBooked){
        this.numberOfNightsBooked = numberOfNightsBooked;
        this.bedroom = bedroom;
    }

    public int getNumberOfNights(){
        return numberOfNightsBooked;
    }

    public int getBill() {
        return (numberOfNightsBooked * bedroom.getNightlyRate());
    }
}
