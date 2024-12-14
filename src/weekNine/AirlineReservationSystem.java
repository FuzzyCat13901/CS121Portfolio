package weekNine;

import java.util.Random;

public class AirlineReservationSystem {
    private String firstName;
    private String lastName;
    private String flightNumber;
    private String seatPreference;
    private String classOfTravel;
    private String memberId;
    private int age;
    private int bookingReference;
    private int lastBookingReference = 1000000; //probably a bad way to do this but I'm lazy and this should work for the assignment hopefully

    public AirlineReservationSystem(String memberId, String flightNum, String classOfTravel) {
        this.memberId = memberId;
        this.flightNumber = flightNum;
        this.classOfTravel = classOfTravel;
        this.bookingReference = generateBookingReference();
    }

    public AirlineReservationSystem(String firstName, String lastName, int age, String flightNum, String seatPreference, String classOfTravel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.flightNumber = flightNum;
        this.seatPreference = seatPreference;
        this.classOfTravel = classOfTravel;
        this.bookingReference = generateBookingReference();
    }

    private int generateBookingReference() {
        lastBookingReference++;
        return lastBookingReference;
    }

    public void displayBookingDetails() {
        System.out.println("Thank You For Flying With SkyHigh Airlines!");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Class: " + classOfTravel);
        System.out.println("Seat: " + seatPreference);
        System.out.println("Booking Reference: " + bookingReference);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public String getClassOfTravel() {
        return classOfTravel;
    }

    public void setClassOfTravel(String classOfTravel) {
        this.classOfTravel = classOfTravel;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBookingReference() {
        return bookingReference;
    }

    public static void main(String[] args) {
        AirlineReservationSystem booking = new AirlineReservationSystem("Jane", "Doe", 35, "SQ201", "Aisle", "Economy");

        booking.displayBookingDetails();
    }
}