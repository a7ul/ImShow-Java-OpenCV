package examples;

import com.atul.JavaOpenCV.Imshow;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

public class example {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		/*
		 * Declare a New Frame Here -------------------------
		 */
		Imshow im = new Imshow("Video Preview");
		// This create a Window with Title Video Preview and is autoSized to the image it contains
		// or
		// new Imshow("Title",int Height,int Width); to set custom height and width 
		
		  
		 
		/* You can even Customise the ImShow Frame or Window 
		 * The image is loaded onto a JFrame which is a public member 
		 * so that anyone could customise it
		 * Imshow.Window is the JFrame that one could customise
		 * For example : 
		 * By default the Window is not Resizable so to make it resizable:
		 */
			im.Window.setResizable(true);
		// -------------------------
		Mat m = new Mat();
		VideoCapture vcam = new VideoCapture(0);
		
		// loop until VideoCamera is Available
		while (vcam.isOpened() == false)
			;

		// Bug Fix: Loop until initial image frames are empty
		while (m.empty()) {
			vcam.retrieve(m);
			
		}

		while (true) {
			
			vcam.retrieve(m);
			/***
			 * Show the image
			 */
			//System.out.println(m.dump());
			im.showImage(m);
			/************/
		}
	}

}
