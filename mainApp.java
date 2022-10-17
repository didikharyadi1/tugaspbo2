

public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("Didi Haryadi", "Batu Nyala", "087635928536");

        penggajian penggajian=new penggajian("Rp.3.700.000", "Rp.2.700.000", "Rp.5.000.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Sales");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }


}
