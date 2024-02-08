public class FRQpractice {
    public static void main(String []args){
        System.out.println("Scroll");
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        System.out.println();

        System.out.println("Convert Name");
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        System.out.println();

        System.out.println("Negative");
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        System.out.println();

        System.out.println("Convert Date");
        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        System.out.println();

        System.out.println("Convert Date 2");
        System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));
        System.out.println();

        System.out.println("Starts With");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));

        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        System.out.println();

        System.out.println("End With");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        System.out.println();

        System.out.println("Remove Tag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
"title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}

    public class ErrorLog {
        private String machineId;
        private String description;
        public ErrorLog(String message){
            machineId=message.substring(0,message.indexOf(":"));
            description=message.substring(message.indexOf(":")+1);  
        }
        public boolean containsKey(String keyword){
            String desc=getDescription();
            int a=desc.indexOf(keyword);
            int b=keyword.length();
            int c=desc.length();
            if(a==-1) return false;
            if(a==0) return true;
            if(a+b==c){
                String t=desc.substring(a-1);
                String t1=t.trim();
                if(t1.length()+1==t.length()) return true;
            }
            else if(a>0){
                String s=desc.substring(a-1,a+b+1);
                String s1=s.trim();
                if(s1.length()+2==s.length()) return true;
            }
            return false;
        }
        public String getMachineId() { return machineId;}
        public String getDescription() { return description; }
        public static void main(String[] args) {
            ErrorLog er1 = new ErrorLog("CLIENT2:security alert");
            ErrorLog er2 = new ErrorLog("Webserver:disk offline");
            ErrorLog er3 = new ErrorLog("SERVER22:file not found on disk3");
            ErrorLog er4 = new ErrorLog("SERVER15:read error on disk DSK7");
            ErrorLog er5 = new ErrorLog("SERVER22:write error on disk");
            ErrorLog er6 = new ErrorLog("Webserver:error on /dev/disk");
            ErrorLog er7 = new ErrorLog("Webserver:disk");

            System.out.println("message 1 " + er1.containsKey("disk"));
            System.out.println("message 2 " + er2.containsKey("disk"));
            System.out.println("message 3 " + er3.containsKey("disk"));
            System.out.println("message 4 " + er4.containsKey("disk"));
            System.out.println("message 5 " + er5.containsKey("disk"));
            System.out.println("message 6 " + er6.containsKey("disk"));
            System.out.println("message 6 " + er6.containsKey("error"));
            System.out.println("message 7 " + er7.containsKey("disk"));
        }
    }

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


public class StringPractice {
    public static String scroll(String s){
        String s1=s.substring(0,1);
        String s2=s.substring(1);
        String s3=s2+s1;
        return s3;
    }

    public static String convertName(String s){
        int a=s.indexOf(",");
        String b=s.substring(0,a);
        String c=s.substring(a+1);
        b= b.trim();
        c=c.trim();
        String d=c+" "+b;
        return d;
    }

    public static String negative(String s){
        String s1=s.replace("0","3");
        String s2=s1.replace("1","0");
        String s3=s2.replace("3","1");
        return s3;
    }

    public static String convertDate(String dateStr){
        int a=dateStr.indexOf("/");
        String b=dateStr.substring(0,a);
        int a1=dateStr.indexOf("/",a+1);
        String b1=dateStr.substring(a+1,a1);
        int a2=dateStr.lastIndexOf("/");
        String b2=dateStr.substring(a2+1);
        String c=b1+"-"+b+"-"+b2;
        return c;
    }

    public static String convertDate2(String s){
        int a=s.indexOf("/");
        String b=s.substring(0,a);
        int a1=s.indexOf("/",a+1);
        String b1=s.substring(a+1,a1);
        int a2=s.lastIndexOf("/");
        String b2=s.substring(a2+1);
        if(b1.length()<=1){
            b1="0"+b1;
        }
        if(b2.length()<=1){
            b2="0"+ b2;
        }
        if(b.length()<=1){
            b="0"+b;
        }
        String c=" "+b1+"-"+b+"-"+b2;
        return c;
    }

    public static boolean startsWith(String s, String prefix){
        int a=prefix.length();
        int d=s.length();
        if(d<a) return false;
        String b=s.substring(0,a);
        if(b.equals(prefix)) return true;
        else return false;
    }

    public static boolean endsWith(String s,String suffix){
        int a=suffix.length();
        int d=s.length();
        if(a>d) return false;
        String b=s.substring(d-a);
        if(b.equals(suffix)) return true;
        else return false;
    }


    public static String removeTag(String a, String b){
        int c= b.length();
        int d=a.indexOf("<"+b+">");
        int d1=a.indexOf("</"+b+">");
        if(d1!=-1&&d!=-1&&d<d1){
            String s=a.substring(d+c+2,d1);
            return s;
        }
        else return a;
    }
}