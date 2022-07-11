class LongPath:
    def __init__(self,n):
        # TODO

    def add_edge(self,a,b):
        # TODO

    def calculate(self):
        # TODO

if __name__ == "__main__":
    l = LongPath(4)
    l.add_edge(1,2)
    l.add_edge(1,3)
    l.add_edge(2,4)
    l.add_edge(3,4)
    print(l.calculate()) # 2
    l.add_edge(3,2)
    print(l.calculate()) # 3
