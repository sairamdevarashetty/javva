// Date Format In Java
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> listofFormats = List.of(
            "MMM dd HH:mm:ss",
            "yyyy-MM-dd'T'HH:mm:ss*SSSZZZZ",
            "yyyy MMM dd HH:mm:ss.SSS zzz",
            "MMM dd HH:mm:ss ZZZZ yyyy",
            "dd/MMM/yyyy:HH:mm:ss ZZZZ",
            "MMM dd, yyyy hh:mm:ss a",
            "MMM dd yyyy HH:mm:ss",
            "MMM dd HH:mm:ss yyyy",
            "MMM dd HH:mm:ss ZZZZ",
            "yyyy-MM-dd'T'HH:mm:ssZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
            "yyyy-MM-dd HH:mm:ss ZZZZ",
            "yyyy-MM-dd HH:mm:ssZZZZ",
            "yyyy-MM-dd HH:mm:ss,SSS",
            "yyyy/MM/dd*HH:mm:ss",
            "yyyy MMM dd HH:mm:ss.SSS*zzz",
            "yyyy MMM dd HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss,SSSZZZZ",
            "yyyy-MM-dd HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss.SSSZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd'T'HH:mm:ss",
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd'T'HH:mm:ss",
            "yyyy-MM-dd*HH:mm:ss:SSS",
            "yyyy-MM-dd*HH:mm:ss",
            "yy-MM-dd HH:mm:ss,SSS ZZZZ",
            "yy-MM-dd HH:mm:ss,SSS",
            "yy-MM-dd HH:mm:ss",
            "yy/MM/dd HH:mm:ss",
            "yyMMdd HH:mm:ss",
            "yyyyMMdd HH:mm:ss.SSS",
            "MM/dd/yy*HH:mm:ss",
            "MM/dd/yyyy*HH:mm:ss",
            "MM/dd/yyyy*HH:mm:ss*SSS",
            "MM/dd/yy HH:mm:ss ZZZZ",
            "MM/dd/yyyy HH:mm:ss ZZZZ",
            "HH:mm:ss",
            "HH:mm:ss.SSS",
            "HH:mm:ss,SSS",
            "dd/MMM HH:mm:ss,SSS",
            "dd/MMM/yyyy:HH:mm:ss",
            "dd/MMM/yyyy HH:mm:ss",
            "dd-MMM-yyyy HH:mm:ss",
            "dd-MMM-yyyy HH:mm:ss.SSS",
            "dd MMM yyyy HH:mm:ss",
            "dd MMM yyyy HH:mm:ss*SSS",
            "MMdd_HH:mm:ss",
            "MMdd_HH:mm:ss.SSS",
            "MM/dd/yyyy hh:mm:ss a:SSS",
            "MM/dd/yyyy hh:mm:ss a"
        ); 
        Date date = null;

        SimpleDateFormat expectedFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        for (String i : listofFormats) {
            System.out.println(i);
            SimpleDateFormat DateFormat = new SimpleDateFormat(i);
            boolean failure = false;    
            try {
                date = DateFormat.parse("2022-08-19 12:17:55 -0400");
                
            } catch(Exception e){
                failure = true;
                System.out.println(e);
            } finally{
               
               
            }
            System.out.println("failure");
            System.out.println(failure);
            if (failure == false) {
                 break;
            }
        }
        System.out.println("Got the date");
        System.out.println(date);
        String formattedDate = expectedFormat.format(date);
         System.out.println("formattedDate :::" + formattedDate);
    }
}
