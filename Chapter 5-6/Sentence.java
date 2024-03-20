    public class Sentence {
    private String currSent;
    public Sentence(String p) {
        currSent = p;
    }
    public String toString() {
        return currSent;
    }
    public int findNthTime(String str, int n) {
        int a=0;
        for(int i=0;i<n;i++){
            int b=a;
            if(i==0) a=currSent.indexOf(str);
            else a=currSent.indexOf(str,b+str.length());
            if(a==-1) return -1;
    }
        return a;
    }

    public void replaceNthTime(String str, int n, String repl) {
        int a=findNthTime(str, n);
        if(a!=-1) currSent=currSent.substring(0,a)+repl+currSent.substring(a+str.length());
    }

    public int findLastTime(String str) {
        int a=1;
        int counter=1;
        while(a!=-1){
            a=findNthTime(str,counter);
            if(counter==1&&a==-1) return -1;
            counter++;
        }
    return findNthTime(str,counter-2);  
    }


    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A cat ate late.");
        System.out.println(sentence1.findNthTime("at",1));
        sentence1.replaceNthTime("at", 1, "rane");
        System.out.println(sentence1);

        Sentence sentence2 = new Sentence("A cat ate late.");
        System.out.println(sentence2.findNthTime("at",6));
        sentence2.replaceNthTime("at", 6, "xx");
        System.out.println(sentence2);

        Sentence sentence7 = new Sentence("A cat ate late.");
        System.out.println(sentence7.findNthTime("at",3));
        sentence7.replaceNthTime("at", 3, "xx");
        System.out.println(sentence7);

        Sentence sentence3 = new Sentence("A cat ate late.");
        System.out.println(sentence3.findNthTime("bat",2));
        sentence3.replaceNthTime("bat", 2, "xx");
        System.out.println(sentence3);

        Sentence sentence4 = new Sentence("aaaa");
        sentence4.replaceNthTime("aa", 1, "xx");
        System.out.println(sentence4);

        Sentence sentence5 = new Sentence("aaaa");
        sentence5.replaceNthTime("aaa", 2, "bbb");
        System.out.println(sentence5);

        Sentence sentence6 = new Sentence("A cat ate late.");
        System.out.println(sentence6.findLastTime("at"));
        System.out.println(sentence6.findLastTime("cat"));
        System.out.println(sentence6.findLastTime("bat"));
    }
}
