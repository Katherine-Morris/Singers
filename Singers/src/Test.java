public class Test {
    public static void main(String[] args) {
        Singer Chris = new Singer("Chris", 34);
        Singer Maria = new Singer("Maria", 30);
        Duet Charia = new Duet(Chris, Maria);

        Singer Kate = new Singer("Kate Pierson", 77);
        Singer Cindy = new Singer("Cindy Wilson", 68);
        Duet B26s = new Duet(Kate, Cindy);

        Quatuor Band = new Quatuor(Charia, B26s);


        IO.println(Band.getDuet2().getSinger1().getAge());
    }
}