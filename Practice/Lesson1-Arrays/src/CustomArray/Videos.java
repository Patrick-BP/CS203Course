package CustomArray;

import java.util.Comparator;

public class Videos implements Comparator<Videos> {

    private String name;
    private int duration;

    public Videos() {
        this.name = "unknown";
        this.duration = 0;
    }

    public Videos(String name , int duration) {
        this.name = name;
        this.duration = duration;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                 name +": "+duration ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(!(obj instanceof Videos)) return false;
        Videos v = (Videos) obj;
        return this.duration == v.duration;
    }

    @Override
    public int compare(Videos o1, Videos o2) {
        return o1.duration - o2.duration;
    }
}

