public class Ex2 {
    public static void main(String[] args) {
        String prop = "Ana are mere.";
        int nr = 0;
        char[] arrayCaractere = prop.toCharArray();
        for (char element : arrayCaractere) {
//            System.out.println(element);
            if(element=='a' || element=='e' || element=='i' || element=='o'||element=='u'|| element=='A'||
                    element=='E' || element=='I' || element=='O'|| element=='U'   ){
                nr++;
            }
        }
        System.out.println("numarul vocalelor este: "+nr);
    }
}