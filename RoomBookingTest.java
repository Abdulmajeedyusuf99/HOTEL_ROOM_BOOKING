public class RoomBookingTest {
    public static void main(String[] args) {
        RoomBooking roomBooking1 = new RoomBooking(101,"Single",10000,true);
        RoomBooking roomBooking2 = new RoomBooking(102,"Double",15000,true);
        RoomBooking roomBooking3 = new RoomBooking(201,"Deluxe",25000,true);
        RoomBooking roomBooking4 = new RoomBooking(202,"Suite",40000,true);
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num = 0;
        int nights =0;
        while (num !=5){
            System.out.println("===HOTEL MENU===");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Room Details");
            System.out.println("5. Exit");

            num = input.nextInt();
            switch (num){
                case 1:
                    System.out.println("Available Rooms");
                    if(roomBooking1.isAvailable()) {
                        System.out.println(roomBooking1.getRoomNumber() + "," + roomBooking1.getRoomType());
                    }
                    if(roomBooking2.isAvailable()) {
                        System.out.println(roomBooking2.getRoomNumber() + "," + roomBooking2.getRoomType());
                    }
                    if(roomBooking3.isAvailable()) {
                        System.out.println(roomBooking3.getRoomNumber() + "," + roomBooking3.getRoomType());
                    }
                    if(roomBooking4.isAvailable()) {
                        System.out.println(roomBooking4.getRoomNumber() + "," + roomBooking4.getRoomType());
                    }
                    break;
                case 2:
                    System.out.println("Enter Room Number: ");
                    num = input.nextInt();
                    if(roomBooking1.getRoomNumber() == num){
                       if(roomBooking1.isAvailable()){
                           System.out.println("Room "+roomBooking1.getRoomNumber()+" is Available");

                           System.out.println("Enter the number of nights you want to book: ");
                           nights = input.nextInt();

                           System.out.print("Enter Yes to book or No to Cancel: ");
                           String book = input.next();
                           if(book.equalsIgnoreCase("Yes")){
                               System.out.println("Room " +roomBooking1.getRoomNumber()+" Booked Successfully");
                               roomBooking1.setIsAvailable(false);

                               System.out.println("Room type: "+roomBooking1.getRoomType() );
                               System.out.println("Price: "+ roomBooking1.getPrice());
                               System.out.println("number of the night: "+ nights);
                               System.out.println("Total amount to pay: "+(roomBooking1.getPrice()*nights));
                               System.out.println();
                           }
                           else if(book.equalsIgnoreCase("No")){
                               roomBooking1.setIsAvailable(true);
                           }


                       }
                       else{
                           System.out.println("Room Number is already booked");
                       }

                    } else if (roomBooking2.getRoomNumber()== num){
                        if(roomBooking2.isAvailable()){
                            System.out.println("Room is Available");
                            System.out.print("Enter Yes to book or No to Cancel: ");
                            String book = input.next();
                            if(book.equalsIgnoreCase("Yes")){
                                System.out.println("Room " +roomBooking2.getRoomNumber()+" Booked Successfully");
                                roomBooking2.setIsAvailable(false);

                                System.out.println("Room type: "+roomBooking2.getRoomType() );
                                System.out.println("Price: "+ roomBooking2.getPrice());
                                System.out.println("number of the night: "+ nights);
                                System.out.println("Total amount to pay: "+(roomBooking2.getPrice()*nights));
                                System.out.println();
                            }
                            else if(book.equalsIgnoreCase("No")){
                                roomBooking2.setIsAvailable(true);
                            }

                        }
                        else {
                            System.out.println("Room is already booked");
                        }

                    }
                    else if (roomBooking3.getRoomNumber()== num){
                        if(roomBooking3.isAvailable()){
                            System.out.println("Room "+roomBooking3.getRoomNumber()+ " is Available");
                            System.out.print("Enter Yes to book or No to Cancel: ");
                            String book = input.next();
                            if(book.equalsIgnoreCase("Yes")){
                                System.out.println("Room " +roomBooking3.getRoomNumber()+" Booked Successfully");
                                roomBooking3.setIsAvailable(false);

                                System.out.println("Room type: "+roomBooking2.getRoomType() );
                                System.out.println("Price: "+ roomBooking2.getPrice());
                                System.out.println("number of the night: "+ nights);
                                System.out.println("Total amount to pay: "+(roomBooking2.getPrice()*nights));
                                System.out.println();
                            }
                            else if(book.equalsIgnoreCase("No")){
                                roomBooking3.setIsAvailable(true);
                            }
                        }
                        else {
                            System.out.println("Room is already booked");
                        }
                    }else if (roomBooking4.getRoomNumber()== num){
                        if(roomBooking4.isAvailable()){
                            System.out.println("Room "+roomBooking4.getRoomNumber()+ " is Available");
                            System.out.print("Enter Yes to book or No to Cancel: ");
                            String book = input.next();
                            if(book.equalsIgnoreCase("Yes")){
                                System.out.println("Room " +roomBooking4.getRoomNumber()+" Booked Successfully");
                                roomBooking4.setIsAvailable(false);

                                System.out.println("Room type: "+roomBooking2.getRoomType() );
                                System.out.println("Price: "+ roomBooking2.getPrice());
                                System.out.println("number of the night: "+ nights);
                                System.out.println("Total amount to pay: "+(roomBooking2.getPrice()*nights));
                                System.out.println();
                            }
                            else if(book.equalsIgnoreCase("No")){
                                roomBooking4.setIsAvailable(true);
                            }
                        }
                    }else{
                        System.out.println("Invalid Room Number");
                    }

                    break;
                case 3:
                    if(!roomBooking1.isAvailable()){
                        System.out.println("Enter Room Number: ");
                        num = input.nextInt();
                        if(roomBooking1.getRoomNumber() == num){
                            if(!roomBooking1.isAvailable()){
                                System.out.println("Cancel Booking for Room "+roomBooking1.getRoomNumber()+":");
                                String cancel = input.next();
                                if(cancel.equalsIgnoreCase("Yes")){
                                    roomBooking1.setIsAvailable(true);
                                    System.out.println("Room "+roomBooking1.getRoomNumber()+" have been cancelled");
                                }
                            }
                        }

                    }
                    else {
                        System.out.println(roomBooking1.getRoomNumber()+" has not been booked");
                    }
                    if(!roomBooking2.isAvailable()){
                        System.out.println("Enter Room Number: ");
                        num = input.nextInt();
                        if(roomBooking2.getRoomNumber() == num){
                            if(!roomBooking2.isAvailable()){
                                System.out.println("Cancel Booking for Room "+roomBooking2.getRoomNumber()+":");
                                String cancel = input.next();
                                if(cancel.equalsIgnoreCase("Yes")){
                                    roomBooking2.setIsAvailable(true);
                                    System.out.println("Room "+roomBooking2.getRoomNumber()+" have been cancelled");
                                }
                            }


                        }

                    }else {
                        System.out.println(roomBooking2.getRoomNumber()+" has not been booked");
                    }
                    if(!roomBooking3.isAvailable()){
                        System.out.println("Enter Room Number: ");
                        num = input.nextInt();
                        if(roomBooking3.getRoomNumber() == num){
                            if(!roomBooking3.isAvailable()){
                                System.out.println("Cancel Booking for Room "+roomBooking3.getRoomNumber()+":");
                                String cancel = input.next();
                                if(cancel.equalsIgnoreCase("Yes")){
                                    roomBooking3.setIsAvailable(true);
                                    System.out.println("Room "+roomBooking3.getRoomNumber()+" have been cancelled");
                                }
                            }


                        }

                    }else {
                        System.out.println(roomBooking3.getRoomNumber()+" has not been booked");
                    }
                    if(!roomBooking4.isAvailable()){
                        System.out.println("Enter Room Number: ");
                        num = input.nextInt();
                        if(roomBooking4.getRoomNumber() == num){
                            if(!roomBooking4.isAvailable()){
                                System.out.println("Cancel Booking for Room "+roomBooking4.getRoomNumber()+":");
                                String cancel = input.next();
                                if(cancel.equalsIgnoreCase("Yes")){
                                    roomBooking4.setIsAvailable(true);
                                    System.out.println("Room "+roomBooking4.getRoomNumber()+" have been cancelled");
                                }
                            }


                        }

                    }else {
                        System.out.println(roomBooking4.getRoomNumber()+" has not been booked");
                    }


                    break;
                case 4:
                    System.out.println("Enter Room Number: ");
                    num = input.nextInt();
                    if(roomBooking1.getRoomNumber() == num){
                        System.out.println("Room Number  Room Type   Price       Status");
                        System.out.println();
                        System.out.print(roomBooking1.getRoomNumber()+ "\t\t\t "+ roomBooking1.getRoomType()+ "\t\t"+ roomBooking1.getPrice()+ "\t\t");
                        System.out.println(roomBooking1.roomStatus());
                    } else if (roomBooking2.getRoomNumber() == num){
                        System.out.println("Room Number  Room Type   Price       Status");
                        System.out.println();
                        System.out.print(roomBooking2.getRoomNumber()+ "\t\t\t "+ roomBooking2.getRoomType()+ "\t\t"+ roomBooking2.getPrice()+ "\t\t");
                        System.out.println(roomBooking2.roomStatus());

                    }
                    else if (roomBooking3.getRoomNumber() == num){
                        System.out.println("Room Number  Room Type   Price       Status");
                        System.out.println();
                        System.out.print(roomBooking3.getRoomNumber()+ "\t\t\t "+ roomBooking3.getRoomType()+ "\t\t"+ roomBooking3.getPrice()+ "\t\t");
                        System.out.println(roomBooking3.roomStatus());
                    }
                    else if(roomBooking4.getRoomNumber() == num) {
                        System.out.println("Room Number  Room Type   Price       Status");
                        System.out.println();
                        System.out.print(roomBooking4.getRoomNumber()+ "\t\t\t "+ roomBooking4.getRoomType()+ "\t\t"+ roomBooking4.getPrice()+ "\t\t");
                        System.out.println(roomBooking4.roomStatus());
                    }
                    else {
                        System.out.println("Invalid Room Number");
                    }
                   break;
                case 5:
                    System.out.println("Thank you for using our hotel");
                    break;
                default:
                    System.out.println("Invalid  Option");
                    break;
            }

            if(num == 5){
                break;
            }


        }


    }
}
