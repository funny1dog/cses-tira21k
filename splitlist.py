def count(t):
    n = len(t)
    maxs = [0 for _ in range(n)]
    maxs[0] = t[0]
    mins = [10**9 for _ in range(n)]
    mins[-1] = t[-1]
    for i in range(1, n):
        maxs[i] = max(maxs[i-1], t[i])

    for i in range(n-2, -1, -1):
        mins[i] = min(mins[i+1], t[i])

    # print(mins)
    # print(maxs)
    count = 0
    for i in range(n-1):
        if maxs[i] < mins[i+1]:
            count += 1
    return count


if __name__ == "__main__":
    print(count([1,2,3,4,5])) # 4
    print(count([5,4,3,2,1])) # 0
    print(count([2,1,2,5,7,6,9])) # 3
    print(count([1,2,3,1])) # 0
    print(count([9, 6, 10, 10, 3, 6, 7, 6, 5, 7])) # 0
