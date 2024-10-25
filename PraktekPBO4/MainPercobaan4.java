

public class MainPercobaan4 {
    public static void main(String[] args) {
        penumpang p = new penumpang("12345", "Mr. Krab");
        gerbong gerbong = new gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        penumpang budi = new penumpang("3456", "budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
