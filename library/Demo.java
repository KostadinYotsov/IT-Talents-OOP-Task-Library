package library;

import java.time.LocalDate;

import library.Book.Ganre;
import library.Magazine.Category;
import library.Manual.Them;

public class Demo {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("East of Eden", "Slunce", "John Steinbeck", Ganre.LOVE_STORY, LocalDate.now());
		Book book2 = new Book("Inferno", "Slunce", "Dan Braun", Ganre.TRILLER, LocalDate.now());
		
		
		Magazine magazine1=new Magazine("Gosip", "Zora", Category.GOSIP, 14);
		Magazine magazine2=new Magazine("Beatiful", "Zora", Category.LIFE_STYLE, 1);
		
		Manual manual1=new Manual("Math for 5 class", "Slunce","akad. Ivan Georgiev" ,Them.MATH);
		Manual manual2=new Manual("Math for 3 class", "Zora","akad. Georgi Georgiev" ,Them.MATH);
		Manual manual3=new Manual("Biology for 6 clas", "Zora","prof. Ivan Ivanov" ,Them.BIOLOGY);
		
		Library biblioteka=new Library("Serdika");
		
		biblioteka.addReadingObject(book1);
		biblioteka.addReadingObject(book2);
		biblioteka.addReadingObject(magazine1);
		biblioteka.addReadingObject(magazine2);
		biblioteka.addReadingObject(manual1);
		biblioteka.addReadingObject(manual2);
		biblioteka.addReadingObject(manual3);
		
		biblioteka.printInfo();
		
	}
}
