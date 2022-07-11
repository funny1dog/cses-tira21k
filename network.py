class Network:
    def __init__(self,n):
        # TODO

    def add_link(self,a,b):
        # TODO

    def best_route(self,a,b):
        # TODO

if __name__ == "__main__":
    w = Network(5)
    w.add_link(1,2)
    w.add_link(2,3)
    w.add_link(1,3)
    w.add_link(4,5)
    print(w.best_route(1,5)) # -1
    w.add_link(3,5)
    print(w.best_route(1,5)) # 2
