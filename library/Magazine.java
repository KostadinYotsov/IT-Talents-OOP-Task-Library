package library;

import library.Library.IGroup;

public class Magazine extends ReadingObj implements Comparable<Magazine> {
	
	enum Category implements IGroup { CIFI, GOSIP, LIFE_STYLE}
	
	private Category category;
	private int number;

	public Magazine(String title, String publisher, Category category, int number ) {
		super(TypeOfReadable.MAGAZINE,title, publisher);
		this.category=category;
		this.number=number;
		
	}


	@Override
	public IGroup getGroup() {
		return category;
	}


	@Override
	public int compareTo(Magazine o) {
		return this.category.compareTo(o.category);
	}


	
}
