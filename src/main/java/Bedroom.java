public class Bedroom extends Room{

    private int roomNumber;

    private RoomType roomType;
    private int nightlyRate;

    public Bedroom(RoomType roomType, int roomNumber, int nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
