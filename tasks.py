class Tasks:
    def add(self, name, priority):
        # TODO

    def next(self):
        # TODO

if __name__ == "__main__":
    t = Tasks()
    t.add("siivous",10)
    t.add("ulkoilu",50)
    t.add("opiskelu",50)
    print(t.next()) # opiskelu
    t.add("treffit",100)
    print(t.next()) # treffit
    print(t.next()) # ulkoilu
