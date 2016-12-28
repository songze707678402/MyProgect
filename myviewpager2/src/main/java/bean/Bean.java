package bean;

/**
 * Created by 宋泽港 on 2016/12/28.
 */

public class Bean {
    /**
     *
     */
    public String title;
    public int tupian;

    public void setTupian(int tupian) {
        this.tupian = tupian;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Bean(int tupian) {
        this.tupian = tupian;
    }

    public Bean(String title, int tupian) {
        this.title = title;
        this.tupian = tupian;
    }
    public int getTupian() {
        return tupian;
    }

    public String getTitle() {
        return title;
    }
}
