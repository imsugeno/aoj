def main():
    n = int(input())
    target = list(map(int, input().split()))

    for i in range(len(target)):
        key = target[i]
        j = i - 1
        while j >= 0 and target[j] > key:
            target[j+1] = target[j]
            j -= 1
        target[j+1] = key
        print(*target)

if __name__ == "__main__":
    main()