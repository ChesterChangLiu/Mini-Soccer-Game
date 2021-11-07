package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerCollectionIterator.
 */
//The iterator that allows to iterate in PlayerCollection
public class PlayerCollectionIterator  implements Iterator<PlayerCollection>{
	
	/** The elem. */
	private List<PlayerCollection> elem  = null;
	
	/** The size. */
	private int size = 0;
	
	/** The curror. */
	private int curror = -1;

	/**
	 * Instantiates a new player collection iterator.
	 */
	public PlayerCollectionIterator(){
		this.elem = new ArrayList<>();
	}
	
	/**
	 * Adds the.
	 *
	 * @param playerCollection the player collection
	 */
	public void add(PlayerCollection playerCollection) {
		elem.add(playerCollection);
	}
	 
	/**
	 * Iterator.
	 *
	 * @return the iterator
	 */
	public Iterator<PlayerCollection> iterator() {
		// TODO Auto-generated method stub
		return elem.iterator();
	}
	
	/**
	 * Checks for next.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return curror+1 < size; //point to the next element
	}

	/**
	 * Next.
	 *
	 * @return the player collection
	 */
	@Override
	public PlayerCollection next() {
		// TODO Auto-generated method stub
		curror++;
		return this.elem.get(curror);

	}

}
