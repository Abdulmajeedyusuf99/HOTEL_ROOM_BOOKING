public class RoomBooking {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;


    public RoomBooking(int roomNumber, String roomType, double price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = isAvailable;

    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }
    public double getPrice() {
        return price;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {

        return isAvailable;
    }
    public void roomStatus() {
        if(isAvailable){
            System.out.println("Available");
        }
        else{
            System.out.println("Booked");
        }

    }
}
