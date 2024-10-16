class CarAvailabilityHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isCarAvailable()) {
            System.out.println("Car is available.");
            if (next != null) {
                next.handle(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}

class BalanceHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getBalance() >= request.getCost()) {
            System.out.println("Balance is sufficient.");
            if (next != null) {
                next.handle(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class LocationHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isLocationValid()) {
            System.out.println("Location is valid. Processing request.");
        } else {
            System.out.println("Invalid location.");
        }
    }
}
