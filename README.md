ImShow-Java-OpenCV
==================

An alternative to imshow() in C++ OpenCV for Java OpenCV.
Basically helps to display the Mat images or Video in the Java - Opencv
which lacks imshow like API from C++ Opencv interface.

Usage:
---------
Simply Add the Imshow.jar or the project to your build path of the Project

API:
------
Imshow im = new Imshow("Title");

im.showImage(Mat mat); // This will display the mat Image in the GUI


See the example for understanding it better:
example: Displaying the Video From the WebCam

For ways to customise the GUI Frame or Window see the example.


Note:
-----

** Please make sure OpenCV is also in the build path
