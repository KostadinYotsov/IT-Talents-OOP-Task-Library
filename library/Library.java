package library;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import library.ReadingObj.TypeOfReadable;

public class Library {
	
	public interface IGroup {
		
	}

	private String name;
	private HashMap<TypeOfReadable, HashMap<IGroup, TreeSet<ReadingObj>>> kartoteka;
	
	public Library(String name) {
		this.name = name;
		kartoteka=new HashMap<>();
	}
	
	public void addReadingObject (ReadingObj r) {
		TypeOfReadable type=r.getType();
		IGroup group=r.getGroup();
		if (!kartoteka.containsKey(type)) {
			kartoteka.put(type, new HashMap<>());
		}
		if (!kartoteka.get(type).containsKey(group)) {
			kartoteka.get(type).put(group, new TreeSet<>());
		}
		kartoteka.get(type).get(group).add(r);
	}
	
	public void printInfo () {
		for (Entry<TypeOfReadable, HashMap<IGroup, TreeSet<ReadingObj>>> e : kartoteka.entrySet()) {
			System.out.println( e.getKey() + " : ");
			HashMap<IGroup, TreeSet<ReadingObj>> map=e.getValue();
			for (Entry<IGroup, TreeSet<ReadingObj>> e1 : map.entrySet()) {
				System.out.println("======== " + e1.getKey() + " ========");
				TreeSet<ReadingObj> set=e1.getValue();
				for (ReadingObj r : set) {
					System.out.println(r);
				}
			}
			System.out.println();
		}
	}
	
}
