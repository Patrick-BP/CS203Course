package Question4;

public class Q4 {
    public static void main(String[] args) {
        String str = "DAD,RISK,JAVA,MALAYALAM,RACECAR,RADAR,ROTOR,REFER,SEDES,SOLOS,COURSE,STATS,TOROT,TENET,MACHINE,VIRTUAL,STUDENT,PULLUP,PROGRAMME,CORE";
        String[] str2 = str.split(",");
        String str4 = "";
        int counter=0;

        for (String e: str2) {
            for(int i=e.length()-1; i>=0; i--){

                str4 += e.charAt(i);
            }
            if (str4.equals(e))counter++;
            str4="";
        }
        System.out.println(counter);
    }

}
