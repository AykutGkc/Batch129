package mini_projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {


    List<String> userNameList = new ArrayList<>();
    List<String> eMailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("========TechProEducation=======");
        System.out.println("1-Üye ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Seciminiz: ");
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-soyad:");
        String name = scanner.nextLine();

        String username;
        boolean existUsername;

        do {
            System.out.println("Kullanici adini giriniz");
            username = scanner.nextLine();
            existUsername = userNameList.contains(username);
            if (existUsername) {
                System.out.println("Bu username daha önce kullanilmistir. Yeni bir username deneyiniz");
            }
        } while (existUsername);

        String email;
        boolean isValid;
        boolean existEmail;

        do {
            System.out.println("Email giriniz");
            email = scanner.nextLine().trim();
            isValid = validateEmail(email);


            existEmail = eMailList.contains(email);
            if (existEmail) {
                isValid = false;
                System.out.println("Bu email daha önce kullanilmistir. Yeni bir email deneyiniz");
            }
        } while (!isValid);

        String password;
        boolean isValidPsw;
        do {
            System.out.println("Sifrenizi giriniz");
            password = scanner.nextLine();
            isValidPsw = validatePassword(password);

        } while (!isValidPsw);

        User user = new User(name, username, email, password);
        userNameList.add(username);
        eMailList.add(email);
        passwordList.add(password);

        System.out.println(user);
        System.out.println("Tebrikler kayit isleminiz gerceklesmistir.");
        System.out.println("Kullanici adi veya email ve sifre ile sisteme giris yapabilirsiniz.");
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adi veya email giriniz.");
        String usernameOremail = scanner.nextLine();
        boolean isEmail = eMailList.contains(usernameOremail);
        boolean isUsername = userNameList.contains(usernameOremail);

        if (isEmail || isUsername) {

            while (true) {
                System.out.println("Sifrenizi  giriniz");
                String password = scanner.nextLine();
                int idx;
                if (isUsername) {
                    idx = userNameList.indexOf(usernameOremail);
                } else {
                    idx = eMailList.indexOf(usernameOremail);
                }

                if (passwordList.get(idx).equals(password)) {
                    System.out.println("Sisteme giris yaptiniz.");
                    break;
                } else {
                    System.out.println("Sifreniz yanlis, tekrar deneyiniz");
                }
            }

        }else{
            System.out.println("Sisteme kayitli kullanici bulunamadi");
            System.out.println("Üye iseniz bilgilerinizi kontrol ediniz yada üye olunuz.");
        }
    }


    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Email bosluk iceremez.");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email '@' icermelidir.");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").length() == 0;
            boolean checkEnd = secondPart.equals("gmail.com") || secondPart.equals("yahoo.com") || secondPart.equals("hotmail.com");

            if (!checkStart) {
                System.out.println("Email kücük harf,büyük harf,rakam ve _.- disinda karakter iceremez");
            } else if (!checkEnd) {
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
            }
            isValid = checkEnd && checkStart;
        }

        return isValid;
    }

    public static boolean validatePassword(String password) {
        boolean isValid;

        boolean space = password.contains(" ");
        boolean lengtGt6 = password.length() >= 6;

        boolean existUpper = password.replaceAll("[^A-Z]", "").length() >= 0;
        boolean existLower = password.replaceAll("[^a-z]", "").length() >= 0;
        boolean existDigit = password.replaceAll("[^0-9]", "").length() >= 0;
        boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length() >= 0;

        if (space) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengtGt6) {
            System.out.println("Sifre em az 6 karakter icermelidir.");
        } else if (!existUpper) {
            System.out.println("Sifre en az 1 tane büyük harf icermelidir");
        } else if (!existLower) {
            System.out.println("Sifre en az 1 tane kücük harf icermelidir");
        } else if (!existDigit) {
            System.out.println("Sifre en az 1 tane rakam icermelidir");
        } else if (!existSymbol) {
            System.out.println("Sifre en az 1 tane sembol icermelidir");
        }

        isValid = !space && lengtGt6 && existUpper && existLower && existDigit && existSymbol;

        if (!isValid) {
            System.out.println("Tekrar deneyiniz.");
        }

        return isValid;
    }


}
