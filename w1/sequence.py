def generate(n):
    count = 1
    res = 11
    while count < n:
        res += 1
        if len(set(list(str(res)))) < len(str(res)):
            count += 1
    return res


if __name__ == "__main__":
    print(generate(1)) # 11
    print(generate(2)) # 22
    print(generate(3)) # 33
    print(generate(10)) # 100
    print(generate(123)) # 505
    print(generate(1000))