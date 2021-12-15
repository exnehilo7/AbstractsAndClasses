/* driver to test code -- use with Lot.java, LotType1.java, LotType2.java */
/* implement LotType1 and LotType2 prior to testing */

/* once everything is correctly implemented, the output of this driver
   will be:
Lot ID L3 has area: 13500.0 
Lot ID L2 has area: 27000.0 
Lot ID L1 has area: 35000.0 
Lot ID L4 has area: 70000.0 
*/

public class TestLots {
    
  public static void main(String args[]){  
        // an array of lots -- some of type1, some of type2
        Lot[] lots = {new LotType1("L1",350, 200),
                      new LotType2("L2",100,270),
                      new LotType1("L3",100, 270),
                      new LotType2("L4",350,200)
                     };

        // sort the lots of mixed types by area (note, you'll have to implement
        // Comparable interface correctly in LotType1 and LotType2 for this to work:
        java.util.Arrays.sort(lots);

        // print out sorted results
        for (Lot lot: lots) {
          System.out.print(lot + " "); 
          System.out.println();
        }
    } 
}
