
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        int todays = getToday();
        birdsPerDay[birdsPerDay.length - 1] = todays + 1;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for (int j : birdsPerDay) {
            if (j == 0) {
                return true;
            }
        }
        return false;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int count = 0;
        for (int visits: birdsPerDay) {
            if (visits >= 5) {
                count++;
            }
        }
        return count;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
