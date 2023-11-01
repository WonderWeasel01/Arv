import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      Bus b1 = new Bus(200.2,"bk23230",20,2);
      Lastbil l1 = new Lastbil(400.10, "cx20900",280, 2000 );
      Personvogn p1 = new Personvogn(100.2,"hj84683", 200,"20",20);

      /*b1.udskriv();
      l1.udskriv();
      p1.udskriv();*/

        ArrayList<Koeretoej> tabel = new ArrayList<>();
        tabel.add(b1);
        tabel.add(l1);
        tabel.add(p1);

        for (int i = 0; i < tabel.size();i++){
            tabel.get(i).udskriv();
        }
    }
}
