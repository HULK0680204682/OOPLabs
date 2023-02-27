package Main_package;
import Train_package.Train;

//import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   private ArrayList<Train> trainList = new ArrayList<>();
   public static void main(String[] args)
    {
        Main m = new Main();
        //boolean isActive = true;
        while (true)
        {
            System.out.println("Add = 1, GetList = 2, Exit = 3");
            Scanner s = new Scanner(System.in);
            int operation = s.nextInt();

            switch (operation){
                case (1):
                    m.addTrain();
                    break;
                case(2):
                    m.getTrainList();
                    break;
                case(3):
                    System.exit(1);
                    break;

            }

        }


    }
    private void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DestinationName = ");
        String Destination = scanner.nextLine();
        System.out.println("\nTrainNumber = ");
        int TrainNumber = scanner.nextInt();
        System.out.println("\nShippingTime = ");
        int ShippingTime = scanner.nextInt();
        System.out.println("\nNumberOfSeatsCompartment = ");
        int NumberOfSeatsCompartment = scanner.nextInt();
        System.out.println("\nNumberOfSeatsPlaceCard = ");
        int NumberOfSeatsPlaceCard = scanner.nextInt();
        System.out.println("\nNumberOfSeatsSuite = ");
        int NumberOfSeatsSuite = scanner.nextInt();
        // System.out.println("\nNumberOfSeatsGeneral = ");
        // int NumberOfSeatsGeneral = scanner.nextInt();
        int NumberOfSeatsGeneral = NumberOfSeatsCompartment + NumberOfSeatsPlaceCard + NumberOfSeatsSuite;
        trainList.add(new Train(Destination, TrainNumber, ShippingTime, NumberOfSeatsGeneral, NumberOfSeatsCompartment, NumberOfSeatsPlaceCard,NumberOfSeatsSuite));
    }
    private  void getTrainList(){

        Scanner s = new Scanner(System.in);
        System.out.println("List = 1, Search = 2");
        int operation2 = s.nextInt();
       if (operation2==1) {
           for (int i = 0; i < trainList.size(); i++) {
               System.out.println(trainList.get(i).toString());
           }
       }
           if (operation2 == 2) {
               oper2();
           }
    }
    public void oper2()
    {
        System.out.println("SearchDestination = 1, SearchTime = 2,SearchGeneral = 3");
        Scanner scanner = new Scanner(System.in);
        int option3 = scanner.nextInt();
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
    public  String SearchDestination()
    {
        System.out.println("SearchDestination = ");
        Scanner k = new Scanner(System.in);
        String optionDestination = k.nextLine();
        return optionDestination;
    }
    public  void optionSearchDestination()
    {
        String SeaDes = SearchDestination();
        for(int i = 0; i < trainList.size(); i++) {

            if (trainList.get(i).getDestination().contains(SeaDes))
            {
                System.out.println(trainList.get(i).toString());
            }
        }
        return;
    }
    public void optionSearchTime()
    {
        String SeaDes = SearchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" SearchTime = ");
         int optionTime = s.nextInt();
        for(int i = 0; i < trainList.size(); i++) {
            if( trainList.get(i).getDestination().contains(SeaDes) && trainList.get(i).getShippingTime() == optionTime)
            {

                    System.out.println(trainList.get(i).toString());
            }

        }
         return;
    }
    public  void optionSearchGeneral()
    {
        String SeaDes = SearchDestination();
        Scanner s = new Scanner(System.in);
        System.out.println(" SearchGeneral = ");
        int optionGeneral = s.nextInt();
        for(int i = 0; i < trainList.size(); i++) {
            if(trainList.get(i).getDestination().equals(SeaDes) & trainList.get(i).NumberOfSeatsGeneral() == optionGeneral)
            {
                System.out.println(trainList.get(i).toString());
            }
        }
    }

}




