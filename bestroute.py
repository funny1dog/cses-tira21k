class BestRoute:
    def __init__(self,n):
        # TODO

    def add_road(self,a,b,x):
        # TODO

    def find_route(self,a,b):
        # TODO

if __name__ == "__main__":
    b = BestRoute(3)
    b.add_road(1,2,2)
    print(b.find_route(1,3)) # -1
    b.add_road(1,3,5)
    print(b.find_route(1,3)) # 5
    b.add_road(2,3,1)
    print(b.find_route(1,3)) # 3
