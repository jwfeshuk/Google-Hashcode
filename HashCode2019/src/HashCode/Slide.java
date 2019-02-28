package HashCode;

public class Slide {

	private Photo[] photos;
	
	public Slide(Photo photo) {
		photos = new Photo[] {photo};
	}
	
	public Slide(Photo photo1, Photo photo2) {
		photos = new Photo[] {photo1, photo2};
	}
	
	public Photo[] getPhotos() {
		return photos;
	}
	
}
