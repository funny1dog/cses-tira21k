class FlipList:
    def push_last(self,x):
        # TODO

    def push_first(self,x):
        # TODO

    def pop_last(self):
        # TODO

    def pop_first(self):
        # TODO

    def flip(self):
        # TODO

if __name__ == "__main__":
    f = FlipList()
    f.push_last(1)
    f.push_last(2)
    f.push_last(3)
    print(f.pop_first()) # 1
    f.flip()
    print(f.pop_first()) # 3
