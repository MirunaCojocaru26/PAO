import Companie.configuration.RepositoryConfiguration;
import Companie.domain.repository.FilialaInterface;
import Companie.service.AngajatService;
import Companie.service.FilialaService;
import Companie.service.RutaOutService;
import Companie.service.RutaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        RutaOutService x=null;
//        x.functie();
        System.out.println("Welcome to the transport company " + "\n");
        AngajatService as=new AngajatService();
        FilialaService fs=new FilialaService();
        RutaService rs =new RutaService();
        Scanner input = new Scanner(System.in);
        System.out.println("_________________________________________________________________________________________");
        System.out.println("1. Program excursii");
        System.out.println("2. Lista masinilor detinute de companie");
        System.out.println("3. Numarul total de masini ale companiei");
        System.out.println("4. Angajati/Soferi");
        System.out.println("5. Ce sofer este pe fiecare traseu");
        System.out.println("6. Soferul cu cea mai mare experienta");
        System.out.println("7. Cauta un angajat dupa nume");
        System.out.println("8. Cauta daca exista  sediu in orasul tau");
        System.out.println("9. Cauta adresa la care se afla sediul din orasul tau");
        System.out.println("10. Cate locuri sunt intr-o masina");
        System.out.println("11. Cauta urmatoarea masina spre destinatia ta");
        System.out.println("_________________________________________________________________________________________");
        int alegere = 1;
        while (alegere > 0 && alegere < 12) {
            System.out.println("Alegeti optiunea: ");
            alegere = input.nextInt();
            switch (alegere) {
                case 1: {
                    rs.programExcursii();
                    break;
                }
                case 2: {
                    rs.listaMasini();
                    break;
                }
                case 3: {
                    fs.nrMasini();;
                    break;
                }
                case 4: {
                    fs.nrAngajatiSoferi();
                }
                case 5: {
                    rs.soferTraseu();
                    break;
                }
                case 6: {
                    as.soferulCuCeaMaiMareExperienta();
                    break;
                }
                case 7: {
                    System.out.println("Introduceti numele: ");
                    String nume = input.next();
                    as.cautDupaNume(nume);
                    break;
                }
                case 8: {
                    System.out.println("Introduceti orasul: ");
                    String oras = input.next();
                    fs.cautOras(oras);
                    break;
                }
                case 9: {
                    System.out.println("Introduceti orasul: ");
                    String oras = input.next();
                    fs.cautAdresa(oras);
                    break;
                }
                case 10: {
                    System.out.println("Introduceti unul din orasele traseului: ");
                    String oras = input.next();
                    rs.cautLocuri(oras);
                    break;
                }
                case 11: {
                    System.out.println("Introduceti destinatia: ");
                    String oras = input.next();
                    rs.cautAdresaDestinatie(oras);
                    break;
                }
                default: {
                    System.out.println("Nu exista acest caz");
                    break;
                }
            }
        }
    }
}