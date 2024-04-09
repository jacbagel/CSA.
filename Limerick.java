public class Limerick extends Poem {
    private int[] syllables = {9,9,6,6,9};

    public Limerick(){
        super(5);
    }

    public int getSyllables(int k) {
        return syllables[k-1];
    }

    public void printRhythm(){
        for(int i = 0; i < syllables.length; i++){ // does three rows
             for(int k = 0; k < getSyllables(i+1); k++ )
                 System.out.print("ta");
         System.out.println();
     }
    }
}

