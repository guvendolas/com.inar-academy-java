package Weeks.Week_13;

public class Home {
    private int yuzOlcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private String garajiVar;
    private int ucreti;
    private int kiraUcreti;
    private String cephesi;
    private String yil;

    public Home() {
        this(0, 0, 0, "", 0, 0, "", "");
    }

    public Home(int yuzOlcumu, int banyoSayisi, int odaSayisi, String garajiVar, int ucreti, int kiraUcreti, String cephesi, String yil) {
        this.yuzOlcumu = yuzOlcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajiVar = garajiVar;
        this.ucreti = ucreti;
        this.kiraUcreti = kiraUcreti;
        this.cephesi = cephesi;
        this.yil = yil;
    }

    public int getYuzOlcumu() {
        return this.yuzOlcumu;
    }

    public void setYuzOlcumu(int yuzOlcumu) {
        this.yuzOlcumu = yuzOlcumu;
    }

    public int getBanyoSayisi() {
        return this.banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getOdaSayisi() {
        return this.odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setGarajiVar(String garajiVar) {
        this.garajiVar = garajiVar;
    }

    public void setUcreti(int ucreti) {
        this.ucreti = ucreti;
    }

    public void setKiraUcreti(int kiraUcreti) {
        this.kiraUcreti = kiraUcreti;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }

    public String isGarajiVar() {
        return garajiVar;
    }

    public int getUcreti() {
        return ucreti;
    }

    public int getKiraUcreti() {
        return kiraUcreti;
    }

    public String getCephesi() {
        return cephesi;
    }

    public String getYil() {
        return yil;
    }

    public void print() {
        System.out.printf("Yuz Ölçümü:%s\nBanyo Sayısı:%s\nOda Sayısı:%d\nGarajı Var mı?:%s\nÜcreti:%s\nKira Ücreti:%s\nCephesi:%s\nYıl:%s\n", this.yuzOlcumu, this.banyoSayisi, this.odaSayisi, this.garajiVar, this.ucreti, this.kiraUcreti, this.cephesi, this.yil);
        System.out.println("-------");


    }
}