if (a.score!= b.score) {
            return b.score - a.score;
        }
        // 2. If score same, sort by increasing name
        return a.name.compareTo(b.name);
    }
}