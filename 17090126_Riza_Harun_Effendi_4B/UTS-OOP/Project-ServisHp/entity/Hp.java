package entity;

public class Hp{

    private String no;
    private String nama;
    private String alamat;
    private String merk_hp;
    private String krs;
    private String biaya;



    public Hp(String no, String nama, String alamat, String merk_hp, String krs, String biaya) {
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.merk_hp = merk_hp;
        this.krs = krs;
        this.biaya = biaya;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerk_hp() {
        return merk_hp;
    }

    public void setMerk_hp(String merk_hp) {
        this.merk_hp = merk_hp;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public boolean equals(Object object){
        Hp tmp = (Hp) object;
        return no.equals(tmp.getNo());
    }
}