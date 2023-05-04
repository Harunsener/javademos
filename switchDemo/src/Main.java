public class Main {

    public static void main(String[] args) {

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel : GEÇTİNİZ ");
                break;

            case 'B':
                System.out.println("ÇOK GÜZEL : GEÇTİN ");
                break;


            case 'C':
                System.out.println("İYİ : GEÇTİN ");
                break;


            case 'D':
                System.out.println("sınıf : tekrar ");
                break;
            default:
                System.out.println("Geçersiz not girdiniz ");


        }
    }
}

