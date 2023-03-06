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
            System.out.println("Add = 1, GetList = 2, Exit = 3");
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
        System.out.println("DestinationName = ");
        String destination = scanner.nextLine();
        System.out.println("TrainNumber = ");
        int trainNumber = scanner.nextInt();
        System.out.println("ShippingTime = ");
        LocalTime shippingTime = addAndSearchTime();
        System.out.println("NumberOfSeatsCompartment = ");
        int numberOfSeatsCompartment = scanner.nextInt();
        System.out.println("NumberOfSeatsPlaceCard = ");
        int numberOfSeatsPlaceCard = scanner.nextInt();
        System.out.println("NumberOfSeatsSuite = ");
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
        System.out.println("SearchDestination = 1, SearchTime = 2,SearchGeneral = 3");
        Scanner scanner = new Scanner(System.in);
        int option3 = scanner.nextInt();
        scanner.nextLine();
        switch (option3)
        {
            case(1):
                optionSearchDestination();
                break;
            case(2):
                optionSearchTime();
                break;
            case(3):
                optionSearchGeneral();
                break;
        }
    }
    public LocalTime addAndSearchTime() {
        Scanner scanner = new Scanner(System.in);
        String shippingTimeInput = scanner.nextLine();
        String[] partsTime = shippingTimeInput.split(":");
        int timeHour = Integer.parseInt(partsTime[0]);
        int timeMinute = Integer.parseInt(partsTime[1]);
        LocalTime shippingTimeFinal = LocalTime.of(timeHour, timeMinute);
        return shippingTimeFinal;
    }
    public  String SearchDestination() {
        System.out.println("SearchDestination = ");
        Scanner k = new Scanner(System.in);
        String optionDestination = k.nextLine();
        return optionDestination;
    }

    public  void optionSearchDestination() {
        String SeaDes = SearchDestination();
        for(int i = 0; i < trainList.size(); i++) {

            if (trainList.get(i).getDestination().contains(SeaDes))
            {
                System.out.println(trainList.get(i).toString());
            }
        }
    }
    public void optionSearchTime() {
        String SeaDes = SearchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" SearchTime = ");
         LocalTime optionTime = addAndSearchTime();
        for(int i = 0; i < trainList.size(); i++) {
            if( trainList.get(i).getDestination().contains(SeaDes) && trainList.get(i).getShippingTime().equals(optionTime))
            {

                    System.out.println(trainList.get(i).toString());
            }

        }
         return;
    }
    public  void optionSearchGeneral() {
        String SeaDes = SearchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" SearchGeneral = ");
        int optionGeneral = s.nextInt();
        for(int i = 0; i < trainList.size(); i++) {
            if(trainList.get(i).getDestination().equals(SeaDes) & trainList.get(i).getNumberOfSeatsGeneral() == optionGeneral)
            {
                System.out.println(trainList.get(i).toString());
            }
        }
    }

}




