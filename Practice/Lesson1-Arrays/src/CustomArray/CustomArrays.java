package CustomArray;

import java.util.Arrays;

public class CustomArrays {

    private Videos[] videos;
    private int size;

    public CustomArrays() {
        this.videos = new Videos[10];
        this.size = 0;
    }

    public Videos[] getVideos() {
        return videos;
    }

    public void add(Videos o){
        videos[size] = o;
        size++;
        if(size == videos.length)resize();
    }
    public int size(){
        return size;
    }
    public void resize(){
        videos = Arrays.copyOf(videos, videos.length*2);
    }

    @Override
    public String toString() {
        return "CustomArrays{" +
                "videos=" + Arrays.toString(videos) +
                ", size=" + size +
                '}';
    }
}
