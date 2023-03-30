
package Invertebrata;

public class KlasifikasiHewanInvertebrata {
    public static void main(String[] args) {
        KakiTiga semut = new KakiTiga("Semut", 6, "Three joints");
        KakiTiga kecoak = new KakiTiga("Kecoak", 6, "Three joints");
        KakiTiga kepik = new KakiTiga("Kepik", 6, "Three joints");
        LebihDariKakiTiga kalajengking = new LebihDariKakiTiga("Kalajengking", 8, "More than three joints");
        LebihDariKakiTiga spider = new LebihDariKakiTiga("Laba-laba", 8, "More than three joints");
        LebihDariKakiTiga kakiseribu = new LebihDariKakiTiga("Kaki Seribu", 300, "More than three joints");
        Melata cacingtanah = new Melata("Cacing Tanah", true, "Worm-like");
        Melata lintah = new Melata("Lintah", true, "Worm-like");
        TidakMelata trematoda = new TidakMelata("Trematoda", false, "Not worm-like");
        TidakMelata cacingpita = new TidakMelata("Cacing Pita", false, "Not worm-like");
        
        System.out.printf("%-12s%-12b%-18s\n", "Name", "Legs", "Joint Type / Body Shape");
        System.out.println("------------------------------------------------");
        semut.display();
        kecoak.display();
        kepik.display();
        kalajengking.display();
        spider.display();
        kakiseribu.display();
        cacingtanah.display();
        lintah.display();
        trematoda.display();
        cacingpita.display();

    }
}
