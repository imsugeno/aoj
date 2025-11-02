def main():
    n = int(input())
    target = list(map(int, input().split()))

    count = 0
    for i in range(n):
        for j in range(n-1,i,-1):
            if target[j-1] > target[j]:
                tmp = target[j]
                target[j] = target[j-1]
                target[j-1] = tmp
                count += 1
    print(*target)
    print(count)

if __name__ == "__main__":
    main()