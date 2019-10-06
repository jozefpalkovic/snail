import Klietka.Zviera;

public class Zoo extends Zviera {

    enum Rank{
        SOLDIER,
        SERGANT,
        CAPTAIN,
    }

    public static void main(String[] args) {
        System.out.println("\nSlimak lezie na strom. Kazdy den vylezie 2 cm. \nStrom je vysoky 60 cm.\nKedy bude hore?\n");

        int x = 1;
        int vyska=60;

        while (x<30) {
            System.out.println(x + ". den vyliezol na " + x*2 + " cm.");
            x++;
            if (x==30){
                System.out.println(x + ". den vyliezol " + x*2 + " cm");
                System.out.println("Slimak vyliezol az hore.\n");
            }
        }
        Zviera slimak = new Zviera(){
          @Override public void lezie(){
              System.out.println("Slimak lezie pomaly");
          }
        };
        Zviera zajac = new Zviera(){
            @Override public void skace(){
                System.out.println("Zajac skace vysoko.");
            }
        };
        slimak.lezie();
        slimak.lezie();
        slimak.skace();
        zajac.skace();
        zajac.zerie();
        System.out.println(" ");


        Rank a = Rank.CAPTAIN;
        switch (a){
            case CAPTAIN:
                System.out.println("Toto je kapitan");
                break;
            case SERGANT:
                System.out.println("Toto je sergant");
                break;
            case SOLDIER:
                System.out.println("Toto je soldier");
                break;
            default:
                System.out.println("Nikoho nenaslo");

        }
    }
}