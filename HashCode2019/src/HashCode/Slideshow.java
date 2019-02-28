package HashCode;

import java.util.ArrayList;
import java.util.List;

public class Slideshow {

	private List<Photo> photoList = new ArrayList<Photo>();
	private List<Slide> slideList = new ArrayList<Slide>();
	
	
	public Slideshow(List<Photo> photos) {
		this.photoList = photos;
	}
	
	public void createSlideshow() {
		
		while (photoList.size() > 1) {

			if (photoList.get(0).getIsVertical()) {
				if (photoList.get(1).getIsVertical()) {
					slideList.add(new Slide(photoList.get(0), photoList.get(1)));
					photoList.remove(0);
					photoList.remove(0);
				} else {
					slideList.add(new Slide(photoList.get(0)));
					photoList.remove(0);
				}
			} else {
				slideList.add(new Slide(photoList.get(0)));
				photoList.remove(0);
			}
		}
		
		if (photoList.size() == 1) {
			slideList.add(new Slide(photoList.get(0)));
			photoList.remove(0);
		}
		
		
		
	}
	
	public void printSlideshow() {
		System.out.println(slideList.size());
		for (Slide slide: slideList) {
			
			if (slide.getPhotos().length == 1) {
				System.out.println(slide.getPhotos()[0].getId());
			} else {
				System.out.println(slide.getPhotos()[0].getId() + " " + slide.getPhotos()[1].getId());
			}
			
		}
	}
	
}
