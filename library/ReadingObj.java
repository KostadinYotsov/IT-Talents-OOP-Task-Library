package library;

import library.Library.IGroup;

public abstract class ReadingObj {
	
	enum TypeOfReadable {BOOK, MAGAZINE, MANUAL}
	
	private String title;
	private String publisher;
	TypeOfReadable type;
	
	public ReadingObj(TypeOfReadable type, String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
		this.type=type;
	}

	public TypeOfReadable getType() {
		return type;
	}

	public abstract IGroup getGroup();

	@Override
	public String toString() {
		return  title + " : " + publisher;
	}

	public String getTitle() {
		return title;
	}

}
