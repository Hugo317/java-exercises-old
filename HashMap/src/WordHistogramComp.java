import java.util.ArrayList;

public class WordHistogramComp {

    private StringBuilder Sentence;

    public WordHistogramComp(StringBuilder sentence){

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


        }

        for (int i = 0; i < string.size(); i++) {
            int counter = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int j = 0; j < string.size(); j++) {
                if (string.get(i).toString().equals(string.get(j).toString())) {
                    arr.add(j);
                    counter++;
                    if (counter > 1){
                        string.remove(j);
                    }
                }
            }
                    System.out.println(string.get(i) + " : " + counter);
                    //string.remove(string.indexOf(j));


        }
    }
}
