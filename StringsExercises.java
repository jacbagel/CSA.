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

        //
        System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
        
        // System.out.println("\nstartsWith"); 
        // System.out.println(startsWith("architecture", "arch"));
        // System.out.println(startsWith("architecture", "a"));
        // System.out.println(startsWith("arch", "architecture"));
        // System.out.println(startsWith("architecture", "rch"));
        // System.out.println(startsWith("architecture", "architecture"));
        
        // System.out.println("\nendsWith");
        // System.out.println(endsWith("astronomy", "nomy"));
        // System.out.println(endsWith("astronomy", "y"));
        // System.out.println(endsWith("astronomy", "nom"));
        // System.out.println(endsWith("nomy", "astronomy"));
        // System.out.println(endsWith("astronomy", "astronomy"));
        
        // System.out.println("\nremoveTag");
        // System.out.println(removeTag("<b>Hello World</b>", "b"));
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
        // formart 
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
        int s = america2.indexOf('/'); //04/
        int sl = america2.lastIndexOf('/'); // /year
        String day = america2.substring((s), (sl));
        String month = america2.substring(0, (s-1));
        String year = america2.substring((sl-1));
        String europe2 = " " + day + "-" + month + "-" + year;
        return europe2;
    }


 
}