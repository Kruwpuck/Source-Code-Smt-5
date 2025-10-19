package com.mycompany.tp6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }

    public void isiTangkiFull() {
        this.waktuIsiBensin = LocalDateTime.now();
    }

    public String cekKapanHabis() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return this.waktuIsiBensin.plusHours(ukuranTangki).format(formatter);
    }

    public boolean jalan() {
        if (this.waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        }
        System.out.println("Sepeda motor sedang berjalan");
        return true;
    }
}

class HandoBaet extends SepedaMotor {
    public HandoBaet(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 4;
    }

    @Override
    public boolean jalan() {
        if (!super.jalan()) {
            return false;
        }
        System.out.println("Motor Baet akan habis bensin pada " + cekKapanHabis());
        return true;
    }
}

class YahamaMoi extends SepedaMotor {
    public YahamaMoi(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 5;
    }

    @Override
    public boolean jalan() {
        if (!super.jalan()) {
            return false;
        }
        System.out.println("Bensin akan habis pada " + cekKapanHabis());
        return true;
    }
}

public class TP6 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");

        System.out.println("Status Awal Sepeda Motor:");
        System.out.println(sp.jalan());
        System.out.println("Status Awal HandoBaet:");
        System.out.println(hb.jalan());
        System.out.println("Status Awal YahamaMoi:");
        System.out.println(ym.jalan());
        System.out.println("-------------------------------------");

        System.out.println("Status Terbaru Sepeda Motor:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        sp.isiTangkiFull();
        sp.jalan();
        System.out.println(sp.cekKapanHabis());
        System.out.println("");
        
        System.out.println("Status Terbaru HandoBaet:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        hb.isiTangkiFull();
        hb.jalan();
        System.out.println("");
        
        System.out.println("Status Terbaru YahamaMoi:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        ym.isiTangkiFull();
        ym.jalan();
    }
}
