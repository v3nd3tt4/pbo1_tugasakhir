public class Pengguna{
    private int id;
    private String username;
    private String password;


    public void login(){
        System.out.println("ini method untuk login");
    }

    public void lupaPassword(){
        System.out.println("ini method untuk Lupa Password");
    }

    public void daftar(){
        System.out.println("ini method untuk daftar user baru");
    }

    public int getID(){
        return this.id;
    }

    public String getUSername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Pengguna(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

}