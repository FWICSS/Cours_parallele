import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.security.*;


public class Mining {
	private static String request(String u){
		try{
			URL url = new URL(u);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder result = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null) {
			    result.append(line);
			}
			return result.toString();
		}
		catch(Exception e){
			return "Erreur connexion !";
		}
	}
	
	public static String getDefi(){
		return request("http://erickstattner.com/mining/getDefi.php");
	}
	
	public static String proposerReponse(int nb, String nom){
		return request("http://erickstattner.com/mining/reponse.php?nb="+nb+"&pseudo="+nom);
	}
	
	public static String hash(int a)
    {
        try {
        	String input = a+"";
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
