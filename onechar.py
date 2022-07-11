def count(s):
    i = 0
    j = 1
    res = 0
    while j < len(s):
        if s[i] == s[j]:
            j += 1
        else:
            n = j - i
            res += n *(n + 1) // 2
            i = j
    if j == len(s):
        res += (j - i) * (j - i + 1) // 2
    return res


if __name__ == "__main__":
    print(count("aaa")) # 6
    print(count("abbbcaa")) # 11
    print(count("abcde")) # 5
