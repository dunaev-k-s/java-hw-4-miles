public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCostRub = 10_000;
        int milesStepRub = 20;
        int miles = service.calculate(ticketCostRub, milesStepRub);
        System.out.println("Miles = " + miles);
    }
}