class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int victories;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.getNumberOfVictories(), getNumberOfVictories());
    }
}
