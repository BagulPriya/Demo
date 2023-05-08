package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableProgram {
	public static void main(String[] args) {
		ArrayList<Movie>list=new ArrayList<Movie>();
		list.add(new Movie("pk",8.3,2015));
		list.add(new Movie("3 idiots",8.7,1997));
		list.add(new Movie("HaryPotter",8.8,1980));
		list.add(new Movie("vivaah",8.4,1983));
		Collections.sort(list);
		System.out.println("Movies after sorting  by year: ");
		for (Movie movie: list)
		{
			System.out.println(movie.getYear()+" " + movie.getMovieName()+ " " +
					movie.getRating());

		}
		System.out.println("-----------------");
		System.out.println("Sorted by Rating:");
		RatingCompare ratingCompare=new RatingCompare();
		Collections.sort(list,ratingCompare);
		for (Movie movie: list)
		{
			System.out.println(movie.getRating() + " " +movie.getMovieName()+ " "+
					movie.getYear());
		}
		System.out.println("-----------------");
		System.out.println("Sorted by name");
		NameCompare nameCompare=new NameCompare();
		Collections.sort(list,nameCompare);
		for (Movie movie: list)
		{
			System.out.println(movie.getMovieName()+ " " +
					movie.getRating() + " " +
					movie.getYear());
		}
	}





	public static class Movie implements Comparable<Movie>{
		private String movieName;
		private double Rating;
		private int year;

		public  int compareTo(Movie m){

			return this.year - m.year;
		}

		public Movie(String movieName, double rating, int year) {
			this.movieName = movieName;
			Rating = rating;
			this.year = year;
		}

		public String getMovieName() {
			return movieName;
		}

		public double getRating() {
			return Rating;
		}

		public int getYear() {
			return year;
		}
	}
	public static class RatingCompare implements Comparator<Movie>{
		@Override
		public int compare(Movie m1, Movie m2) {
			if(m1.getRating() > m2.getRating()) {
				return 1;
			}
			else if (m1.getRating() < m2.getRating()) {
				return -1;
			}
			else
			return 0;
		}
	}
	public static class NameCompare implements Comparator<Movie>{
		@Override
		public int compare(Movie m1,Movie m2){

			return m1.getMovieName().compareTo(m2.getMovieName());
		}



	}

}
