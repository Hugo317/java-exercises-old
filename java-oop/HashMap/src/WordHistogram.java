import java.util.ArrayList;
import java.util.HashMap; // import the HashMap class


public class WordHistogram extends HashMap {

    private StringBuilder Sentence;
    private HashMap<String,Integer> histogram;

    public WordHistogram(StringBuilder sentence){

        this.Sentence = sentence;

    }

    public void createHistogram(){
        ArrayList<StringBuilder> string = new ArrayList();

        while(Sentence != null) {
            StringBuilder temp = new StringBuilder();
            if(Sentence.indexOf(" ") != -1) {
                temp.append(Sentence.substring(0, Sentence.indexOf(" ")));
                Sentence.delete(0, Sentence.indexOf(" "));
                Sentence.delete(0,1);
            }
            if(Sentence.indexOf(" ") == -1){
                temp = Sentence;
                Sentence = null;
            }
            string.add(temp);

            int counter = 0;

            for (int i = 0; i < string.size();i++){
                for (int j = 0; j < string.size() ; j++) {
                    if (string.get(i).toString().equals(string.get(j).toString())){
                        counter++;
                        if (counter > 1) string.remove(j);
                    }
                }
            counter = 0;
            }

        }
        System.out.println(string.toString());
        ArrayList<Integer> values = new ArrayList();

        for (int i = 0; i < string.size(); i++) {
            int counter = 0;
            ArrayList<Integer> arr = new ArrayList();

            for (int j = 0; j < string.size(); j++) {
                if (string.get(i).toString().equals(string.get(j).toString())) {
                    arr.add(j);
                    counter++;
                    if (counter > 1){
                        string.remove(j);
                    }
                }
            }

            values.add((Integer) counter);

        }
        System.out.println(values());
        for (int i = 0; i < values.size(); i++) {
            put(string.get(i).toString(),(Integer)values.get(i));
            System.out.println(histogram);
        }

    }


}
