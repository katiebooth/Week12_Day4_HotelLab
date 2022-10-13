import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Booking booking;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void addGuestToRoom(Guest guest, Bedroom bedroom){
        if(bedroom.getGuests().size() < bedroom.getRoomCapacity()) {
            bedroom.addGuestToRoom(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        booking = new Booking(bedroom, numberOfNights);
        return booking;
    }



}
