import org.opencv.core.*;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import static org.opencv.highgui.HighGui.*;
import org.opencv.imgproc.Imgproc;

public class Main {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //code won't compile without this line.
        Mat frame = new Mat();
        VideoCapture capture = new VideoCapture(0);
        CascadeClassifier face = new CascadeClassifier("C:\\Users\\mshah\\IntelliJ Projects\\java-cv\\.cascade\\face-cascade.xml");
        MatOfRect coordinates = new MatOfRect();
        while(true){
            capture.read(frame);
            face.detectMultiScale(frame, coordinates, 1.1, 5);
            if(!coordinates.empty()) {
                Imgproc.rectangle(frame, coordinates.toList().get(0), new Scalar(255, 0, 0), 1, 8, 0);
                System.out.println("face detected");
            }
            else{
                System.out.println("searching for faces");
            }
            imshow("frame", frame);
            int keyPress = waitKey(10);
            if(keyPress > 0){
                System.exit(0);
            }
        }
    }
}