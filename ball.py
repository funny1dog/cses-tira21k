class Ball:
    def __init__(self,n):
        # TODO

    def add_pair(self,a,b):
        # TODO

    def calculate(self):
        # TODO

if __name__ == "__main__":
    b = Ball(4)
    print(b.calculate()) # 0
    b.add_pair(1,2)
    print(b.calculate()) # 1
    b.add_pair(1,3)
    b.add_pair(3,2)
    print(b.calculate()) # 2
