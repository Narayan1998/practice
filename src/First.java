import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class First {
    public static void main(String[] args) {
        ArrayList<Movie> al = new ArrayList<>();
        al.add(new Movie(5.6f, "Sanjay", 2005));
        al.add(new Movie(4.3f, "narayan", 2022));
        al.add(new Movie(8.6f, "apple", 2001));
        al.add(new Movie(3.9f, "banana", 1998));
        al.add(new Movie(6.2f, "abc", 2009));

        Year year = new Year();
        Collections.sort(al, year);
        for(Movie m : al){
            System.out.println(m.getName() +" "+ m.getYear()+" "+ m.getRating());
        }

        Rating rating = new Rating();
        Collections.sort(al, rating);

        System.out.println();

        //System.out.println(al);

        //Collections.sort(al);
        for(Movie m : al){
            System.out.println(m.getName() +" "+ m.getYear()+" "+ m.getRating());
        }
    }
}
class Movie implements Comparable<Movie> , Comparator<Movie> {
    private final float rating;
    private final String name;
    private final int year;

    public Movie(float rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public float getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.year > o2.year)
            return 1;
        else if (o1.year < o2.year)
            return -1;
        return 0;
    }
}
class Year implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getYear() > o2.getYear())
            return 1;
        else if (o1.getYear() < o2.getYear())
            return -1;
        return 0;
    }
}
class Rating implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating() > o2.getRating())
            return 1;
        else if (o1.getRating() < o2.getRating())
            return -1;
        return 0;
    }
}

