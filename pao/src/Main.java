import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the transport company " + "\n");
        CompanieDeTransporturi x = CompanieDeTransporturi.getInstance();
        Scanner input = new Scanner(System.in);
        int alegere = 1;
        while (alegere > 0 && alegere < 11) {
            System.out.println("_________________________________________________________________________________________");
            System.out.println("1. Program excursii");
            System.out.println("2. Lista masinilor detinute de companie");
            System.out.println("3. Angajati/Soferi");
            System.out.println("4. Ce sofer este pe fiecare traseu");
            System.out.println("5. Soferul cu cea mai mare experienta");
            System.out.println("6. Cauta un angajat dupa nume");
            System.out.println("7. Cauta daca exista  sediu in orasul tau");
            System.out.println("8. Cauta adresa la care se afla sediul din orasul tau");
            System.out.println("9. Cate locuri sunt intr-o masina");
            System.out.println("10. Cauta urmatoarea masina spre destinatia ta");
            System.out.println("_________________________________________________________________________________________");
            System.out.println("Alegeti optiunea: ");
            alegere = input.nextInt();
            switch (alegere) {
                case 1: {
                    x.programExcursii();
                    break;
                }
                case 2: {
                    x.masiniList();
                    break;
                }
                case 3: {
                    x.nrAngajatiSoferi();
                    break;
                }
                case 4: {
                    x.soferTraseu();
                    break;
                }
                case 5: {
                    x.soferulCuCeaMaiMareExperienta();
                    break;
                }
                case 6: {
                    System.out.println("Introduceti numele: ");
                    String nume = input.next();
                    x.cautDupaNume(nume);
                    break;
                }
                case 7: {
                    System.out.println("Introduceti orasul: ");
                    String oras = input.next();
                    x.cautOras(oras);
                    break;
                }
                case 8: {
                    System.out.println("Introduceti orasul: ");
                    String oras = input.next();
                    x.cautAdresa(oras);
                    break;
                }
                case 9: {
                    System.out.println("Introduceti unul din orasele traseului: ");
                    String oras = input.next();
                    x.cautLocuri(oras);
                    break;
                }
                case 10: {
                    System.out.println("Introduceti destinatia: ");
                    String oras = input.next();
                    x.cautAdresaDestinatie(oras);
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