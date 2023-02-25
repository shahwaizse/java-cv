import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import static org.opencv.highgui.HighGui.*;
import org.opencv.core.*;

public class Main {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //code won't compile without this line.
        Mat frame = new Mat();
        VideoCapture capture = new VideoCapture(0);
        while(true){
            capture.read(frame);
            imshow("oogabooga", frame);
            int keyPress = waitKey(1);
            if(keyPress > 0){
                System.exit(0);
            }
        }
    }
}