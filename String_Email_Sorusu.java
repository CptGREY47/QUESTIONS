package sorular;

public class String_Email_Sorusu {
    public static void main(String[] args) {

        /*
            Question : Kullanidan bir email adresi girmesi isteuin.
            mail "@gmail.com" icermiyorsa " Lutfen gmail adresi giriniz."
            "@gmail.com" ile bitiyorsa " email adresiniz kaydedildi"
            "@gmail.com " ile bitmiyorsa lutfen yazimi kontrol edin yazdirin.

         */

        String email = "abc@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol edin");
        }


}
}
