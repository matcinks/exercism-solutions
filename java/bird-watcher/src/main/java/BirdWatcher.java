import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
            return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int todaysIndex = birdsPerDay.length - 1;
        birdsPerDay[todaysIndex] = ++birdsPerDay[todaysIndex];
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay)
                .filter(count -> count == 0)
                .findAny()
                .isPresent();
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
                .limit(numberOfDays)
                .sum();
    }

    public int getBusyDays() {
        return (int)Arrays.stream(birdsPerDay)
                .filter(visits -> visits >= 5)
                .count();
    }
}
