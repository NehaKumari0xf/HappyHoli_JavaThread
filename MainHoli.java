public class MainHoli {
    public static void main(String[] args) {
        holi h = new holi();
        holiHai hh = new holiHai();

        h.start();
        try {
            h.join();
        } catch (Exception e) {
            System.out.println(e);
        }hh.start();
    }
}
