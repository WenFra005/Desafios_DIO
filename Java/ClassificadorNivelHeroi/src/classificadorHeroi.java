public class classificadorHeroi {

    public static String classificadorHeroi(int xpHeroi) {
        if (xpHeroi <= 1000) {
            return "Ferro";

        } else if (xpHeroi > 1001 && xpHeroi <= 2000) {
            return "Bronze";

        } else if (xpHeroi > 2001 && xpHeroi <= 5000) {
            return "Prata";

        } else if (xpHeroi > 5001 && xpHeroi <= 7000) {
            return "Ouro";
        
        } else if (xpHeroi > 7001 && xpHeroi <= 8000) {
            return "Platina";
        
        } else if (xpHeroi > 8001 && xpHeroi <= 9000) {
            return "Ascendente";
        
        } else if (xpHeroi > 9001 && xpHeroi <= 10000) {
            return "Imortal";

        } else {
            return "Radiante";
        }
            
    }
}
