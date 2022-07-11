class GraphGame:
    def __init__(self,n):
        # TODO

    def add_link(self,a,b):
        # TODO

    def winning(self,x):
        # TODO

if __name__ == "__main__":
    g = GraphGame(6)
    g.add_link(3,4)
    g.add_link(1,4)
    g.add_link(4,5)
    print(g.winning(3)) # False
    print(g.winning(1)) # False
    g.add_link(3,1)
    g.add_link(4,6)
    g.add_link(6,5)
    print(g.winning(3)) # True
    print(g.winning(1)) # False
    print(g.winning(2)) # False
