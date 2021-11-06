public class Video  implements Comparable<Video>{
    private String title;
    private double durationInMinutes;
    private int views;
    private int likes;
    private double watchTime;


    public Video() {
        title = "unknown";
        durationInMinutes = 0;
        views = 0;
        likes = 0;
        watchTime = 0.0;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public int compareTo(Video o) {
        return (int)(watchTime - o.watchTime);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof Video) return false;
        Video e = (Video) obj;
        return (watchTime == e.watchTime)&&(title.equals(e.title));
    }

    @Override
    public String toString() {
        return
                "title: " + title + "." +
                " durationInMinutes: " + durationInMinutes +"."+
                " views: " + views +"."+
                " likes: " + likes +"."+
                " watchTime: " + watchTime+".";
    }
}
