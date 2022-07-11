class Download:
    def __init__(self,n):
        # TODO

    def add_link(self,a,b,x):
        # TODO

    def calculate(self,a,b):
        # TODO

if __name__ == "__main__":
    d = Download(4)
    print(d.calculate(1,4)) # 0
    d.add_link(1,2,5)
    d.add_link(2,4,6)
    d.add_link(1,4,2)
    print(d.calculate(1,4)) # 7
    d.add_link(1,3,4)
    d.add_link(3,2,2)
    print(d.calculate(1,4)) # 8
