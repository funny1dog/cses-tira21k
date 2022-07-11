class AllRoutes:
    def __init__(self,n):
        # TODO

    def add_road(self,a,b,x):
        # TODO

    def get_table(self):
        # TODO

if __name__ == "__main__":
    a = AllRoutes(4)
    a.add_road(1,2,2)
    a.add_road(1,3,5)
    a.add_road(2,3,1)
    print(a.get_table())
    # [[0,2,3,-1],[2,0,1,-1],[3,1,0,-1],[-1,-1,-1,0]]
