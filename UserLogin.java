package Java101;

import java.util.Scanner;

/**
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
 * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 * 
 * @author Canberk
 */

public class UserLogin {
	
	public static void main(String[] args) {

		String dUserName = "canberksayan";
		String dPassword  = "1905";
		String userName, password;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kullanıcı Adınızı Giriniz : ");
		userName = scan.next();
		System.out.print("Kullanıcı Şifrenizi Giriniz : ");
		password = scan.next();
		scan.close();
		
		if (userName.equals(dUserName) && (password.equals(dPassword))) {
			System.out.println("Giriş başarılı\nKullanıcı Adınız : " + userName + "\n" + "Kullanıcı Şifreniz : " + password);
		}else if (!userName.equals(dUserName)) {
			System.out.println("Kullanıcı Adınız Hatalı.");
		}else if (!password.equals(dPassword))
			System.out.println("Şifreniz Hatalı.");
		
	}

}
