public class QuickSort_SV {
    int[] zufallszahlen =  new int[25];

    public QuickSort_SV(){
       erzeugeZufaellig(zufallszahlen);
       ausgabeInt(zufallszahlen);
       sortiere (zufallszahlen,0,zufallszahlen.length-1);
       ausgabeInt(zufallszahlen);
    }

    
    public void sortiere(int[] a, int von, int bis){
      if (von < bis){
         int pos =  teilung(a, von, bis);
         sortiere();//linke Seite sortieren
         _____//rechte Seite sortieren
      }
    }

    public int teilung (int[] a, int von, int bis){
     // von < bis
     int x = a[(von+bis)/2];
     int i = von-1;
     int j = bis+1;
     while (true) {
        do _____; while ( a[j] > x );
        do s_____; while ( _____ );
        if (i < j) {  // tausche, engl. swap
           int h = a[i];
           a[i] = a[j];
           a[j] = h;
        }
        else return j;
     }
    }

    public void erzeugeZufaellig (int a[]){
      for (int k=0 ; k<a.length ;k++  ) {
        a[k] = (int) (Math.random() * 100);
      }
    }// erzeuge

     public void ausgabeInt (int[] a) {
        for (int k=0; k<a.length; k++) {
            System.out.print(a[k]);
            System.out.print(" ");
        }
        System.out.println();
    }



} //Quicksort


