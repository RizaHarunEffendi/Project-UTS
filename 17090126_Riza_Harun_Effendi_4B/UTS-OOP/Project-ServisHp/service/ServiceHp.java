package service;

import entity.*;
import java.util.*;

public class ServiceHp{

    private static List<Hp> data = new LinkedList<Hp>();

    public void tambahData(Hp hp) {
        ServiceHp.data.add(hp);
        System.out.println("Data Pelanggan Tersimpan");
    }

    public void ubahData(Hp hp) {
        int result = data.indexOf(hp);
        if(result >= 0) {
            data.set(result, hp);
            System.out.println("Data Pelanggan Telah Berubah");
        }
    }

    public void hapusData(String no) {
        int idx = data.indexOf(new Hp(no, "", "","","",""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data Pelanggan Telah Terhapus");
        } else {
            System.out.println("Data Kosong");
        }
    }

    public void cetakData() {
        System.out.println("------Cetak Data Pelanggan------");
        int i=1;
        for(Hp hp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("   No Urut   : " + hp.getNo());
            System.out.println("   Nama      : " + hp.getNama());
            System.out.println("   Alamat    : " + hp.getAlamat());
            System.out.println("   Merk Hp   : " + hp.getMerk_hp());
            System.out.println("   Kerusakan : " + hp.getKrs());
            System.out.println("   Biaya     : " + hp.getBiaya());

        }
    }
}