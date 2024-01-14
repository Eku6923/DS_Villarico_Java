import java.util.ArrayList;

public class AdjacencytList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> graph = new ArrayList<>();
        char[] nodes = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int numberOfNodes = 7;

        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add('B');
        graph.get(1).add('A');
        graph.get(1).add('C');
        graph.get(2).add('B');
        graph.get(2).add('D');
        graph.get(2).add('E');
        graph.get(3).add('C');
        graph.get(3).add('E');
        graph.get(3).add('F');
        graph.get(3).add('G');
        graph.get(4).add('C');
        graph.get(4).add('D');
        graph.get(4).add('F');
        graph.get(5).add('D');
        graph.get(5).add('E');
        graph.get(6).add('D');

        int displayIndex = 0;

        for (int i = 0; i < numberOfNodes; i++, displayIndex++) {
            System.out.println(nodes[displayIndex] + ": " + graph.get(i));
        }
    }
}