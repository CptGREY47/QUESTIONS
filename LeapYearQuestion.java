package InterviewQuestion;

public class LeapYearQuestion {
    public static void main(String[] args) {
      /*
         Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.

        i)Yil 100 e bolunursa 400 e de bolunmelidir.      ==> 1600+ (artik yil) 1800-(artik yil degil)

        ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)
      */

        int year =2003;

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not Leap Year");
            }
        } else if (year%4==0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }

        // Second Way:

        int leapYear = 1992;
        String result = leapYear%100==0 ? leapYear%400==0 ? "Leap year" : "Not Leap Year" : leapYear%4==0 ? "Leap Year": "Not Leap Year";
        System.out.println(result);

    }
}
