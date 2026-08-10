class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        // 1. Sort by decreasing score
        if (a.score!= b.score) {
            return b.score - a.score; // higher score first
        }
        // 2. If scores tie, sort by increasing name
        return a.name.compareTo(b.name); // alphabetical
    }
}