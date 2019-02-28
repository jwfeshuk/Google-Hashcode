package HashCode;

public class Photo {
	
	private int id;
	private boolean isVertical;
	private String[] tags;
	
	public Photo(int id, boolean isVertical, String[] tags) {
		this.id = id;
		this.isVertical = isVertical;
		this.tags= tags;
	}
	
	public boolean getIsVertical() {
		return this.isVertical;
	}
	
	public int getId() {
		return this.id;
	}
	
}
