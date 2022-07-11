class Cities:
    def __init__(self,n):
        # TODO

    def add_road(self,a,b):
        # TODO

    def has_route(self,a,b):
        # TODO

if __name__ == "__main__":
    c = Cities(5)
    c.add_road(1,2)
    c.add_road(1,3)
    c.add_road(4,5)
    print(c.has_route(1,5)) # False
    c.add_road(3,4)
    print(c.has_route(1,5)) # True
