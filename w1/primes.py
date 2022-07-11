from math import sqrt
def count(n):
    total = 0
    for i in range(2, n + 1):
        flag = False
        for j in range(2, int(sqrt(i)+1)):
            if i % j == 0:
                flag = True
        if not flag:
            total += 1
    return total


if __name__ == "__main__":
    print(count(2)) # 1
    print(count(10)) # 4
    print(count(11)) # 5
    print(count(100)) # 25
    print(count(1000)) # 168