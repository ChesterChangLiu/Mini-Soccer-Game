package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//The iterator that allows to iterate in PlayerCollection
public class PlayerCollectionIterator  implements Iterator<PlayerCollection>{
	private List<PlayerCollection> elem  = null;
	private int size = 0;
	private int curror = -1;

	public PlayerCollectionIterator(){
		this.elem = new ArrayList<>();
	}
	
	public void add(PlayerCollection playerCollection) {
		elem.add(playerCollection);
	}
	 
	public Iterator<PlayerCollection> iterator() {
		// TODO Auto-generated method stub
		return elem.iterator();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return curror+1 < size; //point to the next element
	}

	@Override
	public PlayerCollection next() {
		// TODO Auto-generated method stub
		curror++;
		return this.elem.get(curror);

	}

}
