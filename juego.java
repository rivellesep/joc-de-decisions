//En aquest programa he utilitzat la funció "return" per finalitzar el joc quan el jugador mor o no supera un nivell.

//No és la millor manera de controlar el flux d’un programa, en aquest cas l'he fet servir perquè
//el joc té múltiples rutes i finals possibles.

//No he volgut utilitzar funcions com "while" o alguna recursivitat 
//ja que en teoria encara no sabem que es, o la gracia es fer un codig simple.

//(A mes amb l'ajuda del ChatGPT he apres a utilitzar i entendre altres maneres, amb diferentes funcions, pero com encara estem en una fase base pues no volia utilitzar ninguna cosa rara)

import java.util.Scanner;
public class juego {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    //--------------------------Variables--------------------------------
        int strength = 3;
        int intellect = 3;
        int charisma = 3;
        int courage = 3;
        int extraPoints = 10;
        int var2 = 0;
        boolean council = false;
        String var1 = " ";
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
            //--------------------------Explicació punts-----------------------------
                System.out.println("Disposes de 10 punts per repartir entre les següents característiques (cada una comença amb un valor base de 3):");
                System.out.println("-Força-");
                System.out.println("-Intel·ligència-");
                System.out.println("-Carisma-");
                System.out.println("-Valentia-");

                System.out.println(" ");
                System.out.println("--Enter per començar--");
                lector.nextLine();
            //----------------------Repartiment de punts------------------------------
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
            //------------------------Comença el joc-------------------------------------------
                System.out.println(" ");
                System.out.println("La brisa nocturna bufa freda mentre t'endinses en les ruïnes oblidades d'un antic temple. Les pedres desgastades murmuren històries d'herois caiguts i secrets ocults.");
                System.out.println(" ");
                System.out.println("Després de caminar uns passos, et topes amb una porta coberta de runas brillants que semblen palpitar amb energia magica. A la teva dreta, un passadís estret s'obre en les ombres, com si et convidés a endinsar-te en el desconegut.");
                System.out.println(" ");
            //------------------------Nivell 1-------------------------------------------------
                System.out.println("Que vols fer? (numero)");
                System.out.println("1. Forçar la porta.");
                System.out.println("2. Desxifrar les runes.");
                System.out.println("3. Entrar pel passadís.");
                System.out.println(" ");
                var2 = lector.nextInt();
                switch (var2) {
                    case 1:
                        System.out.println("Intentes forçar la porta amb tota la teva força...");
                        if (strength >= 6) {
                            System.out.println("La porta cedeix facilment i pots continuar.");
                            System.out.println("Pases al seguent nivell!");
                        } 
                        else {
                            System.out.println("Et canses intentant obrir-la i et fas mal. Lo millor seria que marxesis ara que pots...");
                            lector.close();
                            return;
                        }
                        break;
                    
                    case 2:
                        System.out.println("Observes les runes i intentes entendre el seu significat...");
                        if (intellect >= 6) {
                            System.out.println("Desxifres el missatge i la porta s'obre lentament davant teu.");
                            System.out.println("Pases al seguent nivell!");
                        } 
                        else {
                            System.out.println("Activas una trampa màgica i mors.");
                            lector.close();
                            return;
                        }
                        break;

                    case 3:
                        System.out.println("Et trobes amb unes rates gegants pel passadís...");
                        if (courage >= 5 && strength >= 5) {
                            System.out.println("Superes les rates gegants que t’ataquen i continues el teu camí.");
                            System.out.println("Pases al seguent nivell!");
                        } 
                        else {
                            System.out.println("No has pogut amb les rates, has mort.");
                            lector.close();
                            return;
                        }
                        break;
                    
                    default:
                        System.out.println("ERROR:Resposta incoherent");
                        lector.close();
                        return;
                }      
            //------------------------Nivell 2-------------------------------------------
                System.out.println("Un cavaller espectral s’aixeca davant teu, la seva armadura brilla");
                System.out.println("Que vols fer?");
                System.out.println("1. Reptar-lo a duel");
                System.out.println("2. Dialogar amb ell");
                System.out.println("3. Mostrar-li el teu coratge");
                var2 = lector.nextInt();

                switch (var2) {
                    case 1:
                        System.out.println("Empunyes la teva arma i ataques!");
                        if (strength >= 7) {
                         System.out.println("El duel és dur, però aconsegueixes vèncer-lo. Has passat al següent nivell!");
                        }
                        else {
                            System.out.println("El cavaller és massa fort per tu. Caus derrotat... Mors en combat.");
                            lector.close();
                            return;
                        }
                        break;
                    case 2:
                        System.out.println("Intentes parlar amb ell, buscant empatia i enteniment...");
                        if (charisma >= 6) {
                            System.out.println("El cavaller reconeix la teva noblesa i et deixa passar, donant-te un consell sagrat.");
                            council = true;
                        }
                        else {
                            System.out.println("El cavaller et menysprea i et llança fora del temple. Final neutre.");
                            lector.close();
                            return;
                        }
                        break;
                    case 3:
                        System.out.println("El mires fixament, sense por, mostrant-li la teva valentia...");
                        if (courage >= 6) {
                            System.out.println("Sorprès per la teva determinació, et deixa passar sense oposició. Has passat al següent nivell!");
                        }
                        else {
                            System.out.println("La seva mirada et glaça l’ànima i quedes petrificat. Mors.");
                            lector.close();
                            return;
                        }
                        break;
                    default:
                        System.out.println("ERROR:Resposta incoherent");
                        lector.close();
                        return;
                }
                lector.nextLine();
                System.out.println("--Enter per continuar al nivell final--");
                lector.nextLine();
            //------------------------Nivell final--------------------------------------------------
                System.out.println("Arribes a la cambra final. Un drac majestuós protegeix un tresor immens.");
                System.out.println("Que vols fer?");
                System.out.println("1. Agafar el tresor per la força");
                System.out.println("2. Utilitzar les paraules");
                System.out.println("3. Resoldre l’enigma del drac");
                if (council) {
                    System.out.println("4. Recordar el consell del cavaller (opció desbloquejada)");
                }
                else {
                    System.out.println("4. ???????????????????????? (opció bloquejada)");
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