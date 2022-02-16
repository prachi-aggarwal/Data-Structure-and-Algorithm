public class Codec {
HashMap<String,String> mp= new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
   StringBuilder sb=new StringBuilder();
        while(mp.containsKey(sb.toString())){
            sb.append((char)Math.floor(Math.random()*100));
        }
         mp.put(sb.toString(),longUrl);
             return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mp.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));