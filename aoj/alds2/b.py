def main():
    n = int(input())
    target = list(map(int, input().split()))

    target, count = selection_sort(n, target)

    print(*target)
    print(count)

def selection_sort(n, target):
    count = 0

    for i in range(n):
        min_index = i
        for j in range(i, n):
            if target[j] < target[min_index]:
                min_index = j
        if min_index != i:
            tmp = target[i]
            target[i] = target[min_index]
            target[min_index] = tmp
            count += 1

    return target, count

if __name__ == "__main__":
    main()