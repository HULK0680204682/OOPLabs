package Train_package;
import java.time.LocalTime;

public class Train {
    private String destination;
    private int trainNumber;
    private LocalTime shippingTime;
    private int numberOfSeatsCompartment;
    private int numberOfSeatsPlaceCard;
    private int numberOfSeatsSuite;
    private int numberOfSeatsGeneral;

    public Train(String destination, int trainNumber,  LocalTime shippingTime, int numberOfSeatsGeneral, int numberOfSeatsCompartment, int numberOfSeatsPlaceCard, int numberOfSeatsSuite) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.shippingTime = shippingTime;
        this.numberOfSeatsGeneral = numberOfSeatsGeneral;
        this.numberOfSeatsCompartment = numberOfSeatsCompartment;
        this.numberOfSeatsPlaceCard = numberOfSeatsPlaceCard;
        this.numberOfSeatsSuite = numberOfSeatsSuite;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public  LocalTime getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime( LocalTime shippingTime) {
        this.shippingTime = shippingTime;
    }

    public int getNumberOfSeatsGeneral() {
        return numberOfSeatsGeneral;
    }

    public void setNumberOfSeatsGeneral(int numberOfSeatsGeneral) {
        this.numberOfSeatsGeneral = numberOfSeatsGeneral;
    }
    public int getNumberOfSeatsCompartment() {
        return numberOfSeatsCompartment;
    }

    public void setNumberOfSeatsCompartment(int numberOfSeatsCompartment) {
        this.numberOfSeatsCompartment = numberOfSeatsCompartment;
    }
    public int getNumberOfSeatsPlaceCard() {
        return numberOfSeatsPlaceCard;
    }

    public void setNumberOfSeatsPlaceCard(int numberOfSeatsPlaceCard) {
        this.numberOfSeatsPlaceCard = numberOfSeatsPlaceCard;
    }

    public int getNumberOfSeatsSuite() {
        return numberOfSeatsSuite;
    }

    public void setNumberOfSeatsSuite(int numberOfSeatsSuite) {
        this.numberOfSeatsSuite = numberOfSeatsSuite;
    }

    public String toString()
    {
        return

                "Train {" + "Destination = "+  destination +
                        ", TrainNumber =" + trainNumber +
                        '\'' + ", ShippingTime = " + shippingTime +
                        '\'' + ", NumberOfSeatsGeneral = " + numberOfSeatsGeneral +
                        ", NumberOfSeatsCompartment = " + numberOfSeatsCompartment +
                        ", NumberOfSeatsPlaceCard = " + numberOfSeatsPlaceCard +
                        ", NumberOfSeatsSuite = " + numberOfSeatsSuite + '}';
    }

}
