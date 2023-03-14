// Date Format In Java
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> listofFormats = new ArrayList<String>();
            listofFormats.add("yyyy-MM-dd'T'HH:mm:ss*SSSZZZZ");
listofFormats.add("yyyy MMM dd HH:mm:ss.SSS zzz");
listofFormats.add("MMM dd HH:mm:ss ZZZZ yyyy");
listofFormats.add("dd/MMM/yyyy:HH:mm:ss ZZZZ");
listofFormats.add("MMM dd; yyyy hh:mm:ss a");
listofFormats.add("MMM dd yyyy HH:mm:ss");
listofFormats.add("MMM dd HH:mm:ss yyyy");
listofFormats.add("MMM dd HH:mm:ss ZZZZ");
listofFormats.add("MMM dd HH:mm:ss");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ssZZZZ");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
listofFormats.add("yyyy-MM-dd HH:mm:ss ZZZZ");
listofFormats.add("yyyy-MM-dd HH:mm:ssZZZZ");
listofFormats.add("yyyy-MM-dd HH:mm:ss;SSS");
listofFormats.add("yyyy/MM/dd*HH:mm:ss");
listofFormats.add("yyyy MMM dd HH:mm:ss.SSS*zzz");
listofFormats.add("yyyy MMM dd HH:mm:ss.SSS");
listofFormats.add("yyyy-MM-dd HH:mm:ss;SSSZZZZ");
listofFormats.add("yyyy-MM-dd HH:mm:ss.SSS");
listofFormats.add("yyyy-MM-dd HH:mm:ss.SSSZZZZ");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss.SSS");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss'Z'");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss.SSS");
listofFormats.add("yyyy-MM-dd'T'HH:mm:ss");
listofFormats.add("yyyy-MM-dd*HH:mm:ss:SSS");
listofFormats.add("yyyy-MM-dd*HH:mm:ss");
listofFormats.add("yy-MM-dd HH:mm:ss;SSS ZZZZ");
listofFormats.add("yy-MM-dd HH:mm:ss;SSS");
listofFormats.add("yy-MM-dd HH:mm:ss");
listofFormats.add("yy/MM/dd HH:mm:ss");
listofFormats.add("yyMMdd HH:mm:ss");
listofFormats.add("yyyyMMdd HH:mm:ss.SSS");
listofFormats.add("MM/dd/yy*HH:mm:ss");
listofFormats.add("MM/dd/yyyy*HH:mm:ss");
listofFormats.add("MM/dd/yyyy*HH:mm:ss*SSS");
listofFormats.add("MM/dd/yy HH:mm:ss ZZZZ");
listofFormats.add("MM/dd/yyyy HH:mm:ss ZZZZ");
listofFormats.add("HH:mm:ss");
listofFormats.add("HH:mm:ss.SSS");
listofFormats.add("HH:mm:ss;SSS");
listofFormats.add("dd/MMM HH:mm:ss;SSS");
listofFormats.add("dd/MMM/yyyy:HH:mm:ss");
listofFormats.add("dd/MMM/yyyy HH:mm:ss");
listofFormats.add("dd-MMM-yyyy HH:mm:ss");
listofFormats.add("dd-MMM-yyyy HH:mm:ss.SSS");
listofFormats.add("dd MMM yyyy HH:mm:ss");
listofFormats.add("dd MMM yyyy HH:mm:ss*SSS");
listofFormats.add("MMdd_HH:mm:ss");
listofFormats.add("MMdd_HH:mm:ss.SSS");
listofFormats.add("MM/dd/yyyy hh:mm:ss a:SSS");
listofFormats.add("MM/dd/yyyy hh:mm:ss a");
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
