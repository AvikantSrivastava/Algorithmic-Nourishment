class Graph:

    def __init__(self, vertices):
        self.vertices = vertices
        self.graph = []

    def add_edge(self, source, destination, weight):
        self.graph.append([weight, source, destination])

    def show_graph(self):
        self.graph = sorted(self.graph, key=lambda item: item[0])
        [print(f'{i[1]} to {i[2]} weight is {i[0]}') for i in (self.graph)]

    def check(self, edge):
        # edge is list of [w, source, destination]
        source = edge[1]
        destination = edge[2]

        box = [item for sublist in self.graph[:][1:] for item in sublist]
        if (source and destination) in box:
            print('Yes')

        else:
            print('No')
        # if (source and destination) in [self.graph[i][1]for i in self.graph]:
        #     print('yes')
        # else:
        #     print('no')


g = Graph(4)
# g.add_edge(0, 1, 10)
# g.add_edge(0, 2, 6)
# g.add_edge(0, 3, 5)
# g.add_edge(1, 3, 15)
# g.add_edge(2, 3, 4)

g.add_edge(1, 2, 1)
g.add_edge(2, 3, 1)
g.add_edge(3, 4, 1)

g.show_graph()
