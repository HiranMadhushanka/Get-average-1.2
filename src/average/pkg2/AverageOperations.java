package average.pkg2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AverageOperations {

    String s = "";

    double getAverage(ArrayList<Double> a) {
        double total = 0;
        if (a.size() > 1) {
            for (int i = 0; i < a.size(); i++) {
                total = total + a.get(i);
            }
            return total / a.size();

        }
        return 0;

    }

//    String showValues(ArrayList<Double> a, String b) {
//
//        String[] c = b.split("");
//        if (c.length != 1) {
//            if (a.size() == 0) {
//                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(null), "First enter a value and after click on the 'NEXT VALUE' button !");
//
//
//            } else if (a.size() != 1) {
//                s = s + " ," + a.get(a.size() - 1);
//
//            } else {
//                s = new Double(a.get(0)).toString();
//            }
//        }else{
//            
//        }
//        return s;
//
//    }
}
