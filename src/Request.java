class Request {
    private boolean carAvailable;
    private double balance;
    private double cost;
    private boolean locationValid;

    public Request(boolean carAvailable, double balance, double cost, boolean locationValid) {
        this.carAvailable = carAvailable;
        this.balance = balance;
        this.cost = cost;
        this.locationValid = locationValid;
    }

    public boolean isCarAvailable() { return carAvailable; }
    public double getBalance() { return balance; }
    public double getCost() { return cost; }
    public boolean isLocationValid() { return locationValid; }
}
