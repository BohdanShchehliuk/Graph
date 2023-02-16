public class Graph {
    // розмір масиву
    private int maxN = 10;
    private int[][] mas;
    // перелік вершин
    Vertex[] vertexList;
    // поточна вершина
    private int curN;

    private MyStack stack = new MyStack();

    // ініціалізація графа
    public Graph() {
        vertexList = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }

    // додаєм вершини
    public void addVertex(char name) {
        vertexList[curN++] = new Vertex(name);
    }

    // додаємо ребра
    public void addEdge(int start, int end, int val) {
        mas[start][end] = 1;
        mas[end][start] = val;
    }

    public int check(int v) {
        for (int i = 0; i < curN; i++) {
            if (mas[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }

        return -1;
    }
public void passInDeep (int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);
while (!stack.isEmpty()) {
    int neighbor = check(stack.peak());
if (neighbor ==-1){
    neighbor =stack.pop();
} else {
    System.out.println(vertexList[neighbor].name);
    vertexList[neighbor].isVisited = true;
    stack.push(neighbor);
}
}
 for (int i = 0; i<curN; i++) {
     vertexList[i].isVisited = false;
 }
}

}
