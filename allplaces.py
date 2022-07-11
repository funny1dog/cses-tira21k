class AllPlaces:
    def __init__(self,n):
        # TODO

    def add_route(self,a,b):
        # TODO

    def check(self):
        # TODO

if __name__ == "__main__":
    a = AllPlaces(5)
    a.add_route(1,2)
    a.add_route(1,3)
    a.add_route(2,3)
    a.add_route(2,4)
    print(a.check()) # False
    a.add_route(2,5)
    print(a.check()) # False
    a.add_route(3,1)
    print(a.check()) # False
    a.add_route(5,4)
    print(a.check()) # True
