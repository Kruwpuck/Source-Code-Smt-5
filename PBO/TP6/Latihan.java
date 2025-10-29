// USER
class User {
    protected String username;
    private Song[] playlist;
    
    public User(String username){
        if (username != null && !username.isEmpty()){
            this.username = username;
        } else {
            this.username = "anonymous";
        }
        
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setPlaylist(Song[] arrSong){
        if (arrSong.length != 0 && arrSong != null){
            this.playlist = arrSong;
        } else {
            System.out.println("Playlist kosong");
        }
    }
    
    public Song[] getPlaylist(){
        return this.playlist;
    }
    
    public void playPlaylist(){
        for (int i = 0; i < this.playlist.length; i++){
            System.out.println("Iklan dulu karena akun gratis, makanya premium");
            playlist[i].playMusic();
        }
    }
}
// SONG

class Song {
    private String title;
    private String artist;
    private int durationSeconds;
    
    public Song(String title, String artist, int durationSec){
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSec;
    }
    
    public int getDurationSeconds(){
        return this.durationSeconds;
    }
    
    public int getDurationMM(){
        return this.durationSeconds / 60;
    }
    
    public String getDurationDD(){
        int dd = this.durationSeconds % 60;
        return String.format("%02d", dd);
    }
    
    public void playMusic(){
        System.out.println("Lagu " + this.title + " oleh " + this.artist + " diputar dengan durasi " + getDurationMM() + ":" + getDurationDD());
    }
    
    public void playMusic(int repeatCount){
        if (repeatCount < 1) {
            repeatCount = 1;
        }
        for (int i = 1; i <= repeatCount; i++){
            System.out.println("Pemutaran ke-" + i);
            playMusic();
        }
    }
}
// PremiumUser

class PremiumUser extends User {
    private int playtime;
    private int repeatCount; 
    
    public PremiumUser(String username, int repeatCount){
        super(username);
        setRepeatCount(repeatCount);
    }
    
    public void setUsername(String username){
        if (username != null && !username.isEmpty()){
            this.username = username;
        } else {
            this.username = "anonymous";
        }
        
    }
    
    public void setRepeatCount(int repeatCount){
        this.repeatCount = repeatCount;
    }
    
    public String getPlaytime(){
        Song[] pList = getPlaylist();
        for (int i = 0; i < pList.length; i++){
            this.playtime += pList[i].getDurationSeconds() * repeatCount;
        }
        int j = this.playtime / 3600;
        int m = this.playtime % 3600 / 60;
        int d = this.playtime % 3600 % 60;
        return String.format("%d:%02d:%02d", j, m, d);
    }
    
   @Override
   public void playPlaylist(){
       Song[] pList = getPlaylist();
       System.out.println("Semua lagu diputar tanpa iklan");
       for (int i = 0; i < pList.length; i++){
           pList[i].playMusic(repeatCount);
       }
       System.out.println("Jumlah menit lagu yang telah dimainkan: " + getPlaytime());
   }
}
// MAIN

public class Latihan {

    public static void main(String[] args) {
        User u = new User("sadboy123");
        PremiumUser pu = new PremiumUser("ngopimas999", 2);
        
        Song[] list1 = {
            new Song("Lost Boy", "Ruth B", 261),
            new Song("Apa Mungkin", "Bernadya", 215),
            new Song("Komang", "Raim Kaode", 206),
            new Song("Waktu Yang Salah", "Fiersa Besari", 316),
            new Song("Happier", "Olivia Rodrigo", 154),
            new Song("Happiness", "Rex Orange Country", 264)
        };
        Song[] list2 = {
            new Song("I Love You", "Billie Elish", 271),
            new Song("Let Her Go", "Passenger", 247)
        };
        
        u.setPlaylist(list1);
        pu.setPlaylist(list2);
        
        System.out.println("Pengguna Umum");
        System.out.println("Akun: " + u.getUsername());
        u.playPlaylist();
        
        System.out.println("===============================");
        System.out.println("Pengguna Premium:");
        System.out.println("Akun: " + pu.getUsername());
        pu.playPlaylist();
    }
}