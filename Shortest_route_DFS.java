public class Graph {
   public static final int minimumCost  = Integer.MAX_VALUE / 2;

   public static int findShortestRoute(int[][] graph){
       boolean[] visited = new boolean[graph.length]; // array pt confirmarea vizitarii oraselor,marcat initial cu false
       int startingCity = 0;
       visited[startingCity] = true;
       searchRoute(
               graph,
               startingCity,
               startingCity,
               visited,
               1,
               0
       );
   }

   public static void searchRoute(int graph[][],
                                  int startingCity,
                                  int currentCity,
                                  int[] visited,
                                  int visitedCitiesCount,
                                  int currentCost){
       if(visitedCitiesCount == graph.length){
           int returnCost = graph[currentCity][startingCity];
           int totalCost = returnCost + currentCost;
           return Math.min(minimumCost,totalCost);
       }
       for(int nextCity = 0; nextCity < graph.length; nextCity++){
           if(!visited[nextCity]){
               visited[nextCity] = true;
               searchRoute(
                       graph,
                       startingCity,
                       nextCity,
                       visited,
                       visitedCitiesCount + 1,
                       currentCost + graph[currentCity][nextCity]
               );
                visited[nextCity] = false;
           }
       }

   }
}
