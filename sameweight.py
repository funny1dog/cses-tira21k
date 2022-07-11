class SameWeight:
    def __init__(self,n):
        # TODO

    def add_edge(self,a,b,x):
        # TODO

    def check(self):
        # TODO

if __name__ == "__main__":
    s = SameWeight(4)
    s.add_edge(1,2,2)
    s.add_edge(1,3,3)
    print(s.check()) # True
    s.add_edge(1,4,3)
    print(s.check()) # True
    s.add_edge(3,4,3)
    print(s.check()) # True
    s.add_edge(2,4,1)
    print(s.check()) # False
