class B01 {
    public static void main(String[] args) {
        // set initial bottles
        int bottles = 99;
        for (int i = bottles; i > 1; i--) {
            System.out.printf("""
                    %d bottles of beer on the wall, %d bottles of beer.
                    Take one down and pass it around, %d bottles of beer on the wall.
                    """, i, i, i - 1);
        }
        System.out.printf("""
                1 bottle of beer on the wall, 1 bottle of beer.
                Take one down and pass it around, no more bottles of beer on the wall.
                No more bottles of beer on the wall, no more bottles of beer.
                Go to the store and buy some more, %d bottles of beer on the wall.
                """, bottles);
    }
}