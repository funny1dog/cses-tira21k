def count(n):
    res = 0
    for i in range(n+1):
        res += i
    return res

if __name__ == "__main__":
    print(count(1)) # 1
    print(count(2)) # 3
    print(count(3)) # 6
    print(count(10)) # 55
    print(count(123)) # 7626