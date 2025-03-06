package activities;

class Activity5 {
	public static void main(String[] args) {
        String title = "Harrypotter";
        Book obj = new MyBook();
        obj.setTitle(title);
        System.out.println("The title is: " + obj.getTitle());
	}

}

abstract class Book {
	String title;
	abstract void setTitle(String s);
    public String getTitle() {
		return title;
	}
}

	class MyBook extends Book {
		public void setTitle(String s) {
			title = s;
		}
	}

