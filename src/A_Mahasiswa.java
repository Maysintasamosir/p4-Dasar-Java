package konsepoop;
public class A_Mahasiswa {
    public int nrp;
    public String nama;
    public void info() {
        System.out.println("lni siswa RPL Polbeng");
    }
        public static void main(String argsO) {
            konsepoop.A_Mahasiswa it = new konsepoop.A_Mahasiswa();
            it.nrp = 5;
            it.nama = "Andi";
            it.info();
        }
        }
