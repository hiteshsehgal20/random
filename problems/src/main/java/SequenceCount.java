import java.util.ArrayList;
import java.util.List;

public class SequenceCount {

    List<List<String>> output;

    public List<List<String>> getSequence(String inputString) {
        output = new ArrayList<>();
        String[] stringChars = inputString.split(" ");
        boolean seq = false;
        int len = stringChars.length;
        if (stringChars.length == 0 || stringChars.length == 1) {
            return output;
        }
        List<String> seqList = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            try {
                if (Integer.parseInt(stringChars[i]) - Integer.parseInt(stringChars[i - 1]) == 1) {
                    if (!seqList.contains(stringChars[i - 1])) {
                        seqList.add(stringChars[i - 1]);
                    }
                    seqList.add(stringChars[i]);
                    if (i == len - 1) {
                        output.add(seqList);
                    }
                } else if (!seqList.isEmpty()) {
                    output.add(seqList);
                    seqList = new ArrayList<>();
                }
            } catch (NumberFormatException nfe) {
                if (!seqList.isEmpty()) {
                    output.add(seqList);
                }
                seqList = new ArrayList<>();
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "1 2 3 4 c b 4 5 6";
        SequenceCount sequenceCount = new SequenceCount();
        List<List<String>> result = sequenceCount.getSequence(input);
        int longest = result.get(0).size();
        for (List<String> c : result) {
            if (c.size() > longest) {
                longest = c.size();
            }
        }
        int streamTest = result.stream().mapToInt(List::size).max().getAsInt();
        System.out.println("StreamTest" + streamTest);
        System.out.println(result + " " + result.size());
        System.out.println(longest);
    }
}
