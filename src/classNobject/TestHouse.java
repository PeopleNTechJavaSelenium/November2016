package classNobject;

import office.OfficeSpace;

public class TestHouse {
	

	public static void main(String[] args) {
		   House myHouse = new House("whitehouse");
		   //myHouse.setHouseName("whitehouse");
		   System.out.println(myHouse.houseName);
	       myHouse.watchTVShows();
	       int totalSize = myHouse.addHouseSize(10, 15);
	       System.out.println(totalSize);
	       
	       OfficeSpace os = new OfficeSpace();
	       os.officeLocation();
	       
	      

	}

}
