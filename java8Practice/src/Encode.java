import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class Encode {
    public static void main(String args[]){
        try{
            //encoding
            String EncodedString = Base64.getEncoder().encodeToString("hi! everyone how are you doing?".getBytes(StandardCharsets.UTF_8));
            System.out.println("Base64 encoded string is :"+EncodedString);
            //decoding
            byte[] Decoded = Base64.getDecoder().decode(EncodedString);

            System.out.println("original string: "+new String(Decoded,"utf-8" ));
            EncodedString = Base64.getUrlEncoder().encodeToString("hi! everyone how are you doing?".getBytes("utf-8"));
            System.out.println("Base64 encoded string URL :"+EncodedString);

            StringBuilder stringBuilder = new StringBuilder();
            for(int i= 0;i<10;i++){
                stringBuilder.append(UUID.randomUUID().toString());
            }
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

        } catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
