package library;

import java.time.LocalDate;

import library.Library.IGroup;

public class Book extends ReadingObj implements Comparable<Book>  {
	
	
	enum Ganre implements IGroup {ACTION, LOVE_STORY, TRILLER}
	
	private Ganre ganre;
	private String author;
	private LocalDate date;
	
	
	public Book(String title, String publisher, String author, Ganre ganre,LocalDate date) {
		super(TypeOfReadable.BOOK,title, publisher);
		this.author=author;
		this.ganre=ganre;
		this.date=date;
	}


	@Override
	public IGroup getGroup() {
		return ganre;
	}


	@Override
	public int compareTo(Book o) {
		return this.date.compareTo(o.date);
	}

}
