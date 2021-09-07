public class StarTest {

    public static void main(String[] args) {
        StarList starList = new StarList(8);
        starList.add(new Star("Proxima Centauri", Star.Color.RED, 1 / 8f));
        starList.add(new Star("Alpha Centauri A", Star.Color.YELLOW, 1.10f));
        starList.add(new Star("Alpha Centauri B", Star.Color.ORANGE, 0.91f));
        starList.add(new Star("Sirius A", Star.Color.BLUE, 2.02f));
        starList.add(new Star("Sirius B", Star.Color.WHITE, 0.98f));
        starList.add(new Star("R136a1", Star.Color.BLUE, 265f));
        starList.add(new Star("Betelgeuse", Star.Color.RED, 13.85f));
        starList.add(new Star("Polaris Aa", Star.Color.YELLOW, 4.5f));

        starList.sortByName();
        System.out.println("If you want to test the code, edit the "
            + " StarTest.java file after you make StarList implement Iterable"
            + " and uncomment the indicated lines");

        // TODO: Uncomment this if you want to test stuff out
        //starList.forEach(System.out::println);
        System.out.println();
        starList.sortByColor();
        // TODO: Uncomment this if you want to test stuff out
        //starList.forEach(System.out::println);
        System.out.println("Star color from coolest to hottest is "
                + "red -> orange -> yellow -> white -> blue");
    }
}
