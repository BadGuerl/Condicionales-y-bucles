
public class Main {

    public static void main(String[] args) {
        var estacion = "Verano";

        switch(estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Esto no es una estación")
        }
    }
}