/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.java;

/**
 *
 * @author rifial
 */   
class Pesawat {
    String maskapai;
    String jenis; 

    public void terbang() {
        System.out.println("Pesawat terbang mengudara.");
    }

    void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }
}

class PesawatJet extends Pesawat {
    final String mesin = "Jet";
    private int kecepatan; // dalam km/jam

    // Get
    public int getKecepatan() {
        return kecepatan;
    }

    // Set
    public void setKecepatan(int newKecepatan) {
        if (newKecepatan > 0) {
            this.kecepatan = newKecepatan;
        } else {
            System.out.println("Kecepatan tidak valid.");
        }
    }
}

public class TugasJava {
    public static void main(String[] args) {
        PesawatJet pesawatA = new PesawatJet();
        pesawatA.setMaskapai("Garuda Indonesia");
        pesawatA.jenis = "Boeing 777";
        pesawatA.setKecepatan(90000000);

        System.out.println("Maskapai: " + pesawatA.maskapai);
        System.out.println("Jenis Pesawat: " + pesawatA.jenis);
        System.out.println("Mesin: " + pesawatA.mesin);
        System.out.println("Kecepatan: " + pesawatA.getKecepatan() + " km/jam");
        pesawatA.terbang();
    }
}