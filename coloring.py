class Coloring:
    def __init__(self,n):
        # TODO

    def add_edge(self,a,b):
        # TODO

    def check(self):
        # TODO

if __name__ == "__main__":
    c = Coloring(4)
    c.add_edge(1,2)
    c.add_edge(2,3)
    c.add_edge(3,4)
    c.add_edge(1,4)
    print(c.check()) # True
    c.add_edge(2,4)
    print(c.check()) # False
