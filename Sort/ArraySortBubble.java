import java.util.Arrays;
/**
 * Beschreiben Sie hier die Klasse ArraySortBubble.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ArraySortBubble
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int[] arr = {1, 8, 0, 5, 88, 9, 6};

    /**
     * Konstruktor für Objekte der Klasse ArraySortBubble
     */
    public ArraySortBubble()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    public void bubbleSort(int n){
        
        if(n < 7){
        if(arr[n] > arr[n - 1]){
            int strgc = arr[2];
            arr[2] = arr[1];
            arr[1] = strgc;
            System.out.println("T1");
            bubbleSort(n + 1);
        }
        else{
            System.out.println("T2");
            bubbleSort(n + 1);
        }
    
    }
    else System.out.printf("Array fertig sortiert es lautet nun: %s", Arrays.toString(arr));
}
}
