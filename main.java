import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
    //-------------------------------------------------------------------
        Scanner lector = new Scanner(System.in);
        int strength,intellect,charisma,courage = 3;
        int extraPoints = 10;
        boolean council = false;
        String var1;
    //-------------------------------------------------------------------
        System.out.println("Has arribat a un temple ple de proves i perills. El teu objectiu és avançar prenent decisions i comprovar si les teves habilitats són suficients per superar-les.");
        System.out.println(" ");
        System.out.println("--Enter per continuar--");
        lector.nextLine();
        System.out.println(" ");
        System.out.println("Vols començar la aventura? (s/n)");
        var1 = lector.next();
        if (var1 == "s") {
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
        }
        else if (var1 == "n") {
            System.out.println("Programa finalitzat");
        }
        else {
            System.out.println("ERROR:Resposta incoherent");
        }
        lector.close();
    }
    
}