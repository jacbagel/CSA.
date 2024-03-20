public class StringPractice {
    public static String scroll(String s){
        String s1=s.substring(0,1);
        String s2=s.substring(1);
        String s3=s2+s1;
        return s3;
    }
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