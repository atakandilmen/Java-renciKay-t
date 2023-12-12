class Ogretmen {
    private int sicilNo;
    private String ad;
    private String soyad;
    private String anaBrans;
    private String sorumluSinif;

    public Ogretmen(int sicilNo, String ad, String soyad, String anaBrans, String sorumluSinif) {
        this.sicilNo = sicilNo;
        this.ad = ad;
        this.soyad = soyad;
        this.anaBrans = anaBrans;
        this.sorumluSinif = sorumluSinif;
    }

    public int getOgretmenSicilNo() {
        return sicilNo;
    }

    public void setOgretmenSicilNo(int sicilNo) {
    	 if (String.valueOf(sicilNo).length() == 4) {
             this.sicilNo = sicilNo;
         } else {
             this.sicilNo = 0; 
         }
    }

    public String getOgretmenAd() {
        return ad;
    }

    public void setOgretmenAd(String ad) {
        this.ad = ad;
    }

    public String getOgretmenSoyad() {
        return soyad;
    }

    public void setOgretmenSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOgretmenAnabrans() {
        return anaBrans;
    }

    public void setOgretmenAnaBrans(String anaBrans) {
        this.anaBrans = anaBrans;
    }

    public String getOgretmenSorumluSinif() {
        return sorumluSinif;
    }

    public void setOgretmenSorumluSinif(String sorumluSinif) {
        this.sorumluSinif = sorumluSinif;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "sicilNo=" + sicilNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", anaBrans='" + anaBrans + '\'' +
                ", sorumluSinif='" + sorumluSinif + '\'' +
                '}';
    }
}