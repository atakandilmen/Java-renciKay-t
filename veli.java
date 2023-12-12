 class Veli {
    private int kayitNo;
    private String ad;
    private String soyad;
    private String telefon;

    public Veli(int kayitNo, String ad, String soyad, String telefon) {
        this.kayitNo = kayitNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    public int getVeliKayitNo() {
        return kayitNo;
    }

    public void setVeliKayitNo(int kayitNo) {
        if (String.valueOf(kayitNo).length() == 5) {
            this.kayitNo = kayitNo;
        } else {
            this.kayitNo = -1; 
        }
    }

    public String getVeliAd() {
        return ad;
    }

    public void setVeliAd(String ad) {
        this.ad = ad;
    }

    public String getVeliSoyad() {
        return soyad;
    }

    public void setVeliSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getVeliTelefon() {
        return telefon;
    }

    public void setVeliTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Veli{" +
                "kayitNo=" + kayitNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
