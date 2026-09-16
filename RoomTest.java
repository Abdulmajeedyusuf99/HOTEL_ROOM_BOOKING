import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    RoomBooking room1 = new RoomBooking(101,"Single",10000.00,true);
    RoomBooking room2 = new RoomBooking(102,"Double",15000.00,true);
    RoomBooking room3 = new RoomBooking(201,"Deluxe",25000.00,true);
    RoomBooking room4 = new RoomBooking(202,"Suite",40000.00,true);
    @Test
    public void checkForAvailableRooms() {
        room1.isAvailable();
        room2.isAvailable();
        room3.isAvailable();
        room4.isAvailable();
        assertTrue(room1.isAvailable());
        assertTrue(room2.isAvailable());
        assertTrue(room3.isAvailable());
        assertTrue(room4.isAvailable());

    }
    @Test
    public void bookRoom(){
        room1.setRoomNumber(101);
        room2.isAvailable();
        assertEquals(101,room1.getRoomNumber());
        assertTrue(room1.isAvailable());

    }
    @Test

    public void cancelBookings() {
        room1.setRoomNumber(101);
        room1.cancelBookedRoom(true);

        assertEquals(101, room1.getRoomNumber());
        assertFalse(room1.isAvailable());



    }
    @Test
    public void viewRoomDetails() {
       room1.setRoomNumber(101);
       room1.setRoomType("Single");
       room1.setPrice(10000.00);
       assertEquals(101,room1.getRoomNumber());
       assertEquals("Single",room1.getRoomType());
       assertEquals(10000.00,room1.getPrice(),0.00);
       String status =  room1.roomStatus();
       assertEquals("Available",status);
    }
}
