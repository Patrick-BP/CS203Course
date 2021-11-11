import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaTube {
    class SortVideosByTitle implements Comparator<Video> {
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    class SortVideosByViews implements Comparator<Video> {
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews() - o2.getViews();
        }
    }



    public static void main(String[] args) {

        CookingVideo cv1 = new CookingVideo("pie-video", 30, 345, 567, 15,
                new Recipe("pie", "ing1,ing2,ing3", "mix with water", 45, 50, 7));
        CookingVideo cv2 = new CookingVideo("rice-video", 30, 100, 50, 15,
                new Recipe("rice", "ing4,ing5,ing6", "mix with water and sugar", 35, 55, 3));
        CookingVideo cv3 = new CookingVideo("potato-video", 20, 678, 800, 15,
                new Recipe("potato", "ing7,ing8,ing9", "mix with water and salt", 45, 60, 5));


        GamingVideo gamingVideo1 = new GamingVideo("COD-video", 100, 567, 67, 56, "COD");
        GamingVideo gamingVideo2 = new GamingVideo("MARIO-video", 250, 767, 194, 30, "MARIO");
        GamingVideo gamingVideo3 = new GamingVideo("RESIDENT-EVIL-video", 160, 987, 500, 60, "RESIDENT-EVIL");
        GamingVideo gamingVideo4 = new GamingVideo("NEED4SPEED-video", 400, 56, 600, 56, "NEED4SPEED");


        Video[] allVideos = {cv1, cv2, cv3, gamingVideo1, gamingVideo2, gamingVideo4, gamingVideo3};
        CookingVideo[] cookingVideos = {cv1, cv2, cv3};
        GamingVideo[] gamingVideos = {gamingVideo1, gamingVideo2, gamingVideo3, gamingVideo4};

        System.out.println("\n============== Print AllVideos ==========================\n");

        videoPrinter(allVideos);

        System.out.println("\n============== Sort the allvideos array naturally ==========================\n");
        Arrays.sort(allVideos);
        videoPrinter(allVideos);

        System.out.println("\n============== Sort the allvideos array By title using inner class ==========================\n");
        JavaTube jt = new JavaTube();
        Arrays.sort(allVideos, jt.new SortVideosByTitle());
        videoPrinter(allVideos);

        System.out.println("\n============== Sort the allvideos arrayBy Views  using inner class ==========================\n");

        Arrays.sort(allVideos, jt.new SortVideosByViews());
        videoPrinter(allVideos);


        System.out.println("\n============== print allCookingVideosList ==========================\n");
        List<CookingVideos> CookingVideosList = new ArrayList<>() ;
        CookingVideosList.add(cv1);
        CookingVideosList.add(cv2);
        CookingVideosList.add(cv3);
        printAllCookingVideos(CookingVideosList);


        System.out.println("\n============== printAllCookingRecipes ==========================\n");
        printAllCookingRecipes(cookingVideos);


    }


    public void sortCookingVideoByIngredientList(){

    }

public static void sortCookingVideoByServingSizeDescending(){}



    void sortCookingVideoByIngredientList(Recipe r) {

        class sortCookingVideoByIngredientList implements Comparator<Recipe> {

            @Override
            public int compare(Recipe o1, Recipe o2) {
                return o1.getIngredients().length() - (o2.getIngredients().length());
            }

        }
    }

    public static void videoPrinter(Video[] v){
        for (Video e: v) {
            System.out.println(e.toString());
        }
    }
    public static void printAllCookingRecipes(CookingVideos[] cv){
        for (CookingVideos e: cv) {
            System.out.println(e.getCookingRecipe().toString());
        }
    }
    public static void printAllCookingVideos(List<CookingVideos> cvList){
        for (CookingVideos e: cvList) {
            System.out.println(e.toString());
        }
    }
}
