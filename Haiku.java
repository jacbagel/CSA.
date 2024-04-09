public class Haiku extends Poem {
    private int[] syllables = {5,7,5};

    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
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
