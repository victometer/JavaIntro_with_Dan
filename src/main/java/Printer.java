public class Printer {
    private int numberOfSheets = 5;
    private int tonerAmount = 4;

    public int checkTray() {
        return numberOfSheets;
    }

    public String print(int pages, int copies) {
        int numberOfPagesToPrint = pages*copies;
        if (numberOfSheets < numberOfPagesToPrint){
            return "Load the tray";
        }else if(numberOfPagesToPrint > tonerAmount) {
           int number = numberOfPagesToPrint -= tonerAmount;

            return String.format("Please load %s", number);
        }
        else{
            tonerAmount -= numberOfPagesToPrint;
            numberOfSheets -= numberOfPagesToPrint;
            return "Done";
        }
    }
}
