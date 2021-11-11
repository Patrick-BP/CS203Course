package CustomArray;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Videos vd = new Videos();
        Videos vd1 = new Videos("Rambo",45);
        Videos vd2 = new Videos("Rambo1",56);
        Videos vd3 = new Videos("Rambo2",78);
        Videos vd4 = new Videos("Rambo3",34);
        Videos vd5 = new Videos("Rambo4",30);

        Videos[] allvideos = {vd1,vd2,vd3,vd4,vd5,vd1,vd2,vd3,vd4,vd5,vd1,vd2,vd3,vd4,vd5,vd1,vd2,vd3,vd4,vd5};
        CustomArrays customArrays = new CustomArrays();
        for (Videos e: allvideos) {
            customArrays.add(e);
        }
        System.out.println(Arrays.toString(customArrays.getVideos()));

        System.out.println("=====================Sort by duration======================");
        Arrays.sort(allvideos, new Videos());
        System.out.println(Arrays.toString(allvideos));
    }


}
