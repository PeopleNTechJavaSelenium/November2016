package classNobject;

public class House {
	//variables
    public int address = 10;
	public String houseName;
	
	
	//constructor 1
	public House(){
	}
	//constructor 2
	public House(String houseName){
		this.houseName = houseName;
	}
	
	//constructor 3
	public House(String houseName, int address){
	 this.houseName = houseName;
		
	}
	
	//methods
	public void setHouseName(String houseName){
		this.houseName = houseName;
	}
	public void watchTVShows(){
		System.out.println("Watching Game of Thrones");
	}
	public void sleep(){
		System.out.println("People sleeps at bed room");
	}
	public int addHouseSize(int length, int height){
		int total = length + height;
		
		return total;
	}
	
}
