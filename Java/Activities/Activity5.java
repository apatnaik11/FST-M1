package activities;


abstract class Book{
	
	String Title;
	
	abstract  void setTitle(String name);
	
	String getTitle() {
		return Title;
	}
	
}


class MyBook extends Book{
	
	void setTitle(String name) {
		
		Title = name;
		
	}
	
}



public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book NewNovel = new MyBook();
		NewNovel.setTitle("It ends with us");
		
		System.out.println("The title of book is "+NewNovel.getTitle());
		
		

	}

}



