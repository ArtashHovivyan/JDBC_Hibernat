public class Main {

    public static void main(String[] args) {
        Home home = new Home();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            home.sum(i,i);
        }


    }
}
