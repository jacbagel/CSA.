public class StringsExercises {
    public static void main(String[] args) {
        //Done
        // System.out.println(scroll("Hello World"));
        // System.out.println(scroll("happy"));
        // System.out.println(scroll("h"));
        
        //Done
        // System.out.println(convertName(" Reubenstein, Lori Renee  "));
        // System.out.println(convertName("Biden,Joe"));
        // System.out.println(convertName("the Clown, Bozo"));
        
        //Done
        //System.out.println(negative("0010111001"));
        //System.out.println(negative("11111111"));
        
        //Done
        //System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        //Done
        // System.out.println("04/20/2014 becomes" + dateString2("04/20/2014")); //20-04-2014
        // System.out.println("4/20/2014 becomes" + dateString2("4/20/2014")); //20-4-2014
        // System.out.println("04/2/2014 becomes" + dateString2("04/2/2014")); //2-04-2014
        // System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
        
        //Done
        // System.out.println("\nstartsWith"); 
        // System.out.println(startsWith("architecture", "arch")); //true
        // System.out.println(startsWith("architecture", "a")); //true
        // System.out.println(startsWith("arch", "architecture")); //false
        // System.out.println(startsWith("architecture", "rch")); //false
        // System.out.println(startsWith("architecture", "architecture")); //true
        
        //Done
        // System.out.println("\nendsWith");
        // System.out.println(endsWith("astronomy", "nomy")); //true
        // System.out.println(endsWith("astronomy", "y")); //true
        // System.out.println(endsWith("astronomy", "nom")); //false
        // System.out.println(endsWith("nomy", "astronomy")); //false
        // System.out.println(endsWith("astronomy", "astronomy")); ///true
        
        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b")); //Hello world
        // System.out.println(removeTag("<b>Hello World</b>", "head"));
        // System.out.println(removeTag("Hello World</b>", "b"));
        // System.out.println(removeTag("<b>Hello World", "b"));
        // System.out.println(removeTag("</img>Hello World<img>", "img"));
        // System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        // System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
        // "title"));
        // System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }

    public static String scroll(String fend){
        return fend.substring(1) + fend.charAt(0);
    }

    public static String convertName(String name){
        int c = name.indexOf(",");
        name = name.substring(c+1).trim() + " " + name.substring(0, c).trim();
        return name;
    }

    public static String negative(String numb){
        numb = numb.replace('0','2');
        numb = numb.replace('1','0');
        numb = numb.replace('2', '1');
        return numb;
    }

    public static String dateString(String america){
        String europe = " " + america.substring(3,5) + "-" + america.substring(0,2) + "-" + america.substring(6,10);
        return europe;
    }

    public static String dateString2(String america2){
        int s = america2.indexOf('/');
        int sl = america2.lastIndexOf('/');
        String day = america2.substring((s+1), (sl)); 
        String month = america2.substring(0, (s));
        String year = america2.substring((sl+1));
        String europe2 = " " + day + "-" + month + "-" + year;
        return europe2;
    }

    public static boolean startsWith(String s, String prefix){
        int lp = prefix.length();
        int ls = s.length();
        if (lp<=ls && prefix.charAt(0) == s.charAt(0)){
            return true;
        }
        return false;
    }

    public static boolean endsWith(String s, String sufix){
        int sl = sufix.length();
        int wl = s.length();
        if (sl <= wl && sufix.charAt(sl-1) == s.charAt(wl-1)){
            return true;
        }
        return false;
    }
 
    public static String removeTag(String link, String tag){
        int fb = link.indexOf("<");
        if (fb == 0);

        }

    }
