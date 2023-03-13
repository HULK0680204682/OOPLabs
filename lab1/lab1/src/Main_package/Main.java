package Main_package;
import Train_package.Train;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   private ArrayList<Train> trainList = new ArrayList<>();
   public static void main(String[] args) {
        Main main = new Main();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Add = 1, Get List = 2, Exit = 3");
            int operation = s.nextInt();
            s.nextLine();
            switch (operation){
                case (1):
                    main.addTrain();
                    break;
                case(2):
                    main.getTrainList();
                    break;
                case(3):
                    System.exit(0);
                    break;
            }
        }

    }

    private void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Destination Name = ");
        String destination = scanner.nextLine();
        System.out.println("Train Number = ");
        int trainNumber = scanner.nextInt();
        System.out.println("Shipping Time = ");
        LocalTime shippingTime = getTime();
        System.out.println("Number of seats Compartment = ");
        int numberOfSeatsCompartment = scanner.nextInt();
        System.out.println("Number of seats PlaceCard = ");
        int numberOfSeatsPlaceCard = scanner.nextInt();
        System.out.println("Number of seats Suite = ");
        int numberOfSeatsSuite = scanner.nextInt();
        int numberOfSeatsGeneral = numberOfSeatsCompartment + numberOfSeatsPlaceCard + numberOfSeatsSuite;
        trainList.add(new Train(destination, trainNumber, shippingTime, numberOfSeatsGeneral, numberOfSeatsCompartment, numberOfSeatsPlaceCard,numberOfSeatsSuite));
    }
    private  void getTrainList(){
        Scanner s = new Scanner(System.in);
        System.out.println("List = 1, Search = 2");
        int operation2 = s.nextInt();
        s.nextLine();
        if (operation2==1) {
           for (int i = 0; i < trainList.size(); i++) {
               System.out.println(trainList.get(i).toString());
           }
       }
           if (operation2 == 2) {
               searchOperation();
           }
    }
    public void searchOperation() {
        System.out.println("Search destination = 1, Search time = 2,Search general = 3");
        Scanner scanner = new Scanner(System.in);
        int searchOption = scanner.nextInt();
        scanner.nextLine();
        switch (searchOption)
        {
            case(1):
                methodSearchDestination();
                break;
            case(2):
                methodSearchTime();
                break;
            case(3):
                methodSearchGeneral();
                break;
        }
    }
    public LocalTime getTime() {
        Scanner scanner = new Scanner(System.in);
        String shippingTimeInput = scanner.nextLine();
        String[] partsTime = shippingTimeInput.split(":");
        int timeHour = Integer.parseInt(partsTime[0]);
        int timeMinute = Integer.parseInt(partsTime[1]);
        LocalTime shippingTimeFinal = LocalTime.of(timeHour, timeMinute);
        return shippingTimeFinal;
    }
    public  String searchDestination() {
        System.out.println("searchDestination = ");
        Scanner k = new Scanner(System.in);
        String optionDestination = k.nextLine();
        return optionDestination;
    }

    public  void methodSearchDestination() {
        String inputDestination = searchDestination();
        for(int i = 0; i < trainList.size(); i++) {

            if (trainList.get(i).getDestination().contains(inputDestination))
            {
                System.out.println(trainList.get(i).toString());
            }
        }
    }
    public void methodSearchTime() {
        String inputDestination = searchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" SearchTime = ");
         LocalTime optionTime = getTime();
        for(int i = 0; i < trainList.size(); i++) {
            if( trainList.get(i).getDestination().contains(inputDestination) && trainList.get(i).getShippingTime().equals(optionTime))
            {

                    System.out.println(trainList.get(i).toString());
            }

        }
         return;
    }
    public  void methodSearchGeneral() {
        String inputDestination = searchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" Search general = ");
        int optionGeneral = s.nextInt();
        for(int i = 0; i < trainList.size(); i++) {
            if(trainList.get(i).getDestination().equals(inputDestination) & trainList.get(i).getNumberOfSeatsGeneral() == optionGeneral)
            {
                System.out.println(trainList.get(i).toString());
            }
        }
    }

}




