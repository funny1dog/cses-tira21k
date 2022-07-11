def calculate(s):
    i = 0
    while s[i] != '1':
        i += 1
    j = i + 1
    ans = 0
    while j < len(s):
        if s[j] == "0":
            j += 1
        else:
            ans = ans * 2 + j - i
            i = j
            j += 1
    return ans


if __name__ == "__main__":
    print(calculate("10110")) # 6
    print(calculate("10")) # 0
    print(calculate("10010110")) # 20
    print(calculate("0011110111101010")) # 214