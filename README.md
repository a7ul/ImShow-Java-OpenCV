ImShow-Java-OpenCV
==================

An alternative to imshow() in C++ OpenCV for Java OpenCV.
Basically helps to display the Mat images or Video in the Java - Opencv
which lacks imshow like API from C++ Opencv interface.

Usage:
---------
Simply Add the Imshow.jar or the project to the build path of your Project

API:
------
Imshow im = new Imshow("Title");

im.showImage(Mat mat); // This will display the mat Image in the GUI


See the example for understanding it better:
example: Displaying the Video From the WebCam

For ways to customise the GUI Frame or Window see the example.




Credits / Special Thanks: 
-------------------------
Daniel Baggio and sutr90 for improvements

Note:
-----

** Please make sure OpenCV is also in the build path




TroubleShoot: 
-------------
1. Make sure that opencv is in your build path.

2. If you get an error like this: 
Exception in thread "main" java.lang.UnsatisfiedLinkError: no opencv_java248 in java.library.path

Please configure your build path .
In the build path , under libraries -> opencv-248.jar -> set your native library location to : .../opencv2.4.8/release/lib

