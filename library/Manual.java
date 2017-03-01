package library;

import library.Library.IGroup;

public class Manual extends ReadingObj implements Comparable<Manual>{
	
	enum Them implements IGroup {MATH, GEOGRAPHY, BIOLOGY}
	
	private String author;
	private Them them;

	public Manual(String title, String publisher, String author, Them them) {
		super(TypeOfReadable.MANUAL,title, publisher);
		this.them=them;
		this.author=author;
	
	}

	@Override
	public IGroup getGroup() {
		return them;
	}

	@Override
	public int compareTo(Manual o) {
		return this.getTitle().compareTo(o.getTitle());
	}

}
