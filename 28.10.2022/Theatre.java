package pro1;
class movie{
	String movieName,starttime,endtime;
	void setMovie(String name,String strttime,String endtime){
		movieName=name;
		starttime=strttime;
		this.endtime=endtime;
	}
	void getMovie(){
		System.out.println("MovieName="+movieName+" \nStart time="+starttime+" \nEndtime="+endtime);
	}
}
public class Theatre {

	public static void main(String[] args) {
		movie movie=new movie();
		movie.setMovie("dil se dil tak", "6:00pm", "9:00pm");
		movie.getMovie();
	}

}
