import sys


class Graph():
    def __init__(self, n, Directred=False):
        self.N = n
        self.Directred = Directred
        self.graph = [
            [0 for column in range(n)]
            for row in range(n)
        ]

    def add_edge(self, source, destination, weight):
        if source > self.N or destination > self.N:
            print('Edge not valid')
        self.graph[source][destination] = weight

        if not self.Directred:
            self.graph[destination][source] = weight

    def show_graph(self):

        print()
        print('\t GRAPH \n')

        for row in self.graph:
            for column in row:
                print(f'{column}\t', end='')
            print()
        print()

    def print_node_distance(self, source, distance):
        print(f'\t Distance of Source node {source} from all other nodes \n')
        for node in range(self.N):
            print(node, "\t---->\t", distance[node])

    def nearest_vertex(self, distance, track):
        MIN = sys.maxsize

        for v in range(self.N):
            if not (track[v]) and distance[v] < MIN:
                MIN = distance[v]
                vertex = v
        return vertex

    def dijkstra(self, source):
        distance = [sys.maxsize] * self.N
        distance[source] = 0
        track = [False] * self.N

        for _ in range(self.N):
            start = self.nearest_vertex(distance, track)
            track[start] = True

            for end in range(self.N):
                edge = self.graph[start][end]

                if edge > 0 and not track[end] and distance[end] > distance[start] + edge:
                    distance[end] = distance[start] + edge

        self.show_graph()
        self.print_node_distance(source, distance)


if __name__ == '__main__':

    graph = Graph(6, Directred=False)

    graph.add_edge(1, 2, 16)
    graph.add_edge(2, 5, 3)
    graph.add_edge(5, 4, 2)
    graph.add_edge(3, 4, 6)
    graph.add_edge(1, 3, 11)
    graph.add_edge(0, 2, 8)
    graph.add_edge(0, 5, 4)
    graph.add_edge(0, 4, 8)

    # graph.show_graph()

    graph.dijkstra(0)
