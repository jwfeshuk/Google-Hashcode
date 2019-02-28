package HashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numOfPhotos = scan.nextInt();
		
		List<Photo> photos = new ArrayList<Photo>();
		
		for (int i = 0; i < numOfPhotos; i++) {
			
			String orientation = scan.next();
			int numOfTags = scan.nextInt();
			
			String[] tags = new String[numOfTags];
			
			for (int j = 0; j < numOfTags; j++) {
				tags[j] = scan.next();
			}
			
			boolean isVert;
			if (orientation.equals("H")) {
				isVert = false;
			} else {
				isVert = true;
			}
			
			photos.add(new Photo(i, isVert, tags));
			
		}
		
		System.out.println(photos);
		
		scan.close();
		
		
		Slideshow createdSlideshow = new Slideshow(photos);
		createdSlideshow.createSlideshow();
		createdSlideshow.printSlideshow();

	}

}
