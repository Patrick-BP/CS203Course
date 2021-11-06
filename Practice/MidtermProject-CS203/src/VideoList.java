import java.util.Arrays;

public class VideoList {
    private Video[] videos;
    private int size;

    public VideoList() {
        videos = new Video[10];
        size= 0;
    }
    public void add(Video v){
        videos[size] = v;
        size++;
    }
    public int size(){
        return size;
    }
    public void resize(){
        videos = Arrays.copyOf(videos, videos.length*2);
    }

    @Override
    public String toString() {
        return "VideoList{" +
                "videos=" + Arrays.toString(videos) +
                ", size=" + size +
                '}';
    }
}
