import java.util.Scanner;

/**
 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
 * yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 * Mesafe başına ücret 0,10 TL / km olarak alın.
 * İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;
 * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 * Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
 * - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
 * - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
 * - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
 * - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 *
 * @author Canberk
 */
public class FlightTicket {

    public static void main(String[] args) {

        double mesafe, tutar, indirimTutari, biletUcreti;
        int yas, yolculukTipi;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boş alanları doldurunuz.");
        String secenek = "Sadece gidiş için : 1'e, Gidiş ve Dönüş için : 2'ye basınız.";
        System.out.println(secenek);
        yolculukTipi = scan.nextInt();
        System.out.print("Lütfen gitmek istediğiniz mesafeyi belirtiniz : ");
        mesafe = scan.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = scan.nextInt();
        scan.close();

        if (yolculukTipi == 1) {
            tutar = mesafe * 0.10;
            if(yas < 12) {
                indirimTutari = tutar * 0.50;
                biletUcreti = tutar - indirimTutari;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else if (yas >= 12 && yas <= 24) {
                indirimTutari = tutar * 0.10;
                biletUcreti = tutar - indirimTutari;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else if ( yas > 65) {
                indirimTutari = tutar * 0.30;
                biletUcreti = tutar - indirimTutari;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else {
                System.out.println("Ödemeniz gereken ücret : " + tutar);
            }
        }

        if (yolculukTipi == 2) {
            tutar = mesafe * 0.10;
            if(yas < 12) {
                indirimTutari = tutar * 0.50;
                biletUcreti = (tutar - indirimTutari) * 0.20;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else if (yas >= 12 && yas <= 24) {
                indirimTutari = tutar * 0.10;
                biletUcreti = (tutar - indirimTutari) * 0.20;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else if (yas > 65) {
                indirimTutari = tutar * 0.30;
                biletUcreti = (tutar - indirimTutari) * 0.20;
                System.out.println("Ödemeniz gereken ücret : " + biletUcreti);
            }else {
                System.out.println("Ödemeniz gereken ücret : " + (tutar - (tutar * 0.20)));
            }
        }

    }

}