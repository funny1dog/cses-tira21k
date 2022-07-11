def count(s):
    dic = dict()
    for i in range(len(s)):
        if s[i] in dic:
            dic[s[i]] += 1
        else:
            dic[s[i]] = 1
    res = 0
    for i in dic.values():
        res += (i + 1) * i // 2
    return res


if __name__ == "__main__":
    print(count("aaa")) # 6
    print(count("abcd")) # 4
    print(count("ababca")) # 10
