package Train_package;

public class Train
{
    private String Destination;
    private int TrainNumber;
    private int ShippingTime;

    private int NumberOfSeatsCompartment;
    private int NumberOfSeatsPlaceCard;
    private int NumberOfSeatsSuite;
    private int NumberOfSeatsGeneral;




    public Train(String Destination, int TrainNumber, int ShippingTime, int NumberOfSeatsGeneral, int NumberOfSeatsCompartment, int NumberOfSeatsPlaceCard, int NumberOfSeatsSuite) {
        this.Destination = Destination;
        this.TrainNumber = TrainNumber;
        this.ShippingTime = ShippingTime;
        this.NumberOfSeatsGeneral = NumberOfSeatsGeneral;
        this.NumberOfSeatsCompartment = NumberOfSeatsCompartment;
        this.NumberOfSeatsPlaceCard = NumberOfSeatsPlaceCard;
        this.NumberOfSeatsSuite = NumberOfSeatsSuite;
    }


    public String getDestination() {
        return Destination;
    }

    public void Destination(String Destination) {

        this.Destination = Destination;
    }

    public int getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(int TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    public int getShippingTime() {
        return ShippingTime;
    }

    public void setShippingTime(int ShippingTime) {
        this.ShippingTime = ShippingTime;
    }




    public int NumberOfSeatsGeneral() {
        return NumberOfSeatsGeneral;
    }

    public void setNumberOfSeatsGeneral(int NumberOfSeatsGeneral) {
        this.NumberOfSeatsGeneral = NumberOfSeatsGeneral;
    }
    public int getNumberOfSeatsCompartment() {
        return NumberOfSeatsCompartment;
    }

    public void setNumberOfSeatsCompartment(int NumberOfSeatsCompartment) {
        this.NumberOfSeatsCompartment = NumberOfSeatsCompartment;
    }
    public int getNumberOfSeatsPlaceCard() {
        return NumberOfSeatsPlaceCard;
    }

    public void setNumberOfSeatsPlaceCard(int NumberOfSeatsPlaceCard) {
        this.NumberOfSeatsPlaceCard = NumberOfSeatsPlaceCard;
    }

    public int getNumberOfSeatsSuite() {
        return NumberOfSeatsSuite;
    }

    public void setNumberOfSeatsSuite(int NumberOfSeatsSuite) {
        this.NumberOfSeatsSuite = NumberOfSeatsSuite;
    }

    public String toString()
    {
        return

                "Train {" + "Destination = "+  Destination +
                        ", TrainNumber =" + TrainNumber +
                        '\'' + ", ShippingTime = " + ShippingTime +
                        '\'' + ", NumberOfSeatsGeneral = " + NumberOfSeatsGeneral +
                        ", NumberOfSeatsCompartment = " + NumberOfSeatsCompartment +
                        ", NumberOfSeatsPlaceCard = " + NumberOfSeatsPlaceCard +
                        ", NumberOfSeatsSuite = " + NumberOfSeatsSuite + '}';

    }

}
