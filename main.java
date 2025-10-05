import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
    //-------------------------------------------------------------------
        Scanner lector = new Scanner(System.in);
        int strength = 3;
        int intellect = 3;
        int charisma = 3;
        int courage = 3;
        int extraPoints = 10;
        int var2 = 0;
        boolean council = false;
        String var1;
    //-------------------------------------------------------------------
        System.out.println("Has arribat a un temple ple de proves i perills. El teu objectiu és avançar prenent decisions i comprovar si les teves habilitats són suficients per superar-les.");
        System.out.println(" ");
        System.out.println("--Enter per continuar--");
        lector.nextLine();
        System.out.println(" ");
        System.out.println("Vols començar la aventura? (s/n)");
        System.out.println(" ");
        var1 = lector.nextLine();
        switch (var1) {
            case "s":
                System.out.println(" ");
                System.out.println("Abans de començar la teva aventura, has de donar forma al teu heroi. Cada decisió que prenguis dependrà no només del teu enginy, sinó també dels teus atributs.");
                System.out.println(" ");
                System.out.println("--Enter per continuar--");
                lector.nextLine();
                System.out.println("Disposes de 10 punts per repartir entre les següents característiques (cada una comença amb un valor base de 3):");
                System.out.println("-Força-");
                System.out.println("-Intel·ligència-");
                System.out.println("-Carisma-");
                System.out.println("-Valentia-");
                System.out.println(" ");
                System.out.println("--Enter per començar--");
                lector.nextLine();

                System.out.println("Punts disponibles: " + extraPoints);
                System.out.println(" ");
                System.out.println("Quants punts vols afegir a força?");
                var2 = lector.nextInt();
                strength = strength + var2;
                extraPoints = extraPoints - var2;
                System.out.println(" ");

                System.out.println("Punts disponibles: " + extraPoints);
                System.out.println(" ");
                System.out.println("Quants punts vols afegir a intel·ligència?");
                var2 = lector.nextInt();
                intellect = intellect + var2;
                extraPoints = extraPoints - var2;
                System.out.println(" ");

                System.out.println("Punts disponibles: " + extraPoints);
                System.out.println(" ");
                System.out.println("Quants punts vols afegir a carisma?");
                var2 = lector.nextInt();
                charisma = charisma + var2;
                extraPoints = extraPoints - var2;
                System.out.println(" ");

                System.out.println("Punts disponibles: " + extraPoints);
                System.out.println(" ");
                System.out.println("Quants punts vols afegir a valentia?");
                var2 = lector.nextInt();
                courage = courage + var2;
                extraPoints = extraPoints - var2;

                System.out.println("Punts d'atributs reapartits amb exit!");
                System.out.println(" ");
                System.out.println("--Enter per continuar--");
                lector.nextLine();
                System.out.println(" ");
                System.out.println("La brisa nocturna bufa freda mentre t'endinses en les ruïnes oblidades d'un antic temple. Les pedres desgastades murmuren històries d'herois caiguts i secrets ocults.");
                System.out.println(" ");
                System.out.println("Després de caminar uns passos, et topes amb una porta coberta de runas brillants que semblen palpitar amb energia magica. A la teva dreta, un passadís estret s'obre en les ombres, com si et convidés a endinsar-te en el desconegut.");
                System.out.println(" ");
                System.out.println("Que vols fer? (numero)");
                System.out.println("1. Forçar la porta.");
                System.out.println("2. Desxifrar les runes.");
                System.out.println("3. Entrar pel passadís.");
                System.out.println(" ");
                var2 = lector.nextInt();
                if (var2 == 1) {
                    System.out.println("Intentes forçar la porta amb tota la teva força...");
                    if (strength >= 6) {
                        System.out.println("La porta cedeix facilment i pots continuar.");
                        System.out.println("Pases al seguent nivell!");
                    } 
                    else {
                        System.out.println("Et canses intentant obrir-la i et fas mal. Lo millor seria que marxesis ara que pots...");
                    }
                }
                else if (var2 == 2) {
                    System.out.println("Observes les runes i intentes entendre el seu significat...");
                    if (intellect >= 6) {
                        System.out.println("Desxifres el missatge i la porta s'obre lentament davant teu.");
                        System.out.println("Pases al seguent nivell!");
                    } else {
                        System.out.println("Activas una trampa màgica i mors.");
                    }
                }
                else if (var2 == 3) {
                    System.out.println("Et trobes amb unes rates gegants pel passadís...");
                    if (courage >= 5 && strength >= 5) {
                        System.out.println("Superes les rates gegants que t’ataquen i continues el teu camí.");
                        System.out.println("Pases al seguent nivell!");
                    } else {
                        System.out.println("No has pogut amb les rates, has mort.");
                    }
                }
                else{
                    System.out.println("ERROR:Resposta incoherent");
                }
                break;
            case "n":
                System.out.println(" ");
                System.out.println("Programa finalitzat");
                break;
            default:
                System.out.println(" ");
                System.out.println("ERROR:Resposta incoherent");
                break;
        }
        lector.close();
    }
    
}