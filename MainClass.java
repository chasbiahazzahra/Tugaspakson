
package TugasLima;

public class MainClass {
    public static void main(String[] args) {
        Barang b = new Barang();
        Laporan l = new Laporan();
        l.laporan(b);
        
        Member m = new Member();
        l.laporan(m);
        
        Transaksi t = new Transaksi();
        l.laporan(t, b);
        
    }
}
