public class Main {

    public static void main(String[] args) {
        Heroi heroi = new Heroi("Arthur", 50, null);
        System.out.println(heroi);
        heroi.ganharXp(900);
        System.out.println(heroi);
        heroi.ganharXp(1500);
        System.out.println(heroi);
        heroi.ganharXp(2700);
        
    }

}
