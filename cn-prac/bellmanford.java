import java.util.*;
public class bellmanford{

    public static void bellmanford(int graph[][],int n,int start){
        int distance[]=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start]=0;

        for(int i=1;i<n;i++){
            for(int u=0;u<n;u++){
                for(int v=0;v<n;v++){
                    if(graph[u][v]!=0 && distance[u]!=Integer.MAX_VALUE && graph[u][v]+distance[u]<distance[v]){
                        distance[v]=distance[u]+graph[u][v];
                    }
                }
            }
        }

        for(int u=0;u<n;u++){
                for(int v=0;v<n;v++){
                    if(graph[v][u]!=0 && distance[u]!=Integer.MAX_VALUE && graph[u][v]+distance[u]<distance[v]){
                        System.out.println("negative cycle detected");
                    }
                }
            }

            for(int i=0;i<n;i++){
                System.out.println("Distance of " + ( i ) + " from Source(" + start +") is " + distance[i]);
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        int graph[][]=new int[n][n];
        System.out.println("Enter the adjacent matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the source vertex");
        int source=sc.nextInt();
        bellmanford(graph,n,source);
        sc.close();
}
}