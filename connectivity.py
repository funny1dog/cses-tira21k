class Connectivity:
    def __init__(self,n):
        # TODO

    def add_edge(self,a,b):
        # TODO

    def count(self):
        # TODO

if __name__ == "__main__":
    c = Connectivity(5)
    print(c.count()) # 4
    c.add_edge(2,4)
    c.add_edge(3,5)
    print(c.count()) # 2
    c.add_edge(2,3)
    c.add_edge(3,4)
    print(c.count()) # 1
    c.add_edge(1,2)
    print(c.count()) # 0
