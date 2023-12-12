import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



public class main {
    private JFrame frame1;
    private JFrame frame2;

    private List<Ogrenci> ogrenciListesi = new ArrayList<>();
    private List<Ogretmen> ogretmenListesi = new ArrayList<>();
    private List<Veli> veliListesi = new ArrayList<>();

    private JTextField ogrenciNoTextField;
    private JTextField ogrenciTcTextField;
    private JTextField ogrenciAdTextField;
    private JTextField ogrenciSoyadTextField;
    private JTextField ogrenciSinifTextField;
    private JTextField ogrenciOgretmenTextField;
    private JTextField ogrenciVeliAdSoyadTextField;

    private JTextField ogretmenSicilNoTextField;
    private JTextField ogretmenAdTextField;
    private JTextField ogretmenSoyadTextField;
    private JTextField ogretmenAnabransTextField;
    private JTextField ogretmenSorumluSinifTextField;

    private JTextField veliKayitNoTextField;
    private JTextField veliAdTextField;
    private JTextField veliSoyadTextField;
    private JTextField veliTelefonTextField;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new main();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public main() {
        // İlk ekran
        frame1 = new JFrame("Ekran 1");
        frame1.setSize(640, 360);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton ekleButton = new JButton("Ekle");
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ikinciSayfayiGoster();
            }
        });
        
        JButton gosterButton = new JButton("Kayıtları Göster");
        gosterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tumKayitlariGoster();
            }
        });

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(ekleButton);
        panel1.add(gosterButton);

        frame1.add(panel1);
        frame1.setVisible(true);

        // İkinci ekran
        frame2 = new JFrame("Ekran 2");
        frame2.setSize(640, 640);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton donButton = new JButton("Ekran 1'e Dön");
        donButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ekran 2'yi kapat ve Ekran 1'i göster
                frame2.setVisible(false);
                frame1.setVisible(true);
            }
        });

        JTextField ogrenciNoTextField = new JTextField(6);
        JTextField ogrenciTcTextField = new JTextField(11);
        JTextField ogrenciAdTextField = new JTextField(50);
        JTextField ogrenciSoyadTextField = new JTextField(50);
        JTextField ogrenciSinifTextField = new JTextField(50);
        JTextField ogrenciOgretmenTextField = new JTextField(50);
        JTextField ogrenciVeliAdSoyadTextField = new JTextField(50);

        JTextField ogretmenSicilNoTextField = new JTextField(4);
        JTextField ogretmenAdTextField = new JTextField(50);
        JTextField ogretmenSoyadTextField = new JTextField(50);
        JTextField ogretmenAnabransTextField = new JTextField(50);
        JTextField ogretmenSorumluSinifTextField = new JTextField(50);

        JTextField veliKayitNoTextField = new JTextField(5);
        JTextField veliAdTextField = new JTextField(50);
        JTextField veliSoyadTextField = new JTextField(50);
        JTextField veliTelefonTextField = new JTextField(50);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Convert and retrieve values
                    int ogrenciNo = Integer.parseInt(ogrenciNoTextField.getText());
                    if (String.valueOf(ogrenciNo).length() != 6) {
                        JOptionPane.showMessageDialog(null, "Öğrenci numarası 6 hane olmalıdır.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit the method if there is an error
                    }
                    String ogrenciTc = ogrenciTcTextField.getText();
                    if (String.valueOf(ogrenciTc).length() != 11) {
                        JOptionPane.showMessageDialog(null, "Tc Kimlik numarası 11 hane olmalıdır.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit the method if there is an error
                    }
                    String ogrenciAd = ogrenciAdTextField.getText();
                    String ogrenciSoyad = ogrenciSoyadTextField.getText();
                    String ogrenciSinif = ogrenciSinifTextField.getText();
                    String ogrenciOgretmen = ogrenciOgretmenTextField.getText();
                    String ogrenciVeliAdSoyad = ogrenciVeliAdSoyadTextField.getText();

                    int ogretmenSicilNo = Integer.parseInt(ogretmenSicilNoTextField.getText());
                    if (String.valueOf(ogretmenSicilNo).length() != 4) {
                        JOptionPane.showMessageDialog(null, "Öğretmen sicil numarası 4 hane olmalıdır.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit the method if there is an error
                    }
                    String ogretmenAd = ogretmenAdTextField.getText();
                    String ogretmenSoyad = ogretmenSoyadTextField.getText();
                    String ogretmenAnabrans = ogretmenAnabransTextField.getText();
                    String ogretmenSorumluSinif = ogretmenSorumluSinifTextField.getText();

                    int veliKayitNo = Integer.parseInt(veliKayitNoTextField.getText());
                    if (String.valueOf(veliKayitNo).length() != 5) {
                        JOptionPane.showMessageDialog(null, "Veli kayıt numarası 5 hane olmalıdır.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit the method if there is an error
                    }
                    String veliAd = veliAdTextField.getText();
                    String veliSoyad = veliSoyadTextField.getText();
                    String veliTelefon = veliTelefonTextField.getText();

                    // Create objects
                    Ogrenci ogrenci = new Ogrenci(ogrenciNo, ogrenciTc, ogrenciAd, ogrenciSoyad, ogrenciSinif, ogrenciOgretmen, ogrenciVeliAdSoyad);
                    Ogretmen ogretmen = new Ogretmen(ogretmenSicilNo, ogretmenAd, ogretmenSoyad, ogretmenAnabrans, ogretmenSorumluSinif);
                    Veli veli = new Veli(veliKayitNo, veliAd, veliSoyad, veliTelefon);

                    // Add objects to lists
                    ogrenciListesi.add(ogrenci);
                    ogretmenListesi.add(ogretmen);
                    veliListesi.add(veli);

                    // Clear text fields
                    clearTextFields();
                    JOptionPane.showMessageDialog(null, "Kayıt başarıyla oluşturuldu, Ekran1'e dönüp kaydı sorgulayabilirsiniz.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);


                } catch (NumberFormatException ex) {
                    // Handle the exception by displaying a message box
                    JOptionPane.showMessageDialog(null, "Bir hata oluştu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void clearTextFields() {
                // Clear all text fields
                ogrenciNoTextField.setText("");
                ogrenciTcTextField.setText("");
                ogrenciAdTextField.setText("");
                ogrenciSoyadTextField.setText("");
                ogrenciSinifTextField.setText("");
                ogrenciOgretmenTextField.setText("");
                ogrenciVeliAdSoyadTextField.setText("");

                ogretmenSicilNoTextField.setText("");
                ogretmenAdTextField.setText("");
                ogretmenSoyadTextField.setText("");
                ogretmenAnabransTextField.setText("");
                ogretmenSorumluSinifTextField.setText("");

                veliKayitNoTextField.setText("");
                veliAdTextField.setText("");
                veliSoyadTextField.setText("");
                veliTelefonTextField.setText("");
            }
        });


        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(18, 2, 10, 10));
        panel2.add(new JLabel("Öğrenci Numarası(6 Basamak):"));
        panel2.add(ogrenciNoTextField);
        panel2.add(new JLabel("Öğrenci TC Numarası:"));
        panel2.add(ogrenciTcTextField);
        panel2.add(new JLabel("Öğrenci Adı:"));
        panel2.add(ogrenciAdTextField);
        panel2.add(new JLabel("Öğrenci Soyadı:"));
        panel2.add(ogrenciSoyadTextField);
        panel2.add(new JLabel("Öğrenci Sınıfı:"));
        panel2.add(ogrenciSinifTextField);
        panel2.add(new JLabel("Öğrenciden Sorumlu Öğretmen:"));
        panel2.add(ogrenciOgretmenTextField);
        panel2.add(new JLabel("Öğrencinin Velisinin Adı Soyadı:"));
        panel2.add(ogrenciVeliAdSoyadTextField);

        panel2.add(new JLabel("Öğretmen Sicil Numarası(4 Basamak):"));
        panel2.add(ogretmenSicilNoTextField);
        panel2.add(new JLabel("Öğretmen Adı:"));
        panel2.add(ogretmenAdTextField);
        panel2.add(new JLabel("Öğretmen Soyadı:"));
        panel2.add(ogretmenSoyadTextField);
        panel2.add(new JLabel("Öğretmen Anabranşı:"));
        panel2.add(ogretmenAnabransTextField);
        panel2.add(new JLabel("Öğretmen Sorumlu Olduğu Sınıf:"));
        panel2.add(ogretmenSorumluSinifTextField);

        panel2.add(new JLabel("Veli Kayıt Numarası(5 Basamak):"));
        panel2.add(veliKayitNoTextField);
        panel2.add(new JLabel("Veli Adı:"));
        panel2.add(veliAdTextField);
        panel2.add(new JLabel("Veli Soyadı:"));
        panel2.add(veliSoyadTextField);
        panel2.add(new JLabel("Veli Telefonu:"));
        panel2.add(veliTelefonTextField);

        panel2.add(kaydetButton);
        panel2.add(donButton);
                
        frame2.add(panel2);
        frame2.setVisible(false);
    }
    private void tumKayitlariGoster() {
        StringBuilder message = new StringBuilder();

        int maxIndex = Math.max(Math.max(ogrenciListesi.size(), ogretmenListesi.size()), veliListesi.size());

        for (int i = 0; i < maxIndex; i++) {
        	 message.append("Kayıt ").append(i + 1).append(":\n");
            if (i < ogrenciListesi.size()) {
                Ogrenci ogrenci = ogrenciListesi.get(i);
                message.append("----Öğrenci Bilgileri----\n")
                        .append("Öğrenci Numarası: ").append(ogrenci.getOgrenciNo()).append("\n")
                        .append("Öğrenci TC Numarası: ").append(ogrenci.getOgrenciTc()).append("\n")
                        .append("Öğrenci Adı: ").append(ogrenci.getOgrenciAd()).append("\n")
                        .append("Öğrenci Soyadı: ").append(ogrenci.getOgrenciSoyad()).append("\n")
                        .append("Öğrenci Sınıfı: ").append(ogrenci.getOgrenciSinif()).append("\n")
                        .append("Öğrenciden Sorumlu Öğretmen: ").append(ogrenci.getOgrenciOgretmen()).append("\n")
                        .append("Öğrencinin Velisinin Adı Soyadı: ").append(ogrenci.getOgrenciVeliAdSoyad()).append("\n\n");
            }

            if (i < ogretmenListesi.size()) {
                Ogretmen ogretmen = ogretmenListesi.get(i);
                message.append("----Öğretmen Bilgileri----\n")
                        .append("Öğretmen Sicili Numarası: ").append(ogretmen.getOgretmenSicilNo()).append("\n")
                        .append("Öğretmen Adı: ").append(ogretmen.getOgretmenAd()).append("\n")
                        .append("Öğretmen Soyadı: ").append(ogretmen.getOgretmenSoyad()).append("\n")
                        .append("Öğretmen Anabranşı: ").append(ogretmen.getOgretmenAnabrans()).append("\n")
                        .append("Öğretmen Sorumlu Olduğu Sınıf: ").append(ogretmen.getOgretmenSorumluSinif()).append("\n\n");
            }

            if (i < veliListesi.size()) {
                Veli veli = veliListesi.get(i);
                message.append("----Veli Bilgileri----\n")
                        .append("Veli Kayıt Numarası: ").append(veli.getVeliKayitNo()).append("\n")
                        .append("Veli Adı: ").append(veli.getVeliAd()).append("\n")
                        .append("Veli Soyadı: ").append(veli.getVeliSoyad()).append("\n")
                        .append("Veli Telefonu: ").append(veli.getVeliTelefon()).append("\n\n\n\n");
            }
        }

        JTextArea textArea = new JTextArea(message.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JOptionPane.showMessageDialog(frame1, scrollPane, "Kayıtlar", JOptionPane.PLAIN_MESSAGE);
    }
    private void ikinciSayfayiGoster() {
        frame1.setVisible(false);
        frame2.setVisible(true);
        JButton gosterButton = new JButton("Göster");
        gosterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Alınan bilgileri kullanıcıya göster
                Ogrenci ogrenci = new Ogrenci(
                        Integer.parseInt(ogrenciNoTextField.getText()),
                        ogrenciTcTextField.getText(),
                        ogrenciAdTextField.getText(),
                        ogrenciSoyadTextField.getText(),
                        ogrenciSinifTextField.getText(),
                        ogrenciOgretmenTextField.getText(),
                        ogrenciVeliAdSoyadTextField.getText()
                );

                Ogretmen ogretmen = new Ogretmen(
                        Integer.parseInt(ogretmenSicilNoTextField.getText()),
                        ogretmenAdTextField.getText(),
                        ogretmenSoyadTextField.getText(),
                        ogretmenAnabransTextField.getText(),
                        ogretmenSorumluSinifTextField.getText()
                );

                Veli veli = new Veli(
                        Integer.parseInt(veliKayitNoTextField.getText()),
                        veliAdTextField.getText(),
                        veliSoyadTextField.getText(),
                        veliTelefonTextField.getText()
                );

                // Yeni kayıtları listelere ekle
                ogrenciListesi.add(ogrenci);
                ogretmenListesi.add(ogretmen);
                veliListesi.add(veli);

                // Sayfa 1'e geri dön
                frame2.setVisible(false);
                frame1.setVisible(true);
            }
        });
    }
    
    
}

