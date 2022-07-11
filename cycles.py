class Cycles:
    def __init__(self,n):
        # TODO

    def add_edge(self,a,b):
        # TODO

    def check(self):
        # TODO

if __name__ == "__main__":
    c = Cycles(4)
    c.add_edge(1,2)
    c.add_edge(2,3)
    c.add_edge(1,3)
    c.add_edge(3,4)
    print(c.check()) # False
    c.add_edge(4,2)
    print(c.check()) # True
