public class conditional {
    public static void main(String[] args){
        int sayi = 10;
        if (sayi<20){ //if yerine switch case de kullanilabilir.
            System.out.println("Sayi 20'den kucuktur.");
        }

        else if (sayi==20){ //Python'da elif
            System.out.println("Sayi 20'ye esittir.");
        }

        else { 
            System.out.println("Sayi 20'den buyuktur.");
        }

        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Mukemmel: Gectiniz.");
                break;
            case 'B':
                System.out.println("Cok iyi: Gectiniz.");
                break;
                default: //else gibi
                    System.out.println("Gecersiz not giridiniz.");
        }
    }
}
