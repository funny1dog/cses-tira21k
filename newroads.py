class NewRoads:
    def __init__(self,n):
        # TODO

    def add_road(self,a,b,x):
        # TODO

    def min_cost(self):
        # TODO

if __name__ == "__main__":
    n = NewRoads(4)
    n.add_road(1,2,2)
    n.add_road(1,3,5)
    print(n.min_cost()) # -1
    n.add_road(3,4,4)
    print(n.min_cost()) # 11
    n.add_road(2,3,1)
    print(n.min_cost()) # 7
