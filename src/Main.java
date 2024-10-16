public class Main {
    public static void main(String[] args) {
        Handler carHandler = new CarAvailabilityHandler();
        Handler balanceHandler = new BalanceHandler();
        Handler locationHandler = new LocationHandler();

        carHandler.setNext(balanceHandler).setNext(locationHandler);

        Request request = new Request(true, 500, 100, true);
        carHandler.handle(request);
    }
}
